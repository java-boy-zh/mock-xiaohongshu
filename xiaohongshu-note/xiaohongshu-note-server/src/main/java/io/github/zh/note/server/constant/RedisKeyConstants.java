package io.github.zh.note.server.constant;

/**
 * RedisKeyConstants
 *
 * @author 王青玄
 * @version v0.1 2025-06-24 11:36
 */
public class RedisKeyConstants {

    /**
     * 笔记详情 KEY 前缀
     */
    public static final String NOTE_DETAIL_KEY = "note:detail:";


    /**
     * 构建完整的笔记详情 KEY
     * @param noteId
     * @return
     */
    public static String buildNoteDetailKey(Long noteId) {
        return NOTE_DETAIL_KEY + noteId;
    }

}