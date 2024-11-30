public class Break_Continue_Return_Keywords {
    public static void main(String[] args) {

        System.out.println("-----------------------------------------------------------------------------");

        //break
        System.out.println("BREAK KEY WORD");

        for (int i = 0; i < 10; i++) {
            System.out.println("I:"+i);
            if (i==5){
                break;
            }

        }

        System.out.println("-----------------------------------------------------------------------------");

        //continue

        System.out.println("CONTINUE KEY WORD");

        for (int i = 0; i <  10; i++) {
            if (i==5){
                continue;

            }
            System.out.println("I:"+i);

        }

        System.out.println("-----------------------------------------------------------------------------");

        //return

        System.out.println("RETURN KEY WORD");

        for (int i = 0; i < 10; i++) {
            if(i==5){
                return;
            }
            System.out.println("I:"+i);

        }
    }
}
