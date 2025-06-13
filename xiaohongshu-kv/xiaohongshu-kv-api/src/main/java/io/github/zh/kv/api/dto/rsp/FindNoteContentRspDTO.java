package io.github.zh.kv.api.dto.rsp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * FindNoteContentRspDTO
 *
 * @author 王青玄
 * @version v0.1 2025-06-13 09:43
 * @description: 笔记内容
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindNoteContentRspDTO {

    /**
     * 笔记 ID
     */
    private UUID noteId;

    /**
     * 笔记内容
     */
    private String content;

}