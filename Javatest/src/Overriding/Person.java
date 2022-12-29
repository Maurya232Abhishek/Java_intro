package Overriding;

public class Person {

    String name, address, mobile;
    int age;

    public Person(String name, String address, String mobile, int age) {
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", mobile=" + mobile + ", age=" + age + '}';
    }
    
}
