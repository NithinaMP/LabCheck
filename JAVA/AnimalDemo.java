abstract class Animal {
    private String species;
    protected int age;
    protected double weight;
    String color;
    
    Animal(){
        species="unknown";
        age=0;
        weight=0.0;
        color="Unknown";
    }
    Animal(String species,int age,double weight,String color){
        this.species=species;
        this.age=age;
        this.weight=weight;
        this.color=color;
    }
    Animal(Animal a){
        this.species=a.species;
        this.age=a.age;
        this.weight=a.weight;
        this.color=a.color;
    }
    String getSpecies(){
        return species;
    }
    abstract void display();
}

class Dog extends Animal {
        String breed;
        String name;
        String owner;

        Dog(String species,int age,double weight,String color,String breed,String name, String owner){
            super(species,age,weight,color);
            this.breed=breed;
            this.name=name;
            this.owner=owner;
        }
        @Override
        void display(){
            System.out.println("\nDOG DETAILS:");
            System.out.println("Species: "+getSpecies());
            System.out.println("Age: "+age);
            System.out.println("Weight: "+weight);
            System.out.println("Colour: "+color);
            System.out.println("Breed: "+breed);
            System.out.println("Name: "+name);
            System.out.println("Owner: "+owner);
        }
        
}
class Cat extends Animal {
          String name;
          String eyeColor;
          double tailLength;
        Cat(String species,int age,double weight,String color,String name,String eyeColor,
          double tailLength){
            super(species,age,weight,color);
            this.name=name;
            this.tailLength=tailLength;
            this.eyeColor=eyeColor;
          }
    @Override
    void display(){
        System.out.println("\nCat DETAILS:");
            System.out.println("Species: "+getSpecies());
            System.out.println("Age: "+age);
            System.out.println("Weight: "+weight);
            System.out.println("Colour: "+color);
            System.out.println("Name: "+name);
            System.out.println("Eye Colour: "+eyeColor);
            System.out.println("Tail length "+tailLength);

    }
    
}

class AnimalDemo{
    public static void main(String[] args) {
        Animal a;
        a= new Dog("Canine", 4, 18.5, "Brown", "labrador",
         "Buddy", "Rahul");
         a.display();
         a=new Cat("Feline", 3, 6.2, "White", "Kitty", 
         "Blue", 25.0);
         a.display();
    }
}
