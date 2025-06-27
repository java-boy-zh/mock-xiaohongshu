package io.github.zh.search.controller;

import io.github.zh.common.resopnse.PageResponse;
import io.github.zh.log.aspect.ApiOperationLog;
import io.github.zh.search.domain.vo.req.SearchUserReqVO;
import io.github.zh.search.domain.vo.resp.SearchUserRspVO;
import io.github.zh.search.service.UserService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author 王青玄
 * @version v0.1 2025-06-27 17:07
 */
@RestController
@RequestMapping("/search")
@Slf4j
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/user")
    @ApiOperationLog(description = "搜索用户")
    public PageResponse<SearchUserRspVO> searchUser(@RequestBody @Validated SearchUserReqVO searchUserReqVO) {
        return userService.searchUser(searchUserReqVO);
    }


}