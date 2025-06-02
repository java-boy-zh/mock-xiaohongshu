package io.github.zh.context.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import io.github.zh.common.constants.GlobalConstants;
import io.github.zh.context.holder.LoginUserContextHolder;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

/**
 * @author 王青玄
 * @Contact 1121586359@qq.com
 * @create 2025年06月02日 10:09
 * @description: Feign 请求拦截器
 */
@Slf4j
public class FeignRequestInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate requestTemplate) {
        // 获取当前上下文中的用户 ID
        Long userId = LoginUserContextHolder.getUserId();

        // 若不为空，则添加到请求头中
        if (Objects.nonNull(userId)) {
            requestTemplate.header(GlobalConstants.USER_ID, String.valueOf(userId));
            log.info("########## feign 请求设置请求头 userId: {}", userId);
        }
    }
}
