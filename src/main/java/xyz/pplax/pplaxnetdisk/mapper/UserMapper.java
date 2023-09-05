package xyz.pplax.pplaxnetdisk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xyz.pplax.pplaxnetdisk.domain.user.Role;
import xyz.pplax.pplaxnetdisk.domain.user.User;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    int insertUser(User user);

    int insertUserRole(@Param("userId") String userId, @Param("roleId") long roleId);

    List<Role>  selectRoleListByUserId(@Param("userId") String userId);

    String selectSaltByTelephone(@Param("telephone") String telephone);

    User selectUserByTelephoneAndPassword(@Param("telephone") String telephone, @Param("password") String password);

}
