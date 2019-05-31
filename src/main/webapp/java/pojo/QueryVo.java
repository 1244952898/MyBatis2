package pojo;

import java.util.List;

public class QueryVo {
    public TbUser getUser() {
        return user;
    }

    private List<Integer> userIdList;

    public List<Integer> getUserIdList() {
        return userIdList;
    }

    public void setUserIdList(List<Integer> userIdList) {
        this.userIdList = userIdList;
    }

    public void setUser(TbUser user) {
        this.user = user;
    }

    private TbUser user;
}
