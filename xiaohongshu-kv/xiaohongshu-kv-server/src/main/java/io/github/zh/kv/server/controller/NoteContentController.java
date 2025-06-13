package io.github.zh.kv.server.controller;

import io.github.zh.common.resopnse.Response;
import io.github.zh.kv.api.dto.req.AddNoteContentReqDTO;
import io.github.zh.kv.api.dto.req.FindNoteContentReqDTO;
import io.github.zh.kv.api.dto.rsp.FindNoteContentRspDTO;
import io.github.zh.kv.server.service.NoteContentService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * NoteContentController
 *
 * @author 王青玄
 * @version v0.1 2025-06-13 09:34
 * @description: 笔记内容
 */
@RestController
@RequestMapping("/kv")
@Slf4j
public class NoteContentController {

    @Resource
    private NoteContentService noteContentService;

    @PostMapping(value = "/note/content/add")
    public Response<?> addNoteContent(@Validated @RequestBody AddNoteContentReqDTO addNoteContentReqDTO) {
        return noteContentService.addNoteContent(addNoteContentReqDTO);
    }

    @PostMapping(value = "/note/content/find")
    public Response<FindNoteContentRspDTO> findNoteContent(@Validated @RequestBody FindNoteContentReqDTO findNoteContentReqDTO) {
        return noteContentService.findNoteContent(findNoteContentReqDTO);
    }

}