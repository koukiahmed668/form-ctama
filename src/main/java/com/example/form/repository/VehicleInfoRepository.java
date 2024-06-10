package com.example.form.repository;

import com.example.form.entity.VehicleInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface VehicleInfoRepository extends JpaRepository<VehicleInfo, Long> {
}
