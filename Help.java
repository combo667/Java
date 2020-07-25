
public class Help {
    public static void main(String [] args) throws java.io.IOException{
        char choice;
        System.out.println("Help On:");
        System.out.println("Input 1 for If statement!");
        System.out.println("Input 2 for Switch Case!");
        System.out.println("Please input your choice accordingly!");
        choice=(char)System.in.read();
        switch (choice) {
            case '1':
                System.out.println("if(condition){");
                System.out.println("//statement");
                System.out.println("}");
                
                break;
            case '2':
                System.out.println("switch(expression){");
                System.out.println("case evaluation");
                System.out.println("//....");
                System.out.println("default case");
                System.out.println("}");
                break;
            default:
                System.out.println("Sorry,but the input was wrong!");

                break;
        }

    }

}