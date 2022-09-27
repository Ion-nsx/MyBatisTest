import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.pojo.EmpExample;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class testMBG {
    @Test
    public void test(){
        SqlSession sqlSession = SelSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //查询所有数据
        List<Emp> list = mapper.selectByExample(null);
        list.forEach(emp -> System.out.println(emp));
        //根据条件查询
        EmpExample example=new EmpExample();
        example.createCriteria().andEmpNameEqualTo("张三").andAgeEqualTo(20);
        List<Emp> list1 = mapper.selectByExample(example);
        list1.forEach(emp -> System.out.println(emp));


    }
}
