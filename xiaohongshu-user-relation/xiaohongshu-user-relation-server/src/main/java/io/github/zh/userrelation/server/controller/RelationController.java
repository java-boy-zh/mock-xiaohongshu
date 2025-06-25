package io.github.zh.userrelation.server.controller;

import io.github.zh.common.resopnse.Response;
import io.github.zh.log.aspect.ApiOperationLog;
import io.github.zh.userrelation.server.domain.vo.FollowUserReqVO;
import io.github.zh.userrelation.server.service.RelationService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RelationController
 *
 * @author 王青玄
 * @version v0.1 2025-06-25 15:38
 * @description: 用户关系
 */
@RestController
@RequestMapping("/relation")
@Slf4j
public class RelationController {

    @Resource
    private RelationService relationService;

    @PostMapping("/follow")
    @ApiOperationLog(description = "关注用户")
    public Response<?> follow(@Validated @RequestBody FollowUserReqVO followUserReqVO) {
        return relationService.follow(followUserReqVO);
    }

}