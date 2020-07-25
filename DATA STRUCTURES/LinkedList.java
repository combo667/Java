package linkedlist;

class LinkedList{
    private Node head;
    
    
    static class Node{
        private int data;
        private Node next;

        public Node(int d){
            data=d;
            next=null;
        }
    }

    public static void insert(LinkedList list,int data){
        Node new_node=new Node(data);
        new_node.next=null;

        if(list.head==null)
            list.head=new_node;
    }


}