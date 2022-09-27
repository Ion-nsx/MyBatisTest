package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Emp;

import java.util.List;

public interface EmpMapper {
    /**
     * 查询所有的员工信息
     */
   List<Emp> getAllEmp();
   /**
   查询员工以及员工所对应的部门信息
    */
    Emp getEmpDept(@Param("eid") int eid);
}
