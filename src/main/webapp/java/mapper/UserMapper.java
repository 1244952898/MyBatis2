package mapper;

import pojo.*;

import java.util.List;

public interface UserMapper {
    TbUser getUserById(Integer id);

    List<TbUser> getListByUserName(String username);

    List<TbUser> getListByQueryVo(QueryVo queryVo);
    List<TbUser> getListByPojo(TbUser user);
    List<TbUser> getUserByIdList(QueryVo queryVo);
    void updateEntityById(TbUser user);
    UserAddress getUserAddress(Integer id);
    User_Address getOnetoOne(Integer id);
    List<User_Order> getOneToMore(QueryVoOnToMore queryVoOnToMore);
}
