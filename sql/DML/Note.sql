ALTER table t_note add column `content_uuid` varchar(36) DEFAULT '' COMMENT '笔记内容UUID';

INSERT INTO `xiaohongshu`.`t_channel` (`name`, `create_time`, `update_time`, `is_deleted`) VALUES ('美食', now(), now(), 0);
INSERT INTO `xiaohongshu`.`t_channel` (`name`, `create_time`, `update_time`, `is_deleted`) VALUES ('娱乐', now(), now(), 0);

INSERT INTO `xiaohongshu`.`t_topic` (`name`, `create_time`, `update_time`, `is_deleted`) VALUES ('高分美剧推荐', now(), now(), 0);
INSERT INTO `xiaohongshu`.`t_topic` (`name`, `create_time`, `update_time`, `is_deleted`) VALUES ('下饭综艺推荐', now(), now(), 0);

INSERT INTO `xiaohongshu`.`t_channel_topic_rel` (`channel_id`, `topic_id`, `create_time`, `update_time`) VALUES (2, 1, now(), now());
INSERT INTO `xiaohongshu`.`t_channel_topic_rel` (`channel_id`, `topic_id`, `create_time`, `update_time`) VALUES (2, 2, now(), now());
