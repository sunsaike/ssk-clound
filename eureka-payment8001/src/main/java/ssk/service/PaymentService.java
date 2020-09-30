package ssk.service;

import ssk.po.Payment;

public interface PaymentService {
    public Payment getPaymentById(Long id);
    public Long addPayment(Payment payment);
}
