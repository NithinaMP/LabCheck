 abstract class Vehicle {
    String model;
    String company;
    // Vehicle(){
    //     model="Unknown";
    //     company="Unknown";
    // }
    Vehicle(String model,String company){
        this.model=model;
        this.company=company;
    }
    abstract void display();  
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
          System.out.println("Vehicle Details:\n");
        System.out.println("Model: "+model);
        System.out.println("Company: "+company);
        System.out.println("No of doors: "+noOfDoors);
        System.out.println("Fuel type: "+fuelType);
    }
    
}
 class Electric extends Car {
    int batteryCapacity;
    Electric(String model,  String company,int noOfDoors, String fuelType,int batteryCapacity){
         super( model, company,noOfDoors,fuelType);
        this.batteryCapacity=batteryCapacity;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Battery capacity: "+batteryCapacity);
    }
    
}

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v;
        // v=new Car("model3", "BMW", 4, "petrol");
        // v.display();
        v=new Electric("model 1", "Tesla", 4, "Electric", 60);
        v.display();
    }
}
