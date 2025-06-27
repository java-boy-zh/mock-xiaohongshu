package io.github.zh.note.server.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * LikeUnlikeNoteTypeEnum
 *
 * @author 王青玄
 * @version v0.1 2025-06-27 13:36
 * @description: 笔记点赞、取消点赞 Type
 */
@Getter
@AllArgsConstructor
public enum LikeUnlikeNoteTypeEnum {
    // 点赞
    LIKE(1),
    // 取消点赞
    UNLIKE(0),
    ;

    private final Integer code;

}