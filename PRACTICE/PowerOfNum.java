import java.util.Scanner;

class Pow {
    static int power(int num, int exp) {
        if (exp == 0)
            return 1;
        return (num * power(num, exp-1));
    }

}

public class PowerOfNum {
    public static void main(String[] args) {
        int number, exp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the Number :");
        number = sc.nextInt();
        System.out.println("Input the Exponent :");
        exp = sc.nextInt();
        System.out.println("Value " + number + " raised to " + exp + " is = " + Pow.power(number, exp));
        sc.close();
    }
}