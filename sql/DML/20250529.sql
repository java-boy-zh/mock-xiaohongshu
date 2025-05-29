INSERT INTO xiaohongshu.t_permission (parent_id,name,`type`,menu_url,menu_icon,sort,permission_key,status,create_time,update_time,is_deleted) VALUES
	 (0,'发布笔记',3,'','',1,'app:note:publish',0,'2025-05-29 15:45:11','2025-05-29 15:45:11',0),
	 (0,'发布评论',3,'','',2,'app:comment:publish',0,'2025-05-29 15:45:14','2025-05-29 15:45:14',0);

INSERT INTO xiaohongshu.t_role_permission_rel (role_id,permission_id,create_time,update_time,is_deleted) VALUES
	 (1,1,'2025-05-29 15:46:22','2025-05-29 15:46:22',0),
	 (1,2,'2025-05-29 15:46:25','2025-05-29 15:46:25',0);

INSERT INTO xiaohongshu.t_role (role_name,role_key,status,sort,remark,create_time,update_time,is_deleted) VALUES
	 ('普通用户','common_user',0,1,'','2025-05-29 15:46:07','2025-05-29 15:46:07',0);
