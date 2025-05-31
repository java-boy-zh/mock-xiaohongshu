package io.github.zh.auth.alarm;

/**
 * @author 王青玄
 * @Contact 1121586359@qq.com
 * @create 2025年05月31日 20:04
 */
public interface AlarmInterface {

    /**
     * 发送告警信息
     *
     * @param message
     * @return
     */
    boolean send(String message);
}
