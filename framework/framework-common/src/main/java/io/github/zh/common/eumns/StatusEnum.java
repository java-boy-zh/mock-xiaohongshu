package io.github.zh.common.eumns;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * StatusEnum
 *
 * @author 王青玄
 * @version v0.1 2025-05-29 16:50
 */
@Getter
@AllArgsConstructor
public enum StatusEnum {
    // 启用
    ENABLE(0),
    // 禁用
    DISABLED(1);

    private final Integer value;
}