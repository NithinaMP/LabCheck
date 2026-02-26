 class Vehicle {
    String model;
    String company;
    Vehicle(){
        model="Unknown";
        company="Unknown";
    }
    Vehicle(String model,String company){
        this.model=model;
        this.company=company;
    }
    void display(){
        System.out.println("Vehicle Details:\n");
        System.out.println("Model: "+model);
        System.out.println("Company: "+company);
    }
    
}
 class Car extends Vehicle {
    int noOfDoors;
    String fuelType;
    Car( String model,  String company,int noOfDoors, String fuelType){
        super( model, company);
        this.fuelType=fuelType;
        this.noOfDoors=noOfDoors;
    }
    @Override
    void display(){
        System.out.println("No of doors: "+noOfDoors);
        System.out.println("Fuel type: "+fuelType);
    }
    
}
public class ElectricCAr]] {

    
}

class VehicleDemo {
    public static void main(String[] args) {
        
    }
}
