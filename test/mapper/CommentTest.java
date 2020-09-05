package mapper;

import mybatis.entity.Comment;
import mybatis.mapper.CommentMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import util.MybatisUtil;

/**
 * @author: 王其浩
 * @ClassName: CommentTest
 * @Description:
 * @Date 2020/9/5
 * @version:
 */
public class CommentTest {

    SqlSession sqlSession = MybatisUtil.getSqlSession();
    private CommentMapper commentMapper = sqlSession.getMapper(CommentMapper.class);

    @Test
    public void testSelectById(){
        Comment comment = commentMapper.selectById(1);
        System.out.println(comment);
    }
}
