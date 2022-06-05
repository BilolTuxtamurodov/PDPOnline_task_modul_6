package com.company.PDPOnline.repository;

import com.company.PDPOnline.entity.CategoryEntity;
import com.company.PDPOnline.projection.CustomCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "category", collectionResourceRel = "list", excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {
}