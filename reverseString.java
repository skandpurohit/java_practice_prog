class Test{
String a,temp;
 Test(String s){
  a=s;
  }
void rev(){
  for(int i=0;i<a.length/2;i++){
   t=a[i];
   a[i]=a[a.length-(i+1)];
   a[a.length-(i+1)];
  }
 void display(){
  for(int i=0;i<a.length;i++){
  
  System.out.println("reverse is "+a[i]);
 }
}
 class ReverseString(){
  public static void main(String[] args){
   Test t=new Test("Soumya"); 
   t.rev();
   t.display();
  }
}