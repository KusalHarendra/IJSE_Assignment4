public class Example8 {
    public static void main(String [] args) {
        int x=9;
        if(x>=10){
            System.out.println("Success"); 
        }
        if(x++>=10){
           System.out.println("Success"); 
        } 
        if(++x>=10){
            System.out.println("Success");  //prints success
        }     
        if(++x>=x++){
            System.out.println("Success");     //prints success
        }
        if(++x>x++){
            System.out.println("Success"); 
        }
        if(x++>=x++){
            System.out.println("Success");
        }
        if(++x<=x++){
           System.out.println("Success");  //prints success
        }    
       if(x<=x++){
           System.out.println("Success");  //prints success
        }         

    }
}

