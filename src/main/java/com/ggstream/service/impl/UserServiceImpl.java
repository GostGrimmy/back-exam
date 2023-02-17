package com.ggstream.service.impl;

import cn.hutool.core.lang.Assert;
import com.ggstream.entity.TradeRecord;
import com.ggstream.entity.Wallet;
import com.ggstream.service.TradeRecordeService;
import com.ggstream.service.UserService;
import com.ggstream.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private TradeRecordeService tradeRecordeService;

    @Autowired
    private WalletService walletService;


    /**
     * 查询余额
     * 一般这里不用传参可以从网关那里获取用户，但是演示的话，传用户编号
     * @param userCode 用户编号
     * @return 用户余额
     */
    public BigDecimal queryBalance(String userCode) {
        Wallet wallet = walletService.getWalletByUserCode(userCode);
        Assert.notNull(wallet, "查询数据为空");
        return wallet.getBalance();
    }

    /**
     * 消费余额
     *
     */
    @Transactional
    public BigDecimal consumeMoney(String userCode, BigDecimal amount) {
        Wallet wallet = walletService.getWalletByUserCode(userCode);
        //生成一笔交易记录
        TradeRecord tradeRecord = tradeRecordeService.generateConsume(wallet, userCode, amount);
        //钱包扣款
        wallet.setBalance(tradeRecord.getTradeAfter());
        walletService.consume(wallet, amount);
        //更新交易信息
        tradeRecordeService.finishTrade(tradeRecord);
        return wallet.getBalance();
    }

    /**
     * 充值，只生成交易记录
     * @param userCode 用户编号
     * @param amount 交易额
     * @return 本次交易后所剩余额
     */
    @Override
    public BigDecimal refund(String userCode, BigDecimal amount) {
        Wallet wallet = walletService.getWalletByUserCode(userCode);
        //生成一笔交易记录
        TradeRecord tradeRecord = tradeRecordeService.generateRecharge(wallet, userCode, amount);
        //钱包扣款
        wallet.setBalance(tradeRecord.getTradeAfter());
        //通知银行或知付宝扣款，之后异步调用
        //略
        return wallet.getBalance();
    }

    /**
     * 充值，真正改变数据，由第三方调用，实际会传递交易码，演示直接用交易编号
     * @param recordCode 交易编号
     * @return 交易后的余额
     */

    @Transactional
    public BigDecimal refundAsync(String recordCode) {
        TradeRecord tradeRecord = tradeRecordeService.getByCode(recordCode);
        //更改充值钱包
        String walletCode = tradeRecord.getWalletCode();
        Wallet wallet = walletService.getByCode(walletCode);
        walletService.refund(wallet, tradeRecord.getTradeAmount());
        //更新交易信息
        tradeRecord.setStatus(TradeRecord.SUCCEED);
        tradeRecordeService.finishTrade(tradeRecord);
        return tradeRecord.getTradeAfter();
    }

}
