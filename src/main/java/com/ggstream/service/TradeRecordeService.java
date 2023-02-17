package com.ggstream.service;


import com.ggstream.entity.TradeRecord;
import com.ggstream.entity.Wallet;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;


public interface TradeRecordeService {
    /**、
     * 根据用户查询交易记录
     * @param userCode
     * @return
     */

    List<TradeRecord> getByUserCode(String userCode);

    /**
     * 生成扣款
     * @param wallet
     * @param userCode
     * @param amount
     * @return
     */
    TradeRecord generateConsume(Wallet wallet, String userCode, BigDecimal amount);

    TradeRecord generateRecharge(Wallet wallet, String userCode, BigDecimal amount);

    /**
     * 完成交易
     * @param tradeRecord
     * @return
     */
    TradeRecord finishTrade(TradeRecord tradeRecord);

    TradeRecord getByCode(String recordCode);
}
