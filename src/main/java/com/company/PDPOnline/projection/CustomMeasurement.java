package com.company.PDPOnline.projection;

import com.company.PDPOnline.entity.MeasurementEntity;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = MeasurementEntity.class)
public interface CustomMeasurement {
    String getName();
    Boolean getActive();
}
