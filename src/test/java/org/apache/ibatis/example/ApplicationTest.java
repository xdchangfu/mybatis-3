package org.apache.ibatis.example;

import org.apache.ibatis.builder.xml.XMLConfigBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.submitted.resolution.cachereffromxml.UserMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiaodong.chang
 * @date 2022-02-18 16:09
 */
public class ApplicationTest {

  public static void main(String[] args) throws IOException {
    String resource = "org/apache/ibatis/example/mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);

//    XMLConfigBuilder parser = new XMLConfigBuilder(inputStream, null, null);
//    Configuration configuration = parser.parse();
//    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);

    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();
//    List<Object> lists = sqlSession.selectList("com.foo.bean.BlogMapper.queryAllBlogInfo");
//    System.out.println(sqlSessionFactory.getConfiguration());

    //3.使用SqlSession查询
//    Map<String,Object> params = new HashMap<String,Object>();
//    params.put("min_salary", 10000);
//    EmployeesMapper mapper = sqlSession.getMapper(EmployeesMapper.class);

    Map parmars = new HashMap<>();
    //这里index和listrow 就是mapper里面要取的key值
    parmars.put("id", 100);
    parmars.put("firstName", "Steven");

    List<Employee> objects = sqlSession.selectList("org.apache.ibatis.example.EmployeesMapper.selectByPrimaryKey", parmars);
    for (Employee e : objects) {
      System.out.println(e.getFirstName());
      System.out.println(e.getLastName());
    }
  }
}
