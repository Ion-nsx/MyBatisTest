package mapper;

import pojo.Emp;

import java.util.List;

public interface DynamicSQLMapper {
    /**
     *
    多条件查询
     */
    List<Emp> getEmpByCondition(Emp emp);
    /*
    测试choose,when,otherwise
     */
    List<Emp> getEmpByChoose(Emp emp);
}
