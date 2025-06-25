package io.github.zh.common.util;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * DateUtils
 *
 * @author 王青玄
 * @version v0.1 2025-06-25 15:45
 */
public class DateUtils {

    /**
     * LocalDateTime 转时间戳
     *
     * @param localDateTime
     * @return
     */
    public static long localDateTime2Timestamp(LocalDateTime localDateTime) {
        return localDateTime.toInstant(ZoneOffset.UTC).toEpochMilli();
    }
}