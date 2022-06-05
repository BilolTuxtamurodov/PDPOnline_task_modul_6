package com.company.PDPOnline.projection;

import com.company.PDPOnline.entity.InputProductEntity;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.Column;

@Projection(types = InputProductEntity.class)
public interface CustomInputProduct {
    Long getAmount();
    Long getPrice();
    String getExpireDate();
    Integer getProductId();
}
