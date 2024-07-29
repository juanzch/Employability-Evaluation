package com.riwi.Employability_Evaluation.infrastructure.abstract_service;

public interface Update<RQ,RS,ID> {
    public RS update(RQ request, ID id);
}
