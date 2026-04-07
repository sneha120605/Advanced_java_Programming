 class Node{
    int data;
    Node left,right;
    Node(int x){
        data=x;
        left=right=null;
    }
 }
public class Tree03 {
    public static int countleafnodes(Node root){
        if(root==null)return 0;
        if(root.left==null && root.right==null)return 1;
        return countleafnodes(root.left)+countleafnodes(root.right);

    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.right.left=new Node(6);
        root.left.left.left=new Node(7);
        System.out.println("number of leaf nodes: "+ countleafnodes(root));
    }
}
