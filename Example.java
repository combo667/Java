class Box{
    private int length,breadth,height;//properties
    //Methods
    public void setDimension(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;

    }
    //methods
    public void showDimension(){
        System.out.println("The length of the box is :"+length);
        System.out.println("The length of the box is :"+breadth);
        System.out.println("The length of the box is :"+height);
    }
}

class Example{
    public static void main(String [] args){
        Box smallBox=new Box();
        smallBox.setDimension(12, 10, 5);
        smallBox.showDimension();
        smallBox=new Box();
        smallBox.showDimension();
    }
}