package mapper;

import mybatis.entity.User;
import mybatis.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import util.MybatisUtil;

import java.util.Date;
import java.util.List;

/**
 * @author: 王其浩
 * @ClassName: UserTest
 * @Description:
 * @Date 2020/9/5
 * @version:
 */
public class UserTest {

    SqlSession sqlSession = MybatisUtil.getSqlSession();
    private UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

    @Test
    public void testSelect(){
        User user = userMapper.selectById(1);
        System.out.println(user);
    }

    @Test
    public void testSelectAll(){
        List<User> users = userMapper.selectAll();
        users.forEach(e-> System.out.println(e));
    }

    @Test
    public void testUpdateById(){
        int row = userMapper.updateById(3,"王其浩");
        sqlSession.commit();
        System.out.println("受影响行数:"+row);
    }

    @Test
    public void testSelectByName(){
        List<User> users = userMapper.selectByName("m");
        users.forEach(e-> System.out.println(e));
    }

    @Test
    public void testInsertExample(){
        User user = new User("巨石强森","112233","USER",new Date());
        int row = userMapper.insertExample(user);
        sqlSession.commit();
        System.out.println("受影响行数:"+row);
    }

    @Test
    public void testDeleteById(){
        int row = userMapper.deleteById(12);
        sqlSession.commit();
        System.out.println("受影响行数:"+row);
    }
}
