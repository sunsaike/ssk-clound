package ssk.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import ssk.role.po.Role;
import ssk.user.po.User;
import java.util.List;

@Mapper
public interface UserMapper {
    User getUserByName(String name);
    List<Role> getRoleById(Integer id);
}
