package io.github.zh.usercenter.server.mapper;


import io.github.zh.usercenter.server.domain.dataobject.RoleDO;

import java.util.List;

public interface RoleDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RoleDO record);

    int insertSelective(RoleDO record);

    RoleDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RoleDO record);

    int updateByPrimaryKey(RoleDO record);

    /**
     * 查询所有被启用的角色
     *
     * @return
     */
    List<RoleDO> selectEnabledList();
}