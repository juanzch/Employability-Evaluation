package com.riwi.Employability_Evaluation.infrastructure.abstract_service;

public interface Create<RQ,RS> {
    public RS create(RQ request);
}
