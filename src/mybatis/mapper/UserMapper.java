package mybatis.mapper;

import mybatis.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author: 王其浩
 * @ClassName: UserMapper
 * @Description:
 * @Date 2020/9/5
 * @version:
 */
public interface UserMapper {

    User selectById(Integer id);

    List<User> selectAll();

    int updateById(@Param("id") Integer id, @Param("name") String username);

    List<User> selectByName(String username);

    int insertExample(User user);

    int deleteById(Integer id);
}
