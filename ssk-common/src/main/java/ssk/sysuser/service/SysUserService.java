package ssk.sysuser.service;

import ssk.sysuser.po.SysUser;

import java.util.List;

public interface SysUserService {
    public SysUser loadUserByUsername(String username);
    public List<SysUser> loadAllUsers();
}
