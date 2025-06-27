package io.github.zh.note.server.domain.vo.req;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * LikeNoteReqVO
 *
 * @author 王青玄
 * @version v0.1 2025-06-27 10:12
 * @description: 点赞笔记
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LikeNoteReqVO {

    @NotNull(message = "笔记 ID 不能为空")
    private Long id;

}