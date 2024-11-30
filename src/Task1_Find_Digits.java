import java.util.Scanner;

public class Task1_Find_Digits {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Insert A Number:");
        int number= input.nextInt();

        int digits=0;

        while(number!=0){
            number=number/10;                  //Floting point Division
            digits++;
        }
        System.out.println("Digit Count is-"+digits);

        System.out.println("------------------------------------------");
    }
}
