package io.github.zh.note.server.mapper;

import io.github.zh.note.server.domain.dataobject.ChannelTopicRelDO;

public interface ChannelTopicRelDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ChannelTopicRelDO record);

    int insertSelective(ChannelTopicRelDO record);

    ChannelTopicRelDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ChannelTopicRelDO record);

    int updateByPrimaryKey(ChannelTopicRelDO record);
}