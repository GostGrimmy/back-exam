package com.ggstream.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.ggstream.entity.Wallet;
/**
*  @author huangjiahua
*/

public interface WalletBaseMapper {

    int insertWallet(Wallet object);

    int updateWallet(Wallet object);

    int update(Wallet.UpdateBuilder object);

    List<Wallet> queryWallet(Wallet object);

    Wallet queryWalletLimit1(Wallet object);

}