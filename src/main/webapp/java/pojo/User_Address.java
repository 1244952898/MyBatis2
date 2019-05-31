package pojo;

public class User_Address extends TbUser {

  private TbAddress address;

    public TbAddress getAddress() {
        return address;
    }

    public void setAddress(TbAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return this.getUsername()+"-"+this.getPassword()+"-"+"User_Address{" +
                "address=" + address.getAddress() +"getContact=" + address.getContact() +
                '}';
    }
}
