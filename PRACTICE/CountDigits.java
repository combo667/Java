import java.util.Scanner;

class Count {
    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            ++count;
            num /= 10;
        }
        return count;
    }
}

public class CountDigits {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number :");
        num = sc.nextInt();
        System.out.println("Number of digits in " + num + " are :" + Count.digits(num));
        sc.close();

    }
}