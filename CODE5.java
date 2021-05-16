import java.util.Scanner;
public class CODE5{
   public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      int binary[] = new int[20];
      int i=0;
      System.out.println("Enter the number that you want to convert decimal into binary: ");
      int num=scan.nextInt();
      while(num!=0)
      {  
         binary[i]=num%2;
         num/=2;
         i++;
      }
     System.out.println("binary number is: ");
     for(int j=i-1;j>=0;j--)
       System.out.print(binary[j]+" ");
   }  
}
