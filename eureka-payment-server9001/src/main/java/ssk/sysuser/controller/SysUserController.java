package ssk.sysuser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ssk.sysuser.po.SysUser;
import ssk.sysuser.service.SysUserService;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class SysUserController {

    @Resource
    private SysUserService sysUserService;

    @GetMapping("/allu")
    public List<SysUser> loadAllUsers(){
        return sysUserService.loadAllUsers();
    }
}
