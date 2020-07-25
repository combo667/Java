import java.util.Scanner;

public class LargestAmong3 {
    public static void main(String[] args) {
        int value1, value2, value3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the three values :");
        value1 = sc.nextInt();
        value2 = sc.nextInt();
        value3 = sc.nextInt();
        if (value1 > value2 && value1 > value3)
            System.out.println("value1 is greatest =" + value1);
        else if (value2 > value3)
            System.out.println("Value2 is greatest =" + value2);
        else
            System.out.println("Value3 is greatest=" + value3);
        sc.close();
    }
}