package Kodutöö5;

public class Vendor {
    private String name;
    private String address;
    private String contact;
    private int phoneNum;

    public Vendor(String name, String address, String contact, int phoneNum) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.phoneNum = phoneNum;
    }

    public Vendor() {

    }

    @Override
    public String toString() {
        return "Vendor{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", phoneNum=" + phoneNum +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    public int getPhoneNum() {
        return phoneNum;
    }
}
