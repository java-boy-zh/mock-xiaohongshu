package io.github.zh.auth.domain.dataobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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

    private Date birthday;

    private String backgroundImg;

    private String phone;

    private String email;

    private Byte sex;

    private Byte status;

    private String introduction;

    private Date createTime;

    private Date updateTime;

    private Boolean isDeleted;

}