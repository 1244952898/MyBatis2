package dao;

import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.QueryVo;
import pojo.TbUser;
import utils.SqlSessionFactoryUtils;

import java.util.List;

import static org.junit.Assert.*;

public class UserDaoTest {
    @Test
    public void getListByQueryVo() {
        QueryVo queryVo = new QueryVo();
        TbUser user = new TbUser();
        user.setUsername("a");
        user.setPassword("2");
        user.setStatus("1");
        queryVo.setUser(user);
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<TbUser> userList = mapper.getListByQueryVo(queryVo);
        for (TbUser usr :
                userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}