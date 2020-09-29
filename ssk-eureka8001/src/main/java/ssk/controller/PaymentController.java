package ssk.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PaymentController {
    @GetMapping("/paymentbyid/{id}")
    public String getPaymentByid(@PathVoariable("id") String id){
        log.info("@@@@ getPaymentByid id="+id);
        return "ID="+id+"SUCCCS";
    }
}
