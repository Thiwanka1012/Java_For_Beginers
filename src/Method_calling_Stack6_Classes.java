class Demo{
    public static void main(String[] args) {      //we can create main method any classes

    }

    public static void m1(){                      //sub method in subclass

    }


}


public class Method_calling_Stack6_Classes {
    public static void main(String[] args) {        //main class..jvm gives his priority only this class only

        Demo.m1();
    }

}
