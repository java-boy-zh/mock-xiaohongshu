package io.github.zh.usercenter.server.mapper;


import io.github.zh.usercenter.server.domain.dataobject.UserRoleRelDO;

public interface UserRoleRelDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserRoleRelDO record);

    int insertSelective(UserRoleRelDO record);

    UserRoleRelDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserRoleRelDO record);

    int updateByPrimaryKey(UserRoleRelDO record);
}