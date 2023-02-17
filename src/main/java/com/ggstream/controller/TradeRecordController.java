package com.ggstream.controller;

import com.ggstream.entity.TradeRecord;
import com.ggstream.service.TradeRecordeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TradeRecordController {

    @Autowired
    TradeRecordeService tradeRecordeService;

    /**
     * 根据用户查询交易记录,实际中要用分布，
     * 但这里演示就不做了
     * @param userCode 用户编号
     * @return 交易记录
     */
    @GetMapping("/tradeRecord/get/{userCode}")
    public List<TradeRecord> getByUserCode(@PathVariable String userCode) {
        return tradeRecordeService.getByUserCode(userCode);
    }
}
