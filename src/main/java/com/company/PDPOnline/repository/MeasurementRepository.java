package com.company.PDPOnline.repository;

import com.company.PDPOnline.entity.MeasurementEntity;
import com.company.PDPOnline.projection.CustomMeasurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "measurement", collectionResourceRel = "list", excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository extends JpaRepository<MeasurementEntity, Integer> {
}