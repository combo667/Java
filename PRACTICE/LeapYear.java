import java.util.Scanner;

class Test {
    static boolean checkYear(int year) {

        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        if (year % 4 == 0)
            return true;
        return false;

    }
}

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("INput the year!");
        year = sc.nextInt();

        if (Test.checkYear(year))
            System.out.println("The given year is a Leap Year!");
        else
            System.out.println("The given year is not a Leap Year!");

        sc.close();
    }

}