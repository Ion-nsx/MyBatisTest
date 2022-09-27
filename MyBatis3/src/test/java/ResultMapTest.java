import mapper.EmpMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.Emp;

import java.util.List;

public class ResultMapTest {
    /*
    解决字段名和属性名不一致的方法
    1.为字段起别名，保持和属性名一致
    2.全局配置
    3.resultMap
     */

    @Test
    public void testEmp(){
        SqlSession sqlSession=SelSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> list=mapper.getAllEmp();
        list.forEach(emp -> System.out.println(emp));

    }
    //级联属性赋值多对一查询
    @Test
    public void testEmpDept(){
        SqlSession sqlSession=SelSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp=mapper.getEmpDept(1);
        System.out.println(emp);
    }
}
