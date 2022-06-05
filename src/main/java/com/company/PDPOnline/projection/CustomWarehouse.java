package com.company.PDPOnline.projection;

import com.company.PDPOnline.entity.WarehouseEntity;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = WarehouseEntity.class)
public interface CustomWarehouse {
    String getName();
    Boolean getActive();
}
