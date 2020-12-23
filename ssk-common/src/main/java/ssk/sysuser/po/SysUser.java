package ssk.sysuser.po;

import lombok.Data;

@Data
public class SysUser {

    private Integer id;
    private String username;
    private String password;
    private Boolean enabled;
    private Boolean locked;

//    private List<Role> roleList;

}
