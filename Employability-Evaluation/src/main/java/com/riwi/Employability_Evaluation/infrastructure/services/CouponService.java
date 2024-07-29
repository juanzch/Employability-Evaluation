package com.riwi.Employability_Evaluation.infrastructure.services;

import com.riwi.Employability_Evaluation.api.dto.request.CouponRequest;
import com.riwi.Employability_Evaluation.api.dto.response.CouponResponse;
import com.riwi.Employability_Evaluation.domain.entities.Coupon;
import com.riwi.Employability_Evaluation.domain.entities.Product;
import com.riwi.Employability_Evaluation.domain.entities.User;
import com.riwi.Employability_Evaluation.domain.repositories.CouponRepository;
import com.riwi.Employability_Evaluation.infrastructure.abstract_service.ICouponService;
import com.riwi.Employability_Evaluation.infrastructure.helpers.mappers.CouponBasicMapper;
import com.riwi.Employability_Evaluation.utils.exceptions.BadRequestException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CouponService implements ICouponService {

    @Autowired
    private final CouponRepository couponRepository;

    @Autowired
    private final CouponBasicMapper couponBasicMapper;

    @Override
    public CouponResponse create(CouponRequest request) {
        Coupon coupon =this.couponBasicMapper.toCouponBasic(request);
        coupon.setUser(new User());
        coupon.setProduct(new Product());
        coupon.setState(true);
        return couponBasicMapper.toCouponResponse(this.couponRepository.save(coupon));
    }

    @Override
    public void delete(String s) {
        Coupon coupon= this.find(s);
        this.couponRepository.delete(coupon);
    }

    @Override
    public CouponResponse get(String s) {
        return null;
    }

    @Override
    public Page<CouponResponse> getAll(int page, int size) {
        if (page<0)
            page=0;

        PageRequest pageable = PageRequest.of(page, size);


        return this.couponRepository.findAll(pageable).map(author -> this.couponBasicMapper.toCouponResponse(author));
    }

    @Override
    public CouponResponse update(CouponRequest request, String s) {
        Coupon coupon = this.find(s);
        coupon = this.couponBasicMapper.toCouponBasic(request);
        return null;
        //return this.couponBasicMapper.toCouponBasic(this.couponRepository.save(coupon));
    }


    public List<Coupon> getCouponsByUserId(String userId) {
        return couponRepository.findByUserId(userId);
    }

    private Coupon find(String id){
        return this.couponRepository.findById(id)
                .orElseThrow(()->new BadRequestException("coupons"));
    }

}
