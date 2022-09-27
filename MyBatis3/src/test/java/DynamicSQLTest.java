import mapper.DynamicSQLMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Emp;

import java.util.List;

public class DynamicSQLTest {
    /*
    动态SQL:
    1.if:根据标签中test属性对应的表达式决定标签中的内容是否需要拼接到SQL中
    2.where:
    当where标签中有内容时，会自动生成where关键字，并且将内容前多余的and或or去掉
    当where标签中没有内容时，where此时没有任何效果
    注意:where标签不能将其中内容后的多余的and或or去掉
    3.trim
    prefix|suffix:将trim标签中的内容前面或后面添加指定内容
    suffixOverrides|prefixOverrides:将trim标签中的内容前面或后面去掉指定内容
    4.choose,when,otherwise，相当于if....else if.....else
    5.foreach
    6.sql标签

     */
    @Test
    public void testChoose(){
        SqlSession sqlSession = SelSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> list=mapper.getEmpByChoose(new Emp(null,"张三",23,"男","123@qq.com"));
        System.out.println(list);
    }
    @Test
    public void testDynamicSql(){
        SqlSession sqlSession = SelSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> list=mapper.getEmpByCondition(new Emp(null,"张三",null,"男","123@qq.com"));
        System.out.println(list);

    }
}
