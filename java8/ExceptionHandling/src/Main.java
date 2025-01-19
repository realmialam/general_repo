import com.exception.custom.MyCustomException;

public class Main {
    public static void main(String[] args) {
//        arithmeticException(); // arithmetic exception

//        try {
//            classNotFoundException();
//        }catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        finallyBlockException();
    }


    public static void arithmeticException(){
        throw new ArithmeticException();
    }

    public static void classCastException(){
        Object a = 0;
        System.out.println((String) a);
    }

    public static void classNotFoundException() throws ClassNotFoundException{
        throw new ClassNotFoundException();
    }

    public static void finallyBlockException(){
        try{
            int a = 2/0;
        }catch (ArithmeticException e){
            throw e;
        }finally {
            String str = "abc";
            int i = Integer.parseInt(str);
        }
    }
}