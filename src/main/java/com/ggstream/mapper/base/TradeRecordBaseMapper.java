package com.ggstream.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.ggstream.entity.TradeRecord;
/**
*  @author huangjiahua
*/

public interface TradeRecordBaseMapper {

    int insertTradeRecord(TradeRecord object);

    int updateTradeRecord(TradeRecord object);

    int update(TradeRecord.UpdateBuilder object);

    List<TradeRecord> queryTradeRecord(TradeRecord object);

    TradeRecord queryTradeRecordLimit1(TradeRecord object);

}