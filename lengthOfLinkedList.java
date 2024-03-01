class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
}
public class lengthOfLinkedList{
public static Node convertToLL(int arr[]){
    Node head=new Node(arr[0],null);
    Node mover=head;
    for(int i=1;i<arr.length;i++){
        Node temp=new Node(arr[i],null);
        mover.next=temp;
        mover=temp;
    }
    return head;
}
public static int lengthOfLL(Node head){
    int cnt=0;
    Node temp=head;
    while(temp!=null){
        temp=temp.next;
        cnt++;
    }
    return cnt;
}
public static void main(String args[]){
    int arr[]={2,3,5,8};
    Node head=convertToLL(arr);
    System.out.println(lengthOfLL(head));
    
}

}