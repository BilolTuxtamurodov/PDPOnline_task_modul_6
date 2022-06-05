package com.company.PDPOnline.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "output_product")
public class OutputProductEntity extends BaseEntity {
    @Column
    private Long amount;
    @Column
    private Long price;

    @Column(name = "product_id", nullable = false)
    private Integer productId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private ProductEntity product;

    @Column(name = "output_id", nullable = false)
    private Integer outputId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "output_id", insertable = false, updatable = false)
    private OutputEntity output;
}
