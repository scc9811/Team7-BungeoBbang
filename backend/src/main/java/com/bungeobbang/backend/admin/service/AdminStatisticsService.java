package com.bungeobbang.backend.admin.service;

import com.bungeobbang.backend.admin.domain.repository.AdminRepository;
import com.bungeobbang.backend.common.exception.ErrorCode;
import com.bungeobbang.backend.common.exception.StatisticsException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminStatisticsService {

    private final AdminRepository adminRepository;

    public Long getUniversityIdByAdminId(Long adminId) {
        return adminRepository.findUniversityIdByAdminId(adminId)
                .orElseThrow(() -> new StatisticsException(ErrorCode.UNIVERSITY_FETCH_FAILED));
    }
}
