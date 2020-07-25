import java.util.Scanner;

class armstrong {

    static boolean arms(int num) {
        int mod = 0, aux = num, sum = 0;
        while (num > 0) {
            mod = num % 10;
            sum += Pow.power(mod, 3);
            num /= 10;
        }

        if (sum == aux)
            return true;
        else
            return false;
    }

}

class Pow {
    static int power(int num, int exp) {
        if (exp == 0)
            return 1;
        return (num * power(num, exp - 1));
    }

}

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Input the number !");
        number = sc.nextInt();
        if (armstrong.arms(number))
            System.out.println("Number is palindrome!");
        else
            System.out.println("Number is not palindrome!");

        sc.close();
    }
}