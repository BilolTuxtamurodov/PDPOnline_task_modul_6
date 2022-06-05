package com.company.PDPOnline.repository;

import com.company.PDPOnline.entity.CurrencyEntity;
import com.company.PDPOnline.projection.CustomCurrency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currency", collectionResourceRel = "list", excerptProjection = CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository<CurrencyEntity, Integer> {
}