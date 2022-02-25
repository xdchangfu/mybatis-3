package org.apache.ibatis.example;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author xiaodong.chang
 * @date 2022-02-21 15:24
 */
public interface EmployeesMapper {
  Employee selectByPrimaryKey(@Param("id") int id, @Param("firstName") String firstName);
  List<Employee> selectByPrimaryKey(Map params);
}
