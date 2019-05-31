package dao;

import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.TbUser;
import utils.SqlSessionFactoryUtils;

import static org.junit.Assert.*;

public class AddressDaoTest {
    @Test
    public void add() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        TbUser user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }
}