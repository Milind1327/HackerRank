import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{
	public static int getHeight(Node root){
      //Write your code here
        if (root == null)
			return -1;
		else
		{
			/* compute the depth of each subtree */
			int lDepth = getHeight(root.left);
            //System.out.println("left sub tree: "+lDepth);
			int rDepth = getHeight(root.right);
          //  System.out.println("right sub tree: "+rDepth);
			/* use the larger one */
			if (lDepth > rDepth){
		//		System.out.println("left data of the BST "+root.data);
                return (lDepth + 1);
                
            }
			else{
              //  System.out.println("right data of the BST "+root.data);
				return (rDepth + 1);
            }
                
		}
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	 public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}