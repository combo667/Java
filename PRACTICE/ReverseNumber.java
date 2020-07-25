import java.util.Scanner;

class Reverse{
    static int rev(int number){
        int rev_num=0;int mod;

        while(number>0){
            mod=number%10;
            rev_num=rev_num*10+mod;
            number/=10;
        }
        return rev_num;
    }
}

public class ReverseNumber {
    public static void main(String[] args) {
        int number ;
        System.out.println("Input the number :");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        System.out.println("The reversed Number is : "+Reverse.rev(number));
        sc.close();
    }
    
}