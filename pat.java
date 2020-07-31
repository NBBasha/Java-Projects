import java.util.*;
class Main{
public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the rous you wants:");
         int rows=sc.nextInt();
         System.out.print("");
      for(int i=1;i<=rows;i++){
        for(int j=0;j<rows-i;j++){
             System.out.print(" ");
             }
           for(int k=1;k<i;k++){
                System.out.print(k);
                }
             for(int l=i;l>=1;l--){
                   System.out.print(l);
                  }
            System.out.println("\n");
           }
       System.out.println("\nBasha\n51834537");
     }
}