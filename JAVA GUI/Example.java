import javax.swing.*;

import javax.swing.JFrame;

public class Example extends JFrame{
    public Example(){

    }
    public Example(String s){
        super(s);
    }
    public static void main(String [] args){
        Example jf=new Example("JubeshApplication");
        jf.setSize(300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}