package io.github.zh.usercenter.server.enums;

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
    SYSTEM_ERROR("USERCENTER-10000", "出错啦，后台小哥正在努力修复中..."),
    PARAM_NOT_VALID("USERCENTER-10001", "参数错误"),

    // ----------- 业务异常状态码 -----------
    NICK_NAME_VALID_FAIL("USERCENTER-20001", "昵称请设置2-24个字符，不能使用@《/等特殊字符"),
    XIAOHONGSHU_ID_VALID_FAIL("USERCENTER-20002", "小红书号请设置6-15个字符，仅可使用英文（必须）、数字、下划线"),
    SEX_VALID_FAIL("USERCENTER-20003", "性别错误"),
    INTRODUCTION_VALID_FAIL("USERCENTER-20004", "个人简介请设置1-100个字符"),
    ;

    // 异常码
    private final String errorCode;
    // 错误信息
    private final String errorMessage;

}