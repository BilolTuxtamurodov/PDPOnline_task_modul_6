package com.company.PDPOnline.projection;

import com.company.PDPOnline.entity.CurrencyEntity;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = CurrencyEntity.class)
public interface CustomCurrency {
    String getName();
    Boolean getActive();
}
