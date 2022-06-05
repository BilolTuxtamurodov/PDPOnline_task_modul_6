package com.company.PDPOnline.repository;

import com.company.PDPOnline.entity.OutputEntity;
import com.company.PDPOnline.projection.CustomOutput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "output", collectionResourceRel = "list", excerptProjection = CustomOutput.class)
public interface OutputRepository extends JpaRepository<OutputEntity, Integer> {
}