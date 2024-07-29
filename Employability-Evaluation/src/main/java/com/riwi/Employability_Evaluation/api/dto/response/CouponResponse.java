package com.riwi.Employability_Evaluation.api.dto.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CouponResponse {

     private String id;
     private LocalDate dueDate;
     private double discount;
     
}
