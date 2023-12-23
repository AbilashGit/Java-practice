public class Tree{
public Node root;
Tree(){
root=null;
}
class Node{
int value;
Node left;
Node right;
Node(int v){
this.value=v;
Node.left=Null;
Node.right=Null;
}
}

public void insert(int v){
insert(root,v);
}

public Node insert(Node node,int v){
if(node==null)
return new Node(v);
else if(v<node.value){
insert(node.left,v);
}
else
insert(node.right,v);
}
Tree t=new Tree();
t.insert(50);
t.insert(40);
t.insert(60);
t.insert(30);
t.insert(70);
t.insert(65);
t.insert(35);
}