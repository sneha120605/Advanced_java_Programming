class Node{
    int data;
    Node left,right;
    Node(int x){
        data=x;
        left=right=null;
    }
}
class Tree01{
    public static int heightofTree(Node root){
        if(root==null) return -1;
        if(root.left==null && root.right==null) return 0;
        int leftheight =heightofTree(root.left);
        int rightheight=heightofTree(root.right);
        return Math.max(leftheight,rightheight)+1;

    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.left.left.left=new Node(7);
        System.out.print("height of Tree : ");
        System.out.println(heightofTree(root));
    }
}