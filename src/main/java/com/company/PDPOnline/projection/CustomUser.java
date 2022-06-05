package com.company.PDPOnline.projection;

import com.company.PDPOnline.entity.UserEntity;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = UserEntity.class)
public interface CustomUser {
    String getFirstName();
    String getLasName();
    String getPhoneNumber();
    String getCode();
    String getPassword();
    Boolean getActive();
}
