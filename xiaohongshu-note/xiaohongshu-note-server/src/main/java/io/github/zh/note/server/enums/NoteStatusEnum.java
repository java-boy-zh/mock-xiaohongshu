package io.github.zh.note.server.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author 王青玄
 * @Contact 1121586359@qq.com
 * @create 2025年06月15日 14:40
 * @description: 笔记状态
 */
@Getter
@AllArgsConstructor
public enum NoteStatusEnum {

    BE_EXAMINE(0), // 待审核
    NORMAL(1), // 正常展示
    DELETED(2), // 被删除
    DOWNED(3), // 被下架
    ;

    private final Integer code;

}
