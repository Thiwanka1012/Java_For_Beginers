public class Method_calling_Stack_3 {
    public static void main(String[] args) {

        int x=100;
        System.out.println("Start main method");
        print();
        System.out.println(x);
        System.out.println("End main method");
    }

    public static void print(){
        int x=100;
        x++;
        System.out.println(x);
    }
}
