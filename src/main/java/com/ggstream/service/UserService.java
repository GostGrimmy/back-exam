package com.ggstream.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;


public interface UserService {
    BigDecimal queryBalance(String userCode);
    BigDecimal consumeMoney(String userCode, BigDecimal amount);

    BigDecimal refund(String userCode, BigDecimal amount);

    BigDecimal refundAsync(String recordCode);
}
