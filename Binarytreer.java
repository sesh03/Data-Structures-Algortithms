//Binary Tree Implementation
//Create a binary tree using classes and object in java

//implement preorder traversal 


package treetraversal;

class Node {
 char key ;
 Node left,right;
 Node (char key){
 this.key=key;
 }
}

class TreeTraversal {
  Node root;
  void preordertraversal (Node n) {
     if (n!=null) {
     System.out.print(n.key+" ");
     preordertraversal (n.left);
     preordertraversal (n.right);
}
}
 
 void postordertraversal( Node n){
  if ( n!=null){
   postordertraversal(n.left);
   postordertraversal(n.right);
   System.out.print(n.key+" ");
}
 }
 void inordertraversal( Node n){
  if ( n!=null){
   postordertraversal(n.left);
   System.out.print(n.key+" ");
   postordertraversal(n.right);
  }
 }
}

class Traversal {
  public static void main (String args[]){
  TreeTraversal t1= new TreeTrversal();
  t1.root= new Node('A');
  t1.root.left = new Node('B');
  t1.root.right= new Node ('C');
  t1.root.left.left= new Node ('D');
  t1.root.left.rght= new Node ('E');
  
  t1.preordertraversal(t1.root);
  System.out.println();
  t1.postordertraversal(t1.root);
  System.out.println();
  t1.inordertraversal (t1.root);
   
   
  } 
