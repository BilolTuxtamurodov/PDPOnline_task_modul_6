package com.company.PDPOnline.projection;

import com.company.PDPOnline.entity.ProductEntity;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.Column;

@Projection(types = ProductEntity.class)
public interface CustomProduct {
    String  getName();
    String getCode();
    Boolean getActive();
    Integer getMeasurementId();
    Integer getPhotoId();
    Integer getCategoryId();
}
