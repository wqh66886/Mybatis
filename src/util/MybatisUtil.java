package util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author: 王其浩
 * @ClassName: MybatisUtil
 * @Description:
 * @Date 2020/9/5
 * @version:
 */
public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory;
    private static SqlSession sqlSession;

    static {
        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("config/mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
    }

    public static SqlSession getSqlSession(){
        sqlSession = sqlSessionFactory.openSession();
        return  sqlSession;
    }
    public static void closeSqlSession(){
        if(sqlSession != null){
            sqlSession.close();
        }
    }
}
