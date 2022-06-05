package com.company.PDPOnline.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "attachment_content")
public class AttachmentContentEntity extends BaseEntity {
    @Column
    private Byte aByte;

    @Column(name = "attachment_id", nullable = false)
    private Integer attachmentId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "attachment_id", insertable = false, updatable = false)
    private AttachmentEntity attachment;
}
