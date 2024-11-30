import java.util.Scanner;

public class Method_inloading_Part5_Local_variables_with_Returntype {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Insert Number 1:");
        int num1= input.nextInt();


        System.out.print("Insert Number 2:");
        int num2= input.nextInt();

        System.out.print("Insert Number 3:");
        int num3= input.nextInt();

        int sum=sum(num1,num2,num3);
        System.out.println("Total is:"+sum);




    }

    public static int sum(int x,int y,int z){
        int sum=x+y+z;
        return sum;
    }
}
