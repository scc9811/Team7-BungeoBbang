package com.bungeobbang.backend.admin.domain.repository;

import com.bungeobbang.backend.admin.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, Long> {

    Optional<Admin> findByLoginId(String loginId);

    @Query("SELECT a.university.id FROM Admin a WHERE a.id = :adminId")
    Optional<Long> findUniversityIdByAdminId(@Param("adminId") Long adminId);
}
