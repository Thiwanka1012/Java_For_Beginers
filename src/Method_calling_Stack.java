public class Method_calling_Stack {
    public static void main(String[] args) {

        System.out.println("Start Main method"); //1
        second();
        System.out.println("End main method");   //2
    }

    public static void second(){
        System.out.println("Start Second method"); //3
        System.out.println("End Second method");   //4
    }
}
