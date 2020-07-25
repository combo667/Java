package stack;

public class Stack {
    private int Size;
    private int Top;
    private int[] Array;

    public Stack(int size) {
        Size = size;
        Array = new int[size];
        Top = -1;

    }
    public Stack() {
        Size = 20;
        Array = new int[Size];
        Top = -1;
    } 

    public boolean isEmpty() {
        if (this.Top == -1)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if (this.Top == this.Size - 1)
            return true;
        return false;
    }

    public int Pop() {
        int x = -1;
        if (!isEmpty()) {
            x = Array[Top];
            --Top;
            return x;
        } else
            return x;
    }

    public void Push(int element) {

        if (!isFull()) {
            ++Top;
            Array[Top] = element;
        }

    }

    public int stackTop() {
        if (!isEmpty())
            return Array[Top];
        else
            return -1;
    }

}