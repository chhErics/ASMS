package com.chen.pojo;

public class Depository {

    private String deNo;
    private String address;
    private String name;
    private String tel;

    public Depository() {
    }

    public Depository(String deNo, String address, String name, String tel) {
        this.deNo = deNo;
        this.address = address;
        this.name = name;
        this.tel = tel;
    }

    public String getDeNo() {
        return deNo;
    }

    public void setDeNo(String deNo) {
        this.deNo = deNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Depository{" +
                "deNo='" + deNo + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
