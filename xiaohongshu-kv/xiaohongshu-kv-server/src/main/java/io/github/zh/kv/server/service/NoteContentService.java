package io.github.zh.kv.server.service;

import io.github.zh.common.resopnse.Response;
import io.github.zh.kv.api.dto.req.AddNoteContentReqDTO;

/**
 * NoteContentService
 *
 * @author 王青玄
 * @version v0.1 2025-06-13 09:31
 * @description: 笔记内容存储业务
 */
public interface NoteContentService {
    /**
     * 添加笔记内容
     *
     * @param addNoteContentReqDTO
     * @return
     */
    Response<?> addNoteContent(AddNoteContentReqDTO addNoteContentReqDTO);
}