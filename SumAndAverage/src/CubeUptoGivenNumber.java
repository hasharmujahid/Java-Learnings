import java.util.Scanner;

public class CubeUptoGivenNumber {
    public static void main(String[] args) {

        int number=input();
        for (int i=0;i<=number;i++){
            int cubeofhenumberis=i*i*i;
            System.out.println("the cube of the number "+i+"is eqaul to "+cubeofhenumberis);

        }
    }
    public static int input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        return scanner.nextInt();
    }

}
