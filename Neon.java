import java.util.*;
public class Neon {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n * n;
        int sum = 0;
        while (sq > 0){ 
        sum += sq % 10; 
        sq /= 10; 
}
        if(sq==n){
        System.out.println("Neon number");
}else{
       System.out.println("Not Neon number");
    }
  }
}
