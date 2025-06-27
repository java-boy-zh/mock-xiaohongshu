package io.github.zh.note.server.domain.vo.req;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UnlikeNoteReqVO
 *
 * @author 王青玄
 * @version v0.1 2025-06-27 13:47
 * @description: 取消点赞笔记
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UnlikeNoteReqVO {

    @NotNull(message = "笔记 ID 不能为空")
    private Long id;

}