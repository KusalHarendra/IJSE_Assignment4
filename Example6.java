public class Example6 {
    public static void main(String [] args) {
        int x=99;
if(x++==x){
 System.out.println("x++==x : "+x);
}
if(++x==x ){
 System.out.println("++x==x : "+x); // ++x==x : 101
}
if(x==x++){
 System.out.println("x==x++ : "+x); //x==x++ : 102
}
if(x==++x){
 System.out.println("x==++x : "+x);
}
if(++x==++x){
 System.out.println("++x==++x : "+x);
}
if(x++==x++){
 System.out.println("x++==x++ : "+x);
}
if(++x==x++){
 System.out.println("++x==x++ : "+x);   //++x==x++ : 109
}
    }
}
