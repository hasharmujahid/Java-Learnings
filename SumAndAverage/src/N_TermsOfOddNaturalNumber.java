import java.util.Scanner;

public class N_TermsOfOddNaturalNumber {
    public static void main(String[] args) {
        oddnaturalnumbers();

    }
    public static void oddnaturalnumbers(){

        int count=input();
        System.out.println("the odd numbers to the "+count+" term are");
        int sum=0;
        for (int n=0;n<=count; n++){

            if (n%2!=0){
                sum+=n;
                System.out.println(n);
            }

        }
        System.out.println("The Sum of odd Natural Number upto "+count+" is "+sum);
    }
    public static int input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        return scanner.nextInt();
    }
}
