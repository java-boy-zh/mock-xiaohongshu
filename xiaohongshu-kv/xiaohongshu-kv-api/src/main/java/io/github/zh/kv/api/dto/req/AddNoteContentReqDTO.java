package io.github.zh.kv.api.dto.req;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * AddNoteContentReqDTO
 *
 * @author 王青玄
 * @version v0.1 2025-06-13 09:24
 * @description: 新增笔记内容
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddNoteContentReqDTO {

    @NotNull(message = "笔记 ID 不能为空")
    private String uuid;

    @NotBlank(message = "笔记内容不能为空")
    private String content;

}