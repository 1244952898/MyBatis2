package mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.*;
import utils.SqlSessionFactoryUtils;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class UserMapperTest {
    @Test
    public void getListByPojo() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        TbUser user = new TbUser();
        user.setUsername("l");
//        user.setStatus("");
        user.setId(8L);
        List<TbUser> userList = mapper.getListByPojo(user);
        for (TbUser u :
                userList) {
            System.out.println(u);
        }
        sqlSession.close();
    }

    @Test
    public void getUserByIdList() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        QueryVo queryVo = new QueryVo();
        List<Integer> idList=Arrays.asList(10,11,12,13);
        queryVo.setUserIdList(idList);
        List<TbUser> userList = mapper.getUserByIdList(queryVo);
        for (TbUser u :
                userList) {
            System.out.println(u);
        }
        sqlSession.close();
    }

    @Test
    public void updateEntityById() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        TbUser user = new TbUser();
        user.setId(1L);
        user.setUsername("sunwukong+1111");
        mapper.updateEntityById(user);
        sqlSession.close();
    }

    @Test
    public void getUserAddress() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserAddress user = mapper.getUserAddress(8);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void getOnetoOne(){
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User_Address user = mapper.getOnetoOne(8);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void getOneToMore(){
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        QueryVoOnToMore queryVoOnToMore=new QueryVoOnToMore();
        queryVoOnToMore.setUserId(8);
        List<User_Order> userOrders = mapper.getOneToMore(queryVoOnToMore);
        for (User_Order userOrder :
                userOrders) {
            String strDate=userOrder.getCreated()==null?"":new SimpleDateFormat("yyyy-MM-dd").format(userOrder.getCreated());
            System.out.println("username="+userOrder.getUsername()+"password="+userOrder.getPassword()+"phone="+userOrder.getPhone()+"created="+strDate);
            for (TbOrder order :
                    userOrder.getOrderList()) {
                System.out.println(order);
            }
        }

        sqlSession.close();
    }
}