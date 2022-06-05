package com.company.PDPOnline.projection;

import com.company.PDPOnline.entity.CategoryEntity;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = CategoryEntity.class)
public interface CustomCategory {
    String getName();
    Boolean getActive();
}
