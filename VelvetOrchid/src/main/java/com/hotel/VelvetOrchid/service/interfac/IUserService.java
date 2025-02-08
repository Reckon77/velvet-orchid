package com.hotel.VelvetOrchid.service.interfac;

import com.hotel.VelvetOrchid.dto.LoginRequest;
import com.hotel.VelvetOrchid.dto.Response;
import com.hotel.VelvetOrchid.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
