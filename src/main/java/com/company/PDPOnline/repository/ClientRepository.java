package com.company.PDPOnline.repository;

import com.company.PDPOnline.entity.ClientEntity;
import com.company.PDPOnline.projection.CustomClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "client", collectionResourceRel = "list", excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<ClientEntity, Integer> {
}