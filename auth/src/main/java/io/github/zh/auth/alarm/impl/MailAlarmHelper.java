package io.github.zh.auth.alarm.impl;

import io.github.zh.auth.alarm.AlarmInterface;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 王青玄
 * @Contact 1121586359@qq.com
 * @create 2025年05月31日 20:04
 */
@Slf4j
public class MailAlarmHelper implements AlarmInterface {

    /**
     * 发送告警信息
     *
     * @param message
     * @return
     */
    @Override
    public boolean send(String message) {
        log.info("==> 【邮件告警】：{}", message);

        // 业务逻辑...

        return true;
    }
}
