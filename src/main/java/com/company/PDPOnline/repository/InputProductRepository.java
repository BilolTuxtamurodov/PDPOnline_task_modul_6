package com.company.PDPOnline.repository;

import com.company.PDPOnline.entity.InputProductEntity;
import com.company.PDPOnline.projection.CustomInputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input-product", collectionResourceRel = "list", excerptProjection = CustomInputProduct.class)
public interface InputProductRepository extends JpaRepository<InputProductEntity, Integer> {
}