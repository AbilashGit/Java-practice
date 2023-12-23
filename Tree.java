public class Tree{
private Node root;
Tree(){
root=null;
}

static class Node{
int value;
Node left;
Node right;
Node(int v){
this.value=v;
left=null;
right=null;
}

void display(){
System.out.print(" --> "+value);
}
}

void insert(int v){
root=insert(root,v);
}

public Node insert(Node node,int v){
if(node==null)
return new Node(v);
else if(v<node.value){
node.left=insert(node.left,v);
}
else
node.right=insert(node.right,v);
return node;
}


 public void output(Node node){
    if(node != null){
      output(node.left);
      node.display();
      output(node.right);
    }
  }

public static void main(String[] args) {
Tree t=new Tree();
t.insert(50);
t.insert(40);
t.insert(60);
t.insert(30);
t.insert(70);
t.insert(65);
t.insert(35);
t.output(t.root);

}
}