package com.objects.basics;

public class Employee1 {
    String name;
    String designation;

    public Employee1(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    double calcBonus(double basicAllowance){
        return basicAllowance;
    }
    double calcBonus(double basicAllowance, double houseAllowance, String gift){
        System.out.println("gift");
       return basicAllowance+houseAllowance;
    }
    double calcBonus(double basicAllowance, String gift, double houseAllowance, double carAllowance){
        System.out.println("gift");
        return basicAllowance+carAllowance;
    }

}
