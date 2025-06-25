package io.github.zh.userrelation.server.constant;

/**
 * RedisKeyConstants
 *
 * @author 王青玄
 * @version v0.1 2025-06-25 15:44
 */
public class RedisKeyConstants {

    /**
     * 关注列表 KEY 前缀
     */
    private static final String USER_FOLLOWING_KEY_PREFIX = "following:";

    /**
     * 构建关注列表完整的 KEY
     * @param userId
     * @return
     */
    public static String buildUserFollowingKey(Long userId) {
        return USER_FOLLOWING_KEY_PREFIX + userId;
    }

}