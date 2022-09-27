package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.User;

import java.util.List;

public interface SelectMapper {
    /*
    根据id查询用户信息
     */
    User getUserId(@Param("id") Integer id);
    List<User> getUser(@Param("id")int id);
}
