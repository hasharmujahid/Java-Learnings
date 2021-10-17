import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int number=number();
        int i=1;
        while(i<=10){
            int n =number*i;
            i++;
            System.out.println(n);
        }

    }
    public static int number(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number " );
        return scanner.nextInt();
    }
}

