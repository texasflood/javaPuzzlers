import java.io.IOException;

public class Indecisive { 
    public static void main(String[] args) {
        System.out.println(decision());
    }

    static boolean decision() {
        try {
            return true;
        } catch (IOException e) {
            System.out.println("Error");
            return true;
        } finally {
            return false;
        }
    } 
}
