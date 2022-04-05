package com.github.yeeun_yun97.toy.learningkotlin.data;

public class UserJava {
    //attributes
    private String name;
    private int age;
    private String address;

    //constructor
    public UserJava(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //getter & setter
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return this.age; }
    public void setAge(int age) { this.age = age; }

    public String getAddress() { return this.address; }

    public void setAddress(String address) { this.address = address; }

    //toString

    @Override
    public String toString() {
        return "UserJava" + "(name=" + name + ", age=" + age + ", address=" + address + ")";
    }

    @Override
    public boolean equals(Object o) {
        UserJava that = (UserJava) o;
        if (that.name.equals(this.name) && that.age==this.age && that.address.equals(this.address)){
            return true;
        }else return false;
    }
}
