public class Lilist{
public Node root;
public int i=0;
Lilist(){
root=null;
}
class Node{
int value;
Node next;
Node(int v){
this.value=v;
next=null;
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
else
node.next=insert(node.next,v);
return node;
}



public void output(Node node){
if(node!=null){
node.display();
output(node.next);
}
}

public void delete(Node node,int v){
if(root.value==v)
root=root.next;
else if(node==null)
System.out.println("No value found");
else if(node.next.value==v)
node.next=node.next.next;
else
delete(node.next,v);
}

public static void main(String args[]){
Lilist t=new Lilist();
t.insert(50);
t.insert(40);
t.insert(60);
t.insert(30);
t.insert(70);
t.insert(65);
t.insert(35);
t.output(t.root);
t.delete(t.root,35);
System.out.println();
System.out.println("After deletion");
t.output(t.root);
}
}