package mapper;

import pojo.TbAddress;
import pojo.TbUser;

import java.util.List;

public interface AddressMapper {
    void AddEntity(TbAddress address);
    TbAddress getEntityById(Integer id);

}
