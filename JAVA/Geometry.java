public class Geometry {
    void Area(int side){
        System.out.println("Area of square: "+(side*side));
    }
    void Area(int l,int b){
        System.out.println("Area of Rectangle :"+(l*b));
    }
    void Area(double r){
        System.out.println("Area of radius: "+(3.14*r*r));
    }
    public static void main(String[] args) {
        Geometry g = new Geometry();
        g.Area(5);
        g.Area(4, 6);
        g.Area(3.5);
    }
}
