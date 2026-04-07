class Node{
    int data;
    Node left,right;
    Node(int x){
        data=x;
        left=right=null;
    }
}
class Tree02{
    public static int countnodes(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        int left_height=countnodes(root.left);
        int right_height=countnodes(root.right);
        return (left_height+right_height)+1;


    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.right.left=new Node(6);
        root.left.left.left=new Node(7);
        System.out.println("number of nodes: "+ countnodes(root));
    }
}