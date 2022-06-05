package com.company.PDPOnline.projection;

import com.company.PDPOnline.entity.ClientEntity;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = ClientEntity.class)
public interface CustomClient {
    String getName();
    String getPhoneNumber();
}
