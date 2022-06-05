package com.company.PDPOnline.repository;

import com.company.PDPOnline.entity.UserWarehouseEntity;
import com.company.PDPOnline.projection.CustomUserWarehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user-warehouse", collectionResourceRel = "list", excerptProjection = CustomUserWarehouse.class)
public interface UserWarehouseRepository extends JpaRepository<UserWarehouseEntity, Integer> {
}