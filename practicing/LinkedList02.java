public class LinkedList02 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;

        }
    }
      static Node head=null;
        static Node tail=null;
    public static void insertion(int val){
        
      
        Node newNode = new Node(val);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
        display(head);
    }
    public static void display(Node head){
        if(head==null)return;
       System.out.print(head.data+" ");
        display(head.next);
    }
    public static void insertAtHead(int Val){
        Node val=new Node(Val);
        if(head==null){
            head=val;
            tail=val;
        }else{
            val.next=head;
            head=val;
        }
        display(head);
    }
    public static void insertAt(int index,int val){
        Node newNode=new Node(val);
        Node temp=head;
        for(int i=0;i<=index-2;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        display(head);
    }
    public static void deleteAt(int index){
        Node temp=head;
        for(int i=0;i<=index-2;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        display(head);
    }
    public static void getAt(int index){
        Node temp=head;
        for(int i=0;i<=index-2;i++){
            temp=temp.next;

        }
        System.out.println(temp.next.data);
    }
    public static void main(String[] args) {
        System.out.println("Linked List Insertion:");
        insertion(5);
         
        insertion(55);
        insertion(555);
        System.out.println();
        System.out.println("insert at the start index 0:");
        insertAtHead(555555);
        System.out.println();
        System.out.println("insert the the givem index");
        insertAt(3,22);
        System.out.println();
        System.out.println("delete the given index");
         deleteAt(3);
         System.out.println();
         System.out.println("get at the index ");
         getAt(3);
    }
}
