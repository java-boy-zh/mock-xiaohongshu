package io.github.zh.usercenter.server.domain.dataobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDO {
    private Long id;

    private String xiaohongshuId;

    private String wechatOpenId;

    private String password;

    private String nickname;

    private String avatar;

    private LocalDate birthday;

    private String backgroundImg;

    private String phone;

    private String email;

    private Integer sex;

    private Integer status;

    private String introduction;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Boolean isDeleted;
}