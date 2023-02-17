package com.ggstream.service.impl;

import com.ggstream.entity.TradeRecord;
import com.ggstream.entity.Wallet;
import com.ggstream.mapper.WalletMapper;
import com.ggstream.service.TradeRecordeService;
import com.ggstream.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class WalletServiceImpl implements WalletService {
    @Autowired
    WalletMapper walletMapper;

    @Autowired
    private TradeRecordeService tradeRecordService;
    public Wallet getWalletByUserCode(String userCode) {
        Wallet query = new Wallet();
        query.setUserCode(userCode);
        return walletMapper.queryWalletLimit1(query);
    }

    public Wallet getByCode(String walletCode) {
        Wallet query = new Wallet();
        query.setWalletCode(walletCode);
        return walletMapper.queryWalletLimit1(query);
    }
    @Override
    public Wallet consume(Wallet wallet, BigDecimal amount) {
        BigDecimal subtract = wallet.getBalance().subtract(amount);
        if (subtract.compareTo(new BigDecimal(0))<0) {
            throw new RuntimeException(" 消费失败，提醒：本次消费余额不足！");
        }
        wallet.setBalance(subtract);
        walletMapper.updateWallet(wallet);
        return wallet;
    }

    @Override
    public Wallet refund(Wallet wallet, BigDecimal amount) {
        BigDecimal add = wallet.getBalance().add(amount);
        wallet.setBalance(add);
        walletMapper.updateWallet(wallet);
        return wallet;
    }
}
