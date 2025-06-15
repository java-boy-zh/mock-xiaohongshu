package io.github.zh.note.server.service;

import io.github.zh.common.resopnse.Response;
import io.github.zh.note.server.domain.vo.PublishNoteReqVO;

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

}
