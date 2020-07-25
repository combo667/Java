
public class Guess {
    public static void main(String [] args) throws java.io.IOException{
        char x='k';
        char var=' ';
        System.out.println("Guess the choice !");
        var=(char)System.in.read();
        if(var==x|var=='K')
            System.out.println("You guessed it correct!");
        else
            System.out.println("Sorry,but you guessed it wrong!");
            
    }
}