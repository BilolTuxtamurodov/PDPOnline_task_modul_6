package com.company.PDPOnline.repository;

import com.company.PDPOnline.entity.ProductEntity;
import com.company.PDPOnline.projection.CustomProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product", collectionResourceRel = "list", excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
}