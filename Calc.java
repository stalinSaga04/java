class Calc{
void add(){
System.out.println(10+2);
}
void add(int a,int b){
System.out.println(a+b);
}
public static void main(String[] args){

Calc c = new Calc();
c.add();
c.add(20,10);
}
}

