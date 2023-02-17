package com.ggstream.service;


import com.ggstream.entity.TradeRecord;
import com.ggstream.entity.Wallet;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


public interface WalletService {

    public Wallet getWalletByUserCode(String userCode);

    public Wallet consume(Wallet wallet, BigDecimal amount);

    public Wallet refund(Wallet wallet, BigDecimal amount);
    public Wallet getByCode(String walletCode);

}
