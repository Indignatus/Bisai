package com.bisai.bisai.controller.services;


/**
 * Created by Tania on 28/04/2016.
 */

public interface RegisterService {
    @POST("api/register")
    Call<Void> registerAccount(
            @Body UserDTO userDTO
    );

}
