public class Lable_for_Loop {
    public static void main(String[] args) {

        l1:for (int i = 0; i < 5; i++) {
            l2:for (int j = 0; j < 5; j++) {

                System.out.println("I:"+i +","+ "J:"+j);
                if (j==2){
                    break l1;
                }
            }
        }

    }
}
