package com.riwi.Employability_Evaluation.infrastructure.services;

import com.riwi.Employability_Evaluation.api.dto.response.CouponResponse;
import com.riwi.Employability_Evaluation.api.dto.response.ProductResponse;
import com.riwi.Employability_Evaluation.domain.repositories.ProductRepository;
import com.riwi.Employability_Evaluation.infrastructure.abstract_service.IProductService;
import com.riwi.Employability_Evaluation.infrastructure.helpers.mappers.ProductMapper;
import com.riwi.Employability_Evaluation.utils.enums.SortType;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService implements IProductService {

    @Autowired
    private final ProductRepository productRepository;
    @Autowired
    private final ProductMapper productMapper;


    @Override
    public Page<ProductResponse> getAll(int page, int size) {
        if (page<0)
            page=0;

        PageRequest pageable = PageRequest.of(page, size);


            return this.productRepository.findAll(pageable).map(author -> this.productMapper.toProductResponse(author));
    }
}
