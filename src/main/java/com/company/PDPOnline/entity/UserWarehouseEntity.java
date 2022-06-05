package com.company.PDPOnline.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "user_warehouse")
public class UserWarehouseEntity extends BaseEntity {
    @Column(name = "user_id", nullable = false)
    private Integer userId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private UserEntity user;

    @Column(name = "warehouse_id", nullable = false)
    private Integer warehouseId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "warehouse_id", insertable = false, updatable = false)
    private WarehouseEntity warehouse;

}
