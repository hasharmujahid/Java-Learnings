import java.util.Scanner;

public class MultiplicationTableOfIntiger {
    public static void main(String[] args) {
     int number=input();
     for (int i=0;i<=10;i++){
         int table= number*i;
         System.out.println(number+" * "+i+" = "+table);
     }

    }
    public static int input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        return scanner.nextInt();
    }
}
