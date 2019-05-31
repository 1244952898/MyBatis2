package pojo;

public class UserAddress extends TbUser {

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;

    @Override
    public String toString() {
        return this.getUsername()+"-"+this.getPassword()+"-"+ "UserAddress{" +
                "address='" + address + '\'' +
                '}';
    }
}
