package com.company.PDPOnline.repository;

import com.company.PDPOnline.entity.AttachmentContentEntity;
import com.company.PDPOnline.projection.CustomAttachmentContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment-content", collectionResourceRel = "list", excerptProjection = CustomAttachmentContent.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContentEntity, Integer> {
}