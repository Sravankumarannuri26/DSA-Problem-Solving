class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
}
public class searchAnElementInLL {
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
    public static int isElementPresent(Node head,int element){
        Node temp=head;
        while(temp!=null){
            if(temp.data==element)return 1;
                temp=temp.next;
        }       
        return 0;
    }
    public static void main(String args[]){
        int arr[]={2,3,5,8};
        Node head=convertToLL(arr);
        int result=isElementPresent(head,5);
        System.out.println(result);
        
        
    }
    
}
