package com.ggstream.entity.factory;

import com.ggstream.entity.TradeRecord;
import com.ggstream.entity.User;
import com.ggstream.entity.Wallet;
import com.ggstream.utils.KeyUtils;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TradeRecordFactory {

    /**
     * 生成TradeRecord类，id本来要主键生成器生成，演示则让mysql自增生成。
     * @param wallet 钱包
     * @param user 用户
     * @param amount 金额
     * @return TradeRecord类
     */
   public static TradeRecord newTradeRecord(Wallet wallet, User user, BigDecimal amount) {
       TradeRecord tradeRecord = new TradeRecord();
       tradeRecord.setUserCode(user.getUserCode());
       tradeRecord.setWalletCode(wallet.getWalletCode());
       tradeRecord.setTradeBefore(wallet.getBalance());
       tradeRecord.setTradeAmount(amount);
       tradeRecord.setRecodeCode(KeyUtils.generateKey());
       tradeRecord.setCreateTime(LocalDate.now());
       tradeRecord.setType(TradeRecord.EXTERNAL_RECHARGE);
       tradeRecord.setStatus(TradeRecord.IN_PROGRESS);
       return tradeRecord;
   }
}
