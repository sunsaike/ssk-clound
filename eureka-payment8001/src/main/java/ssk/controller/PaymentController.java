package ssk.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ssk.sysuser.service.SysUserService;
import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private SysUserService sysUserService;

    @GetMapping("/ubyname/{id}")
    public void loadUserByUsername(@PathVariable("username") String username){
        sysUserService.loadUserByUsername(username);
    }

    @GetMapping("/allu")
    public void loadAllUsers(){
        sysUserService.loadAllUsers();
    }

    @GetMapping("/paymentbyid/{id}")
    public String getPaymentByid(@PathVariable("id") String id){
        log.info("@@@@ getPaymentByid id="+id);
        return "ID="+id+"SUCCCS";
    }
}
