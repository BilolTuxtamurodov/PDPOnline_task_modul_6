package com.company.PDPOnline.repository;

import com.company.PDPOnline.entity.UserEntity;
import com.company.PDPOnline.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user", collectionResourceRel = "list", excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}