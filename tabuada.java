import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
     
    Scanner leia = new Scanner(System.in);
        
    int N = leia.nextInt();  
        
     for (int i = 1; i <=10;i++){
     System.out.printf("%d x %d = %d\n", i,N,(i * N));
   
    }
  }
}
