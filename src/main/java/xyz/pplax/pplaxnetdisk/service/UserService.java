package xyz.pplax.pplaxnetdisk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qiwenshare.common.result.RestResult;
import xyz.pplax.pplaxnetdisk.domain.user.Role;
import xyz.pplax.pplaxnetdisk.domain.user.User;

import java.util.List;

public interface UserService extends IService<User> {


    String getUserIdByToken(String token);


    /**
     * 用户注册
     *
     * @param userBean 用户信息
     * @return 结果
     */
    RestResult<String> registerUser(User userBean);



    User findUserInfoByTelephone(String telephone);
    List<Role> selectRoleListByUserId(String userId);
    String getSaltByTelephone(String telephone);
    User selectUserByTelephoneAndPassword(String username, String password);







}
