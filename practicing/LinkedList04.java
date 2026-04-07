class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class LinkedList04 {
    public static void main(String[] args) {
        Node a=new Node(11);
        Node b=new Node(22);
        Node c=new Node(33);
        Node d=new Node(44);
        Node e=new Node(55);
        Node f=new Node(66);
        Node g=new Node(77);
        Node h=new Node(88);
        Node i=new Node(99);
        Node j=new Node(110);
        Node k=new Node(121);
        Node l=new Node(132);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;   
        f.next=e;
        g.next=h;
        h.next=i;
        i.next=j;
        j.next=k;
        k.next=l;



    }
}
