package io.github.zh.note.server.domain.vo.req;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DeleteNoteReqVO
 *
 * @author 王青玄
 * @version v0.1 2025-06-24 14:16
 * @description: 笔记发布
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteNoteReqVO {

    @NotNull(message = "笔记 ID 不能为空")
    private Long id;

}