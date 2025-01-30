package com.bungeobbang.backend.common.infrastructure;

import com.bungeobbang.backend.common.exception.AuthException;
import com.bungeobbang.backend.common.exception.ErrorCode;
import org.springframework.stereotype.Component;

@Component
public class BearerAuthorizationExtractor {

    private static final String BEARER_TYPE = "Bearer ";

    public String extractAccessToken(String header) {
        if (header != null && header.startsWith(BEARER_TYPE)) {
            return header.substring(BEARER_TYPE.length()).trim();
        }
        throw new AuthException(ErrorCode.INVALID_AUTHORIZATION_HEADER_FORMAT);
    }
}
