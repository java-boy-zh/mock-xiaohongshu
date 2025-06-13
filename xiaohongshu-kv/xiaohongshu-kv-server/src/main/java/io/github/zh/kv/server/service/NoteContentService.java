package io.github.zh.kv.server.service;

import io.github.zh.common.resopnse.Response;
import io.github.zh.kv.api.dto.req.AddNoteContentReqDTO;
import io.github.zh.kv.api.dto.req.DeleteNoteContentReqDTO;
import io.github.zh.kv.api.dto.req.FindNoteContentReqDTO;
import io.github.zh.kv.api.dto.rsp.FindNoteContentRspDTO;

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

    /**
     * 查询笔记内容
     *
     * @param findNoteContentReqDTO
     * @return
     */
    Response<FindNoteContentRspDTO> findNoteContent(FindNoteContentReqDTO findNoteContentReqDTO);

    /**
     * 删除笔记内容
     *
     * @param deleteNoteContentReqDTO
     * @return
     */
    Response<?> deleteNoteContent(DeleteNoteContentReqDTO deleteNoteContentReqDTO);

}