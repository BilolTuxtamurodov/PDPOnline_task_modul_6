package com.company.PDPOnline.projection;

import com.company.PDPOnline.entity.InputEntity;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDateTime;

@Projection(types = InputEntity.class)
public interface CustomInput {
    LocalDateTime getDate();
    String getFactureNumber();
    String getCode();
    Integer getSupplierId();
    Integer getWarehouseId();
    Integer getCurrencyId();
}
