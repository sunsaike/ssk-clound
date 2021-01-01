package ssk.sysuser.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ssk.sysuser.po.SysUser;

import java.util.List;

@Component
@FeignClient(name="paymentserver")
public interface SysUserService {
//    @GetMapping("/ubyname/{id}")
//    public SysUser loadUserByUsername(String username);
    @GetMapping("/allu")
    public List<SysUser> loadAllUsers();
}
