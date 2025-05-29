package io.github.zh.common.eumns;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * DeletedEnum
 *
 * @author 王青玄
 * @version v0.1 2025-05-29 16:50
 */
@Getter
@AllArgsConstructor
public enum DeletedEnum {

    YES(true),
    NO(false);

    private final Boolean value;
}