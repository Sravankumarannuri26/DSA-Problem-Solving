public class deleteHead {
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
    public static Node removeHead(Node head){
        if(head==null) return head;
        head=head.next;
        return head;
    }
public static void main(String args[]) {
    int arr[] = {2, 5, 8, 7};
    Node head=convertToLL(arr);
    Node newHead=removeHead(head);
    System.out.println(newHead.data);
}
}
