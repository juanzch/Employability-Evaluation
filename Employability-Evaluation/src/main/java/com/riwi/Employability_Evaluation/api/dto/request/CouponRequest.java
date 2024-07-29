package com.riwi.Employability_Evaluation.api.dto.request;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CouponRequest {

    private LocalDate dueDate;
    private double discount;
    
    
}
