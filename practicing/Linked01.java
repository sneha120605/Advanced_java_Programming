class Linked01{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static void display(Node head){
        if(head==null)return;
        System.out.println(head.data);
        display(head.next);
    }
    
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(a.next.data);
        Node temp=a;
        for(int i=0;i<5;i++){
            System.out.println(temp.data);
            temp=temp.next;
        }
        display(a);
    }
}