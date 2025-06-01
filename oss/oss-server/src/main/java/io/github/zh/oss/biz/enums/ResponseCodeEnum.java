package io.github.zh.oss.biz.enums;

import io.github.zh.common.exception.BaseExceptionInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ResponseCodeEnum
 *
 * @author 王青玄
 * @version v0.1 2025-05-28 13:18
 */
@Getter
@AllArgsConstructor
public enum ResponseCodeEnum implements BaseExceptionInterface {

    // ----------- 通用异常状态码 -----------
    SYSTEM_ERROR("OSS-10000", "出错啦，后台小哥正在努力修复中..."),
    PARAM_NOT_VALID("OSS-10001", "参数错误"),

    // ----------- 业务异常状态码 -----------
    ;

    // 异常码
    private final String errorCode;
    // 错误信息
    private final String errorMessage;

}