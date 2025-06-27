package io.github.zh.data.align.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * XxlJobProperties
 *
 * @author 王青玄
 * @version v0.1 2025-06-27 14:34
 * @description: xxl-job 配置读取
 */
@ConfigurationProperties(prefix = XxlJobProperties.PREFIX)
@Component
@Data
public class XxlJobProperties {

    public static final String PREFIX = "xxl.job";

    private String adminAddresses;

    private String accessToken;

    private String appName;

    private String ip;

    private int port;

    private String logPath;

    private int logRetentionDays = 30;
}