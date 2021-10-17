import java.util.Scanner;

public class StructuredPrograming {

    public static void main(String[] args) {
//        if (cond)
//            statment;

//        if(cond){
//            block of code; multiple statments;
//        } else {
//        block of code;
//    }
        int a;
//        a = inputInt("Enter a: ");
//        int b = inputInt("Enter b: ");
//        if (a>b){
//            System.out.println("The Value of a in grater then b");
//        } else {
//            System.out.println("The Value of b in grater then a");
//        }
        a = inputInt("Enter value for switched Statment: ");

//        switch (variable not nullable){
//            case val:
//                block of code;
//                break;
//            case val2:
//                block of code;
//                break;
//            default:
//                block of code;

        switch (a){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
            case 8:
                System.out.println("eight");
            case 9:
                System.out.println("nine");
            case 10:
                System.out.println("ten");
            default:
                System.out.println("this is not in our range;");
        }


    }

    public static int inputInt(String val){
        System.out.print(val);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
