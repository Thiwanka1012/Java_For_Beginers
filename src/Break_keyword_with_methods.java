public class Break_keyword_with_methods {
    public static void main(String[] args) {
        System.out.println("Main Method Start");                 //Starting main method
        print();                                                //method calling
        System.out.println("Main Method End");                //Ending main method

    }

    public static void print(){                                  //I call method named print

        System.out.println("Print Method Start");              //Print method starting

        for (int i = 0; i < 10; i++) {
            System.out.println("I:"+i);
            if (i==5){
                break;
            }

        }
        System.out.println("Print Method Ending");
    }
}
