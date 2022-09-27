import mapper.ParameterMapper;
import mapper.SelectMapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class SelectTest {
    /*
    MyBatis查询功能:
    若查询的数据只有一条，可以通过实体类对象或者集合接收
    若查询的数据有多条，可以通过list集合接收，不能用实体类对象接收

     */
    @Test
    public void select(){
        SqlSession sqlSession=SelSessionUtils.getSqlSession();
        SelectMapper mapper=sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUserId(102));
    }
    @Test
    public void select1() {
        SqlSession sqlSession = SelSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUser(101));
    }
}
