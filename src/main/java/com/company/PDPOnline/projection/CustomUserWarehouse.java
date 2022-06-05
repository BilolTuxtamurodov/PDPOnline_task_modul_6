package com.company.PDPOnline.projection;

import com.company.PDPOnline.entity.UserWarehouseEntity;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = UserWarehouseEntity.class)
public interface CustomUserWarehouse {
    Integer getUserId();
    Integer getWarehouseId();
}
