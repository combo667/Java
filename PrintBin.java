class PrintBin{
    public static void main(String[] args) {
        byte value;
        value=127;
        System.out.println("The binary of "+value+" is :");
        for(int i=128;i>=1;i/=2){
            if((value&i)!=0)
                System.out.print("1 ");
            else
                System.out.print("0 ");
        }
        System.out.println();
    }
}