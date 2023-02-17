package com.ggstream.controller;

import com.ggstream.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * 用户控制层
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查询余额
     * @param userCode 用户编号
     * @return 余额
     */
    @GetMapping("/queryBalance/{userCode}")
    BigDecimal queryBalance(@PathVariable String userCode) {
        return userService.queryBalance(userCode);
    }

    /**
     * 消费
     * @param userCode 用户编号
     * @param amount 交易额
     * @return 交易后的值
     */
    @GetMapping("/consumeMoney/{userCode}/{amount}")
    BigDecimal consumeMoney(@PathVariable String userCode, @PathVariable BigDecimal amount) {
        return userService.consumeMoney(userCode, amount);
    }

    /**
     * 充值，只生成交易记录
     * @param userCode 用户编号
     * @param amount 交易额
     * @return 本次交易后所剩余额
     */
    @GetMapping("/refund/{userCode}/{amount}")
    BigDecimal refund(@PathVariable String userCode, @PathVariable BigDecimal amount) {
        return userService.refund(userCode, amount);
    }
    /**
     * 充值，真正改变数据，由第三方调用，实际会传递交易码，演示直接用交易编号
     * @param recordCode 交易编号
     * @return 交易后的余额
     */
    @GetMapping("/refundAsync/{recordCode}")
    public BigDecimal refundAsync(@PathVariable String recordCode) {
        return userService.refundAsync(recordCode);
    }
}
