package com.ggstream.utils;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import org.springframework.jdbc.support.GeneratedKeyHolder;

public class KeyUtils {
    public static String generateKey() {
        return IdUtil.fastUUID();
    }
}
