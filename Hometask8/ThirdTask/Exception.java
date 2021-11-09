import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class Exception {
    public static void check() throws NullPointerException, FileNotFoundException,ArithmeticException, URISyntaxException {
        throw new FileNotFoundException();
    }
    public static void main(String[] args) throws URISyntaxException,ArithmeticException{
        try{
            check();
        }
        catch (FileNotFoundException e){
            e.fillInStackTrace();
            System.out.println("FileNotFoundException уже запущено");
        }
        catch (NullPointerException e){
            e.fillInStackTrace();
            System.out.println("NullPointerException уже запущено");
        }

    }
}
