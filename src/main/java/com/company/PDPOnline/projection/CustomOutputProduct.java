package com.company.PDPOnline.projection;

import com.company.PDPOnline.entity.OutputProductEntity;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = OutputProductEntity.class)
public interface CustomOutputProduct {
    Long getAmount();
    Long getPrice();
    Integer getProductId();
    Integer getOutputId();
}
