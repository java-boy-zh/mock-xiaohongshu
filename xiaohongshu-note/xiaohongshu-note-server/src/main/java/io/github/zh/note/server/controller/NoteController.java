package io.github.zh.note.server.controller;

import io.github.zh.common.resopnse.Response;
import io.github.zh.log.aspect.ApiOperationLog;
import io.github.zh.note.server.domain.vo.req.FindNoteDetailReqVO;
import io.github.zh.note.server.domain.vo.req.PublishNoteReqVO;
import io.github.zh.note.server.domain.vo.req.UpdateNoteReqVO;
import io.github.zh.note.server.domain.vo.resp.FindNoteDetailRspVO;
import io.github.zh.note.server.service.NoteService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王青玄
 * @Contact 1121586359@qq.com
 * @create 2025年06月15日 15:41
 * @description: 笔记
 */
@RestController
@RequestMapping("/note")
@Slf4j
public class NoteController {

    @Resource
    private NoteService noteService;

    @PostMapping(value = "/publish")
    @ApiOperationLog(description = "笔记发布")
    public Response<?> publishNote(@Validated @RequestBody PublishNoteReqVO publishNoteReqVO) {
        return noteService.publishNote(publishNoteReqVO);
    }

    @PostMapping(value = "/detail")
    @ApiOperationLog(description = "笔记详情")
    public Response<FindNoteDetailRspVO> findNoteDetail(@Validated @RequestBody FindNoteDetailReqVO findNoteDetailReqVO) {
        return noteService.findNoteDetail(findNoteDetailReqVO);
    }

    @PostMapping(value = "/update")
    @ApiOperationLog(description = "笔记修改")
    public Response<?> updateNote(@Validated @RequestBody UpdateNoteReqVO updateNoteReqVO) {
        return noteService.updateNote(updateNoteReqVO);
    }

}
