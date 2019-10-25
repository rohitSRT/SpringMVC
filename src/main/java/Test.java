
class parenthellocode {
    
    parenthellocode(){
        printsomething();
        printStatic();
    }
    
    void printsomething(){
        System.out.println("Hi Parent");
    }
    
     void printStatic(){
        System.out.println("Hi Parent static");
    }
    
}
class childhellocode extends parenthellocode{
    childhellocode(){
        printsomething();
        printStatic();
    }
    
    childhellocode(String str){
        this();
        printsomething();
        printStatic();
    }
    void printsomething(){
        System.out.println("Hi Child");
    }
    
     void printStatic(){
        System.out.println("Hi child static");
    }
    
}

public class Test {
  
  public static void main(String[] args) {
    
   childhellocode child = new childhellocode("Ram Ram");
    
  }
  
}