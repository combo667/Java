import java.util.Scanner;

class Fact{
    static int calcFactorial(int num){
        if(num==0)
            return 1;
        return (num*calcFactorial(num-1));
    }
}



public class Factorial {
    public static void main(String[] args) {
        int number;
        System.out.println("Input the number :");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        System.out.println("The factorial of "+number+" is :"+Fact.calcFactorial(number));

        sc.close();
        
    }
    
}