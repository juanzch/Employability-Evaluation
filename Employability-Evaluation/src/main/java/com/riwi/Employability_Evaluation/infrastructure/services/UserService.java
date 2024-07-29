package com.riwi.Employability_Evaluation.infrastructure.services;

import com.riwi.Employability_Evaluation.api.dto.request.UserRequest;
import com.riwi.Employability_Evaluation.api.dto.response.CouponResponse;
import com.riwi.Employability_Evaluation.api.dto.response.UserResponse;
import com.riwi.Employability_Evaluation.domain.entities.User;
import com.riwi.Employability_Evaluation.domain.repositories.UserRepository;
import com.riwi.Employability_Evaluation.infrastructure.abstract_service.IUserService;
import com.riwi.Employability_Evaluation.infrastructure.helpers.mappers.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService implements IUserService {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private final UserMapper userMapper;


    @Override
    public UserResponse create(UserRequest request) {
        User user = this.userMapper.toUser(request);
        return userMapper.toUserResponse(this.userRepository.save(user));
    }


}
