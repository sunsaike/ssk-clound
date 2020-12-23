package ssk.sysuser.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ssk.sysuser.po.SysUser;

import java.util.List;

@Service
@Slf4j
public class SysUserServiceImpl implements SysUserService {
    @Override
    public SysUser loadUserByUsername(String username) {
        log.info("7001====>loadUserByUsername");
        return null;
    }

    @Override
    public List<SysUser> loadAllUsers() {
        log.info("7001====>loadAllUsers");
        return null;
    }
}
