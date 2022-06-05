package com.company.PDPOnline.projection;

import com.company.PDPOnline.entity.SupplierEntity;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = SupplierEntity.class)
public interface CustomSupplier {
    String getName();
    Boolean getActive();
    String getPhoneNumber();
}
