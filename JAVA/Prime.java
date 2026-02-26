import java.util.Scanner;
public class Prime {
    void prime(int n){
        if(n<2){
            System.out.println("Not prime");
            return;
        }
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                System.out.println("Not prime");
            }
        } 
        System.out.println("Its prime");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        Prime obj = new Prime();
        obj.prime(num);
    }
}
