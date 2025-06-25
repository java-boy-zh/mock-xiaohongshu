package io.github.zh.userrelation.server.constant;

/**
 * MQConstants
 *
 * @author 王青玄
 * @version v0.1 2025-06-25 17:45
 * @description: MQ 常量
 */
public interface MQConstants {

    /**
     * Topic: 关注、取关共用一个
     */
    String TOPIC_FOLLOW_OR_UNFOLLOW = "FollowUnfollowTopic";

    /**
     * 关注标签
     */
    String TAG_FOLLOW = "Follow";

    /**
     * 取关标签
     */
    String TAG_UNFOLLOW = "Unfollow";
}