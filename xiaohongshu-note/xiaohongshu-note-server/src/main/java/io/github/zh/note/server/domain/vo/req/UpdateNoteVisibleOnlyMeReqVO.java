package io.github.zh.note.server.domain.vo.req;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UpdateNoteVisibleOnlyMeReqVO
 *
 * @author 王青玄
 * @version v0.1 2025-06-24 14:20
 * @description: 笔记仅对自己可见
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateNoteVisibleOnlyMeReqVO {

    @NotNull(message = "笔记 ID 不能为空")
    private Long id;

}