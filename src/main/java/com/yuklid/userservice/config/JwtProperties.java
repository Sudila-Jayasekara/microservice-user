package com.yuklid.userservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "application.security.jwt")
public class JwtProperties {

    private String secretKey;
    private long expiration;
    private RefreshToken refreshToken = new RefreshToken();

    @Data
    public static class RefreshToken {
        private long expiration;
    }
}