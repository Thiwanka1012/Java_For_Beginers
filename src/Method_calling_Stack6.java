public class Method_calling_Stack6 {

    public static void m1(){
        System.out.println("M1");

    }

    public static void main(String[] args) {
        m1();
        m2();

    }


    public static void m2(){
        System.out.println("M2");
    }
}
