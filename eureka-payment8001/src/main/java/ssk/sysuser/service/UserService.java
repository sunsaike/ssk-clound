package ssk.sysuser.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ssk.sysuser.mapper.UserMapper;
import ssk.sysuser.po.User;

import javax.annotation.Resource;

@Service
public class UserService implements UserDetailsService {
    @Resource
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        User user = userMapper.getUserByName(username);
        if(user == null){
            throw new UsernameNotFoundException("用户名不存在！");
        }
        user.setRoleList(userMapper.getRoleById(user.getId()));
        return user;
    }
}
