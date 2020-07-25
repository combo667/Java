import stack.Stack;
public class Example {
    public static void main(String[] args){
       
        Stack stack=new Stack(10);
        stack.Push(100);
        stack.Push(102);
        stack.Push(104);
        stack.Push(109);
        System.out.println(stack.Pop());
        System.out.println(stack.Pop());
        System.out.println(stack.Pop());

    }
}