package com.company.PDPOnline.repository;

import com.company.PDPOnline.entity.AttachmentEntity;
import com.company.PDPOnline.projection.CustomAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment", collectionResourceRel = "list", excerptProjection = CustomAttachment.class)
public interface AttachmentRepository extends JpaRepository<AttachmentEntity, Integer> {
}