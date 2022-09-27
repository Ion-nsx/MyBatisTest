import mapper.ParameterMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import pojo.User;

import java.util.List;

public class Test {

    @org.junit.Test
    public void testGetAllUser(){
        SqlSession sqlSession=SelSessionUtils.getSqlSession();
        ParameterMapper mapper=sqlSession.getMapper(ParameterMapper.class);
        List<User> list=mapper.getAllUser();
        list.forEach(user -> System.out.println(user));
    }
    /*
    MyBatis获取参数值的俩种方式${}和#{}
    * ${}本质是字符串拼接
    * #{}本质是占位符赋值,优先使用
     */


}
