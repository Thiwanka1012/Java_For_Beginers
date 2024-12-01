public class Method_calling_Stack_2 {
    public static void main(String[] args) {

        System.out.println("Start main method");  //1
        m1();
        System.out.println("End main method");    //6
    }

    public static void m1(){
        System.out.println("Start m1 method");    //2
        m2();
        System.out.println("End m1 method");      //5
    }

    public static void m2(){
        System.out.println("Start m2 method");    //3
        System.out.println("End m2 method");      //4
    }
}
