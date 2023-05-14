public class Example9 {
    public static void main(String [] args) {
    int x=100,y=99;
    if(x==y){
        System.out.println("Success"); 
    }
    else{
        System.out.println("Failed");   //prints Failed
    }
    if(x++==++y){
        System.out.println("Success"); //prints Success
    }
    else{
        System.out.println("Failed");   
    }
    if(x++==y++) {
        System.out.println("Success"); 
    }
    else{
        System.out.println("Failed");   //prints Failed
    }
    if(++x==y++)
    {
        System.out.println("Success"); 
    }
    else{
        System.out.println("Failed");   //prints Failed
    }
    }
}
