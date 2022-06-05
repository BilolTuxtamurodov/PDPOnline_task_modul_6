package com.company.PDPOnline.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "product")
public class ProductEntity extends BaseEntity {
    @Column
    private String  name;
    @Column
    private String code;
    @Column
    private Boolean active = true;

    @Column(name = "measurement_id", nullable = false)
    private Integer measurementId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "measurement_id", insertable = false, updatable = false)
    private MeasurementEntity measurement;

    @Column(name = "photo_id", nullable = false)
    private Integer photoId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "photo_id", insertable = false, updatable = false)
    private AttachmentEntity photo;

    @Column(name = "category_id", nullable = false)
    private Integer categoryId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    private CategoryEntity category;

}
