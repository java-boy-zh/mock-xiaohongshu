package io.github.zh.note.server.service;

import io.github.zh.common.resopnse.Response;
import io.github.zh.note.server.domain.vo.req.FindNoteDetailReqVO;
import io.github.zh.note.server.domain.vo.req.PublishNoteReqVO;
import io.github.zh.note.server.domain.vo.req.UpdateNoteReqVO;
import io.github.zh.note.server.domain.vo.resp.FindNoteDetailRspVO;

/**
 * @author 王青玄
 * @Contact 1121586359@qq.com
 * @create 2025年06月15日 15:39
 * @description: 笔记业务
 */
public interface NoteService {

    /**
     * 笔记发布
     * @param publishNoteReqVO
     * @return
     */
    Response<?> publishNote(PublishNoteReqVO publishNoteReqVO);

    /**
     * 笔记详情
     * @param findNoteDetailReqVO
     * @return
     */
    Response<FindNoteDetailRspVO> findNoteDetail(FindNoteDetailReqVO findNoteDetailReqVO);

    /**
     * 笔记更新
     * @param updateNoteReqVO
     * @return
     */
    Response<?> updateNote(UpdateNoteReqVO updateNoteReqVO);

}
