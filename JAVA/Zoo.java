public class Zoo {
    String name;
    String[] region;
    Zoo(String name,String[] region){
        this.name=name;
        this.region=region;
    }
    public class Enclosure {
        String name;
        String type;
        String[] animals;
        Enclosure(String name,String type,String[] animals){
            this.name=name;
            this.type=type;
            this.animals=animals;
        }
        void display(){
            System.out.println("Enclosure name: "+name);
            System.out.println("Type:"+type);
            System.out.println("Animals: ");
            for(String a:animals){
                System.out.println(a+" ");
            }
            System.out.println();
        }
    }
    static class Contact {
        String address;
        String phone;
        Contact(String address,String phone){
            this.address=address;
            this.phone=phone;
        }
        void display(){
            System.out.println("Address: "+address);
            System.out.println("Phone: "+phone);
        }
    }
    void displayZoo(){
        System.out.println("Regions: ");
        for(String r:region){
            System.out.println(r+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] region ={"Area-1","Area-2"};
        Zoo zoo =new Zoo("City zoo",region);
        Zoo.Enclosure e1= zoo.new Enclosure("Grass land", "Outdoor",
            new String[]{"Lion","Deer","Zebra"});
        Zoo.Enclosure e2=zoo.new Enclosure("Aquatic", "Indoor", 
            new String[]{"Fish","Turtle"});
        Zoo.Contact c =new Zoo.Contact("Main road,Kottakal", "6548793215");
        System.out.println("Zoo Name: "+zoo.name);
        zoo.displayZoo();
        System.out.println("\nContact Details");
        c.display();
        System.out.println("\nEnclosure ");
        e1.display();
        e2.display();
    }
}
