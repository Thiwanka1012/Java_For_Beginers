public class Method_calling_Stack4_Parameterised_method_with_Return_type {
    public static void main(String[] args) {
        int x=100;
        x=print(x);
        System.out.println(x);
    }

    public static int print(int x){
        x++;
        return x;
    }
}
