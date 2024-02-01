package org.example.w3resource.com.encapsulation;

public class Ex6 {
    //    Write a Java program to create a class called Car with private instance variables company_name, model_name, year,
//    and mileage. Provide public getter and setter methods to access and modify the company_name, model_name, and
//    year variables. However, only provide a getter method for the mileage variable.
    public static void main(String[] args) {
    Car car = new Car();
    car.setCompanyName("Ford");
    car.setModelName("Mustang");
    car.setYear(2020);
        int mileage = car.getMileage();
        String companyName = car.getCompanyName();
        String modelName = car.getModelName();
        int year = car.getYear();
        System.out.println("Company Name: " + companyName);
        System.out.println("Model Name: " + modelName);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
    }
}
class Car{
    private String companyName;
    private String modelName;
    private int year;
    private int mileage;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

}