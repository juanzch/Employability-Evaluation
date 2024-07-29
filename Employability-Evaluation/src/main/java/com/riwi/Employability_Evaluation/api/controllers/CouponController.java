package com.riwi.Employability_Evaluation.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.Employability_Evaluation.api.dto.request.CouponRequest;
import com.riwi.Employability_Evaluation.api.dto.response.CouponResponse;
import com.riwi.Employability_Evaluation.api.dto.response.CouponUsedResponse;
import com.riwi.Employability_Evaluation.domain.entities.Coupon;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@AllArgsConstructor
@RequestMapping("/coupons")
@Tag(name = "Coupon", description = "Coupon API")
public class CouponController {

    @Autowired
    private CouponService couponService;


    @Operation( summary = "Get coupons", description = "Get coupons")
    @GetMapping(path = "/coupons")
    public ResponseEntity<CouponResponse> getCoupons(@PathVariable String id) {
        return ResponseEntity.ok(this.couponService.getCoupons());
    }

    @Operation( summary = "Create coupon", description = "Create coupon")
    @PostMapping(path = "/coupons")
    public ResponseEntity<CouponResponse> createCoupon(@RequestBody @Validated CouponRequest couponRequest) {
        
        return ResponseEntity.ok(this.couponService.createCoupon(couponRequest));
    }
    @Operation( summary = "Update coupon", description = "Update coupon")
    @PatchMapping(path = "/{id}")
    public ResponseEntity<CouponUsedResponse> updateCoupon(@PathVariable String id) {

        return ResponseEntity.ok(this.couponService.updateCoupon(id));
        
    }
    @Operation( summary = "Delete coupon", description = "Delete coupon")
    @DeleteMapping(path = "/coupons/{id}")
    public ResponseEntity<Void> deleteCoupon(@PathVariable String id) {
        this.couponService.delete(id);
        return ResponseEntity.noContent().build();
    }
    
    

}
