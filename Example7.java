	public class Example7 {
    public static void main(String [] args) {
        int x=99;
        int y=99;
        if(x++==y){
            System.out.println("x++==y : "+x+" : "+y);  //x++==y : 100 : 99
        }
        if(++x==y){
            System.out.println("++x==y : "+x+" : "+y);
        }
        if(x==y++){
            System.out.println("x==y++ : "+x+" : "+y);
        }
        if(x==++y){
            System.out.println("x==++y : "+x+" : "+y);  //x==++y : 101 : 101  
        }
        if(++x==++y){
            System.out.println("++x==++y : "+x+" : "+y);    //++x==++y : 102 : 102
        }
        if(x++==y++){
            System.out.println("x++==y++ : "+x+" : "+y);        //x++==y++ : 103 : 103
           }
        if(++x==y++){
            System.out.println("++x==y++ : "+x+" : "+y);
           }
         if(x++==++y){
            System.out.println("x++==++y : "+x+" : "+y);
           }

    }
    
}
