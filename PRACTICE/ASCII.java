import java.util.Scanner;

public class ASCII{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value=0;
        System.out.println("Input the character :");

        value=(int)sc.next().charAt(0);
        System.out.println("The ascii value of "+(char)value+" is :"+value);
        


    }
}