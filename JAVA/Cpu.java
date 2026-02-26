class Cpu {
    int price;

    Cpu(int price){
        this.price=price;
    }

    class Processor {
        int cores;
        String manufacturer;
        Processor(int cores,String manufacturer){
            this.cores=cores;
            this.manufacturer=manufacturer;
        }
        
        void display(){
        System.out.println("Processor cores: "+cores);
        System.out.println("Processor manufacturer: "+manufacturer);
        }
    }
    static class Ram {
        int memory;
        String manufacturer;

        Ram(int memory,String manufacturer){
            this.memory=memory;
            this.manufacturer=manufacturer;
        }
        void display(){
            System.out.println("Ram memory: "+memory);
            System.out.println("Ram manufacturer: "+manufacturer);
        }
    }

    public static void main(String[] args) {
        Cpu cpu=new Cpu(45000);
        Cpu.Processor processor= cpu.new Processor(8, "intel");
        Cpu.Ram ram=new Cpu.Ram(16, "Corsair");
        System.out.println("Cpu price: "+cpu.price);
        processor.display();
        ram.display();
    }
   
}
