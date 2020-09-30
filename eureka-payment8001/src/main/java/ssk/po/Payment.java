package ssk.po;

import lombok.Data;

@Data
public class Payment {
    private Long id;
    private Long orderId;
    private String orderName;
    private String status;
}
