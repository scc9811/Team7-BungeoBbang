package com.bungeobbang.backend.auth.domain.dto;

import com.bungeobbang.backend.auth.domain.Authority;

public record Accessor(Long memberId, Authority authority) {
}
