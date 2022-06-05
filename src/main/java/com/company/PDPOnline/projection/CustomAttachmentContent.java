package com.company.PDPOnline.projection;

import com.company.PDPOnline.entity.AttachmentContentEntity;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = AttachmentContentEntity.class)
public interface CustomAttachmentContent {
    Byte getAByte();
    Integer getAttachmentId();
}
