package io.github.zh.auth.mapper;

import io.github.zh.auth.domain.dataobject.RolePermissionRelDO;

public interface RolePermissionRelDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RolePermissionRelDO record);

    int insertSelective(RolePermissionRelDO record);

    RolePermissionRelDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RolePermissionRelDO record);

    int updateByPrimaryKey(RolePermissionRelDO record);
}