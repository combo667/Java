public class Sample{
    public static void main(String[] args) {
        int array[]={100,672,1,90,77,23,67,22,49,10};int temp;
        
        //Sorting the array using Bubble Sort
        System.out.println("The Sorted array is :");
        for(int i=0;i<10;++i){
            for(int j=0;j<9;++j){
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }


            }
        }

        //Printing the array elements
        for(int i=0;i<10;++i)
            System.out.println("Element at ["+i+"] is : "+array[i]);
    }
}