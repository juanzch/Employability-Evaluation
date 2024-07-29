package com.riwi.Employability_Evaluation.infrastructure.abstract_service;

import com.riwi.Employability_Evaluation.utils.enums.SortType;
import org.springframework.data.domain.Page;

public interface GetAll<RS> {
    public Page<RS> getAll(int page, int size, SortType sort);
}
