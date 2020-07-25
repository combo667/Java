class chkNum {
    boolean isEven(int x) {
        if (x % 2 == 0)
            return true;
        else
            return false;
    }
}

public class Num {
    public static void main(String[] args) {
        int n = 299;

        chkNum x = new chkNum();
        if (x.isEven(n) == true)
            System.out.println("Number is Even!");
        else
            System.out.println("Number is Odd!");
    }
}