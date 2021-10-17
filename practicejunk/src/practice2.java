import java.util.Scanner;


public class practice2 {
    public static void sumOfNaturalNumbers(){
        int starting_number=input_value();
        int count=1;
        int sum=0;
        while (starting_number!=0 && starting_number<100 && count<10) {
            sum += starting_number;
            count++;
            starting_number++;
            System.out.println(count + " Sum of the natural number is " + sum);
        }
    }
    public static int input_value(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a starting number");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        sumOfNaturalNumbers();

    }
}
