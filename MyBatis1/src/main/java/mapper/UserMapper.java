package mapper;

import pojo.User;

import java.util.List;

public interface UserMapper {
    /*
    添加用户信息
     */
    //添加
    public int insertUser();
    //修改
    public void updateUser();
    //删除
    void deleteUser();
    //根据id查询用户信息
    User getUser();
    //查询所有用户信息
    List<User> getAll();
}
