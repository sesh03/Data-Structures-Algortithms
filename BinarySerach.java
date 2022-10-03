//Create a binary serach tree

package binaryserachtree;

class Node {
  char key;
  Node left,right;
  
  Node (char key){
    this.key= key;
  }
} 

Class BinarySolution {
  Ndoe root;
  void inserkey ( char key){
    root = insertInTree (root, key);
  }
  
  Node indertInTree (Node root, char key ){
    if (root == null) {
      root = new Node (key);
      return root;
    }
    
    if (key < root.key){
      root.left = insertInTree(root.left, key);
    }else if (key > root.key){
      root.right= inserInTree(root.right, key);
    } 
    return root;
  }
  void preordertraversal (Node root) {
    if (root!= null){
      System.out.println (root.key +" ");
      preordertraversal(root.left);
      preordertraversal(root.right);
    }     
}
}

public class BST { 
  
  public static void main (String args[]){
    BinarySolution t1= new BinarySolution ();
    t1.insertkey('C');
    t1.insertkey('D');
    t1.insertkey('T');
    t1.insertkey('M');
    
    t1.preordertraversal(t1.root);
  }
  
