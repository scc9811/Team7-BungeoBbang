package com.bungeobbang.backend.auth.domain.dto;

import com.bungeobbang.backend.auth.domain.Authority;

public record Accessor(Long id, Long universityId, Authority authority) {
}
