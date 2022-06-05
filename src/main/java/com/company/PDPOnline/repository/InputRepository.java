package com.company.PDPOnline.repository;

import com.company.PDPOnline.entity.InputEntity;
import com.company.PDPOnline.projection.CustomInput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input", collectionResourceRel = "list", excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<InputEntity, Integer> {
}