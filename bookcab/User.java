package com.mycompany.bookcab;

/**
 *
 * @author kriz
 */
class User {
    
    private String full_name, address, phone, gender, plateNumber, carType;
    
    public User(String fname, String add, String phone, String gender, String pltNum, String brand){
        
        this.full_name = fname;
        this.address = add;
        this.phone = phone;
        this.gender = gender;
        this.plateNumber = pltNum;
        this.carType = brand;
    }
    public String getfname() {
        return full_name;
    }
    public String getadd() {
        return address;
    }
    public String getphone() {
        return phone;
    }
    public String getgender() {
        return gender;
    }
    public String getpltNum() {
        return plateNumber;
    }
    public String getbrand() {
        return carType
                 ;
    }
}
