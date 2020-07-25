import java.util.Scanner;

class palindrome {
    static boolean palin(int number) {
        int mod = 0, sum = 0, aux;
        aux = number;
        while (number > 0) {
            mod = number % 10;
            sum = sum * 10 + mod;
            number /= 10;
        }
        if (sum == aux)
            return true;
        else
            return false;
    }
}

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        System.out.println("Input the number :");
        number = sc.nextInt();
        if ((palindrome.palin(number)))
            System.out.println("Number " + number + " is Palindrome!");
        else
            System.out.println("Number " + number + " is not Palindrome!");

        sc.close();
    }
}