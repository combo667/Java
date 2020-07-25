import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float value1,value2,temp;
        System.out.println("INput the first Number :");
        value1=sc.nextFloat();
        System.out.println("INput the second Number :");
        value2=sc.nextFloat();
        System.out.println("The numbers before swap is :");
        System.out.println("value 1="+value1+"\n"+"Value2 ="+value2);
        temp=value1;
        value1=value2;
        value2=temp;
        System.out.println("The values After swap is :");
        System.out.println("value 1="+value1+"\n"+"Value2 ="+value2);
        
    }
    
}