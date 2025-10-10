// public class Main{
//     public static void main(String args[]){
//         BTree b=new BTree();
//         //b.insert(1);
// b.insert(34);
// b.insert(20);
// b.insert(15);
// b.insert(25);
// b.insert(40);
// b.insert(37);
// b.insert(55);
// System.out.println("INORDER:");
// b.inorder(b.root);
// System.out.println();
// System.out.println("Postorder");
// b.postorder(b.root);
// System.out.println();
// System.out.println("Preorder");
// b.preorder(b.root);
// System.out.println();
// System.out.println("Last");
// b.leaf(b.root);

//     }
// }
// class Node{
//     int val;
//     Node left;
//     Node right;
//     public Node(int val){
//         this.val=val;
//         this.left=null;
//         this.right=null;
//     }
// }
// class BTree{
//     Node root;
//     public void insert(int val){
//         root=ir(root,val);
//     }
//     public Node ir(Node root,int val){
//         if(root==null){
//             root=new Node(val);
//             return root;
//         }
//         else if(val>root.val){
//                 root.right=ir(root.right,val);
            
//         }
//         else{
//             root.left=ir(root.left,val);
//         }
//         return root;
//     }
//     public void inorder(Node root){
//         if(root!=null){
//         inorder(root.left);
//         System.out.print(root.val+" ");
//         inorder(root.right);}
//     }
//     public void preorder(Node root){
//         if(root!=null){
//             System.out.print(root.val+" ");
//             preorder(root.left);
//             preorder(root.right);
//         }
//     }
//     public void postorder(Node root){
//         if(root!=null){
//         postorder(root.right);
//         postorder(root.left);
//         System.out.print(root.val+" " );}
//     }
//     public void leaf(Node root){
//         if(root!=null){
//             if(root.left==null && root.right==null){
//                 System.out.print(root.val+" ");

//             }
//             leaf(root.left);
//             leaf(root.right);
//         }
//     }
// }
public class Main{
    public static void main(String args[]){
        Btree b=new Btree();
        b.insert(10);
        b.insert(2);
        b.insert(30);
        b.inorder(b.root);
        b.postorder(b.root);
    }
}
class Node{
    int val;
    Node left;
    Node right;
    public Node(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
class Btree{
    Node root;
    public void insert(int val){
        root=ir(root,val);
       
    }
    public Node ir(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        else if(val>root.val){
            root.right=ir(root.right,val);
        }
        else{
            root.left=ir(root.left,val);
        }
        return root;
    }
    public void inorder(Node root){
        if(root!=null){
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }}
    public void postorder(Node root){
        if(root!=null){
            System.out.print(root.val+" ");
            postorder(root.left);
            postorder(root.right);
        }
    }
}