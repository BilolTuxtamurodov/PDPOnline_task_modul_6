package com.company.PDPOnline.repository;

import com.company.PDPOnline.entity.SupplierEntity;
import com.company.PDPOnline.projection.CustomSupplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "supplier", collectionResourceRel = "list", excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<SupplierEntity, Integer> {
}