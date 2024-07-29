package com.riwi.Employability_Evaluation.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class UserResponse {
    private String id;
    private String name;  
    private String email;
    private String phone;

}
