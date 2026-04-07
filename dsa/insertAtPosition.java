class Node{
    int data;
    Node next,prev;
    Node(int x){
        data=x;
        next=prev=null;
    }
};
public class insertAtPosition{
    void insert(Node head,int pos,int x ){
        Node temp=new Node(x);
        if(pos==1){
            temp.next=head;
            head.prev=temp;
            head=temp;
            return;
        }
        Node curr=head;
        for(int i=1;i<pos-1 && curr!=null;i++){
            curr=curr.next;
        }
        if(curr==null){
            return;
        }
        temp.next=curr.next;
        temp.prev=curr;
        if(curr.next!=null){
            curr.next.prev=temp;
        }
        curr.next=temp;
        temp.next=null;
    }
}