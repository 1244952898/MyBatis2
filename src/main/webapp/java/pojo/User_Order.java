package pojo;

import java.math.BigDecimal;
import java.util.List;

public class User_Order extends TbUser {
    private List<TbOrder> orderList;

    public List<TbOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<TbOrder> orderList) {
        this.orderList = orderList;
    }
}
