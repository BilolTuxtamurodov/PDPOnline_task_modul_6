package com.company.PDPOnline.repository;

import com.company.PDPOnline.entity.OutputProductEntity;
import com.company.PDPOnline.projection.CustomOutputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "output-product", collectionResourceRel = "list", excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProductEntity, Integer> {
}