package com.demo.Repository;

import com.demo.entity.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MobileRepository extends JpaRepository<Mobile, Long> {
}