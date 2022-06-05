package com.company.PDPOnline.projection;

import java.time.LocalDateTime;

public interface CustomOutput {
    LocalDateTime getDate();
    String getFactureNumber();
    String getCode();
    Integer getWarehouseId();

    Integer getClientId();
    Integer getCurrencyId();
}
