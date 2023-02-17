package com.ggstream.service.impl;

import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.ObjUtil;
import cn.hutool.core.util.StrUtil;
import com.ggstream.entity.TradeRecord;
import com.ggstream.entity.User;
import com.ggstream.entity.Wallet;
import com.ggstream.entity.factory.TradeRecordFactory;
import com.ggstream.mapper.TradeRecordMapper;
import com.ggstream.service.TradeRecordeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.List;

@Service
public class TradeRecordServiceImpl implements TradeRecordeService {
    @Autowired
    private TradeRecordMapper tradeRecordMapper;

    /**
     * 通过用户获取交易记录
     * @param userCode 用户编号
     * @return 交易记录
     */
    public List<TradeRecord> getByUserCode(String userCode) {
        Assert.isTrue(StrUtil.isNotBlank(userCode), "查询条件不能为空");
        TradeRecord query = new TradeRecord();
        query.setUserCode(userCode);
        List<TradeRecord> tradeRecords = tradeRecordMapper.queryTradeRecord(query);
        return tradeRecords;
    }

    /**
     * 生成扣款记录
     * @param wallet 钱包
     * @param userCode 用户编号
     * @param amount 金额
     * @return 交易记录
     */
    @Override
    public TradeRecord generateConsume(Wallet wallet, String userCode, BigDecimal amount) {
        Assert.isTrue(StrUtil.isNotBlank(userCode), "用户编号不能为空");
        Assert.isTrue(ObjUtil.isNotNull(amount), "查询条件不能为空");
        Assert.isTrue(ObjUtil.isNotNull(wallet), "查询条件不能为空");
        //生成交易
        User user = new User();
        user.setUserCode(userCode);
        TradeRecord tradeRecord = TradeRecordFactory.newTradeRecord(wallet, user, amount);
        tradeRecord.setTradeBefore(wallet.getBalance());
        BigDecimal subtract = wallet.getBalance().subtract(amount);
        tradeRecord.setTradeAfter(subtract);
        return generate(tradeRecord, TradeRecord.CONSUME);
    }

    /**
     * 生成充值记录
     * @param wallet 钱包
     * @param userCode 用户编号
     * @param amount 金额
     * @return 交易记录
     */

    @Override
    public TradeRecord generateRecharge(Wallet wallet, String userCode, BigDecimal amount) {
        Assert.isTrue(StrUtil.isNotBlank(userCode), "用户编号不能为空");
        Assert.isTrue(ObjUtil.isNotNull(amount), "查询条件不能为空");
        Assert.isTrue(ObjUtil.isNotNull(wallet), "查询条件不能为空");
        //生成交易
        User user = new User();
        user.setUserCode(userCode);
        TradeRecord tradeRecord = TradeRecordFactory.newTradeRecord(wallet, user, amount);
        tradeRecord.setTradeBefore(wallet.getBalance());
        BigDecimal add = wallet.getBalance().add(amount);
        tradeRecord.setTradeAfter(add);
        return generate(tradeRecord, TradeRecord.EXTERNAL_RECHARGE);
    }

    /**
     * 设置交易类型，并生成到数据库
     * @param tradeRecord 交易记录
     * @param type 类型
     * @return 交易记录
     */
    public TradeRecord generate(TradeRecord tradeRecord, Integer type) {
        tradeRecord.setType(type);
        tradeRecordMapper.insertTradeRecord(tradeRecord);
        return tradeRecord;
    }

    /**
     * 完成交易
     * @param tradeRecord 交易记录
     * @return 交易记录
     */
    @Override
    public TradeRecord finishTrade(TradeRecord tradeRecord) {
        tradeRecord.setStatus(TradeRecord.SUCCEED);
        tradeRecordMapper.updateTradeRecord(tradeRecord);
        return tradeRecord;
    }

    /**
     * 根据code获取
     * @param recordCode
     * @return
     */
    @Override
    public TradeRecord getByCode(String recordCode) {
        TradeRecord query = new TradeRecord();
        query.setRecodeCode(recordCode);
        return tradeRecordMapper.queryTradeRecordLimit1(query);
    }


}
