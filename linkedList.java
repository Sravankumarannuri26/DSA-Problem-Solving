class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
}
public class linkedList {
    

    public static void main(String args[]) {
        int arr[] = {2, 5, 8, 7};
        Node y = new Node(arr[0],null);
        System.out.println(y);
    }
}
