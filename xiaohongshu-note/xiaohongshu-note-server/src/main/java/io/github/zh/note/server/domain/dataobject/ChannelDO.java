package io.github.zh.note.server.domain.dataobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChannelDO {
    private Long id;

    private String name;

    private Date createTime;

    private Date updateTime;

    private Boolean isDeleted;

}