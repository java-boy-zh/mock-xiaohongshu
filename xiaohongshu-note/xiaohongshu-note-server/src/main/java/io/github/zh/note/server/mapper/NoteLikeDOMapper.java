package io.github.zh.note.server.mapper;

import io.github.zh.note.server.domain.dataobject.NoteLikeDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NoteLikeDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NoteLikeDO record);

    int insertSelective(NoteLikeDO record);

    NoteLikeDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NoteLikeDO record);

    int updateByPrimaryKey(NoteLikeDO record);

    int selectCountByUserIdAndNoteId(@Param("userId") Long userId,
                                     @Param("noteId") Long noteId);

    List<NoteLikeDO> selectByUserId(@Param("userId") Long userId);

    int selectNoteIsLiked(@Param("userId") Long userId, @Param("noteId") Long noteId);

    List<NoteLikeDO> selectLikedByUserIdAndLimit(@Param("userId") Long userId,
                                                 @Param("limit")  int limit);

}