package mybatis.mapper;

import mybatis.entity.Comment;


/**
 * @author: 王其浩
 * @ClassName: comment
 * @Description:
 * @Date 2020/9/5
 * @version:
 */
public interface CommentMapper {

    Comment selectById(Integer id);

}
