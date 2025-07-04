package io.github.zh.kv.server.service.impl;

import io.github.zh.common.exception.BizException;
import io.github.zh.common.resopnse.Response;
import io.github.zh.kv.api.dto.req.AddNoteContentReqDTO;
import io.github.zh.kv.api.dto.req.DeleteNoteContentReqDTO;
import io.github.zh.kv.api.dto.req.FindNoteContentReqDTO;
import io.github.zh.kv.api.dto.rsp.FindNoteContentRspDTO;
import io.github.zh.kv.server.domain.dataobject.NoteContentDO;
import io.github.zh.kv.server.enums.ResponseCodeEnum;
import io.github.zh.kv.server.mapper.NoteContentMapper;
import io.github.zh.kv.server.service.NoteContentService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

/**
 * NoteContentServiceImpl
 *
 * @author 王青玄
 * @version v0.1 2025-06-13 09:32
 * @description: Key-Value 业务
 */
@Service
@Slf4j
public class NoteContentServiceImpl implements NoteContentService {

    @Resource
    private NoteContentMapper noteContentMapper;


    @Override
    public Response<?> addNoteContent(AddNoteContentReqDTO addNoteContentReqDTO) {
        // 笔记 ID
        String noteId = addNoteContentReqDTO.getUuid();
        // 笔记内容
        String content = addNoteContentReqDTO.getContent();

        // 构建数据库 DO 实体类
        NoteContentDO nodeContent = NoteContentDO.builder()
                .id(UUID.fromString(noteId))
                .content(content)
                .build();

        // 插入数据
        noteContentMapper.save(nodeContent);

        return Response.success();
    }

    /**
     * 查询笔记内容
     *
     * @param findNoteContentReqDTO
     * @return
     */
    @Override
    public Response<FindNoteContentRspDTO> findNoteContent(FindNoteContentReqDTO findNoteContentReqDTO) {
        // 笔记 ID
        String noteId = findNoteContentReqDTO.getUuid();
        // 根据笔记 ID 查询笔记内容
        Optional<NoteContentDO> optional = noteContentMapper.findById(UUID.fromString(noteId));

        // 若笔记内容不存在
        if (!optional.isPresent()) {
            throw new BizException(ResponseCodeEnum.NOTE_CONTENT_NOT_FOUND);
        }

        NoteContentDO noteContentDO = optional.get();
        // 构建返参 DTO
        FindNoteContentRspDTO findNoteContentRspDTO = FindNoteContentRspDTO.builder()
                .uuid(noteContentDO.getId())
                .content(noteContentDO.getContent())
                .build();

        return Response.success(findNoteContentRspDTO);
    }

    /**
     * 删除笔记内容
     *
     * @param deleteNoteContentReqDTO
     * @return
     */
    @Override
    public Response<?> deleteNoteContent(DeleteNoteContentReqDTO deleteNoteContentReqDTO) {
        // 笔记 ID
        String noteId = deleteNoteContentReqDTO.getUuid();
        // 删除笔记内容
        noteContentMapper.deleteById(UUID.fromString(noteId));

        return Response.success();
    }
}