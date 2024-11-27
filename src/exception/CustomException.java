package exception;  // Changed to lowercase

class Custom extends Exception {
    public Custom(String s) {
        super(s);
    }
}

public class CustomException {
    public static void main(String[] args) {

        try {
            throw new Custom("Custom Class Exception");
        } catch (Custom e) {
            System.out.println("Exception Caught");
            System.out.println(e.getMessage());
        }
    }
}
