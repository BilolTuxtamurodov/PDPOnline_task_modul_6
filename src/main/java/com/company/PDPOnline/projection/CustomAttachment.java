package com.company.PDPOnline.projection;

import com.company.PDPOnline.entity.AttachmentEntity;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = AttachmentEntity.class)
public interface CustomAttachment {
    String getName();
    Long getSize();
    String getContentType();
}
