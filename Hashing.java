public class Hashing{
public static int[] a=new int[7];
static void insert(int x){
int i=x%7;
int j=1;
while(a[i]!=0){
i=(x+j)%7;
j++;
}
a[i]=x;
}
public static void main(String[] args) {

int x=10,b=12,c=7,d=15,e=8,f=25,g=22,i;
insert(x);
insert(g);
insert(d);
insert(e);
insert(b);
insert(c);

insert(f);

for(i=0;i<7;i++){
System.out.print(a[i]+" ");
}
}
}
