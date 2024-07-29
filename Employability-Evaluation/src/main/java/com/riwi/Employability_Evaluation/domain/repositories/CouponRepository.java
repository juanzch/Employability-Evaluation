package com.riwi.Employability_Evaluation.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.riwi.Employability_Evaluation.domain.entities.Coupon;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CouponRepository  extends JpaRepository<Coupon, String> {


    @Query("SELECT c FROM coupon c WHERE c.user.id = :userId")
    List<Coupon> findByUserId(@Param("userId") String userId);

}
