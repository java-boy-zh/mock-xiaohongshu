package io.github.zh.note.server.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author 王青玄
 * @Contact 1121586359@qq.com
 * @create 2025年06月15日 14:41
 * @description: 笔记可见性
 */
@Getter
@AllArgsConstructor
public enum NoteVisibleEnum {

    PUBLIC(0), // 公开，所有人可见
    PRIVATE(1); // 仅自己可见

    private final Integer code;

}
