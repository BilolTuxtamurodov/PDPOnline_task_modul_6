package com.company.PDPOnline.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "input_table")
public class InputEntity extends BaseEntity {
    @Column
    private LocalDateTime date = LocalDateTime.now();
    @Column
    private String factureNumber;
    @Column
    private String code;

    @Column(name = "supplier_id", nullable = false)
    private Integer supplierId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_id", insertable = false, updatable = false)
    private SupplierEntity supplier;

    @Column(name = "warehouse_id", nullable = false)
    private Integer warehouseId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "warehouse_id", insertable = false, updatable = false)
    private WarehouseEntity warehouse;

    @Column(name = "currency_id", nullable = false)
    private Integer currencyId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "currency_id", insertable = false, updatable = false)
    private CurrencyEntity currency;
}
