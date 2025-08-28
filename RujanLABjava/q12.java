package RujanLABjava;

class MyException extends Exception { // custom exception
    MyException(String msg){ super(msg); }
}

public class q12 {
    static void demoThrows() throws ArithmeticException {
        int a=5, b=0;
        int c = a/b; // throws exception
    }

    public static void main(String[] args){
        // a) try-catch-finally
        try {
            int x = 5/0;
        } catch(Exception e){ System.out.println("Exception caught"); }
        finally { System.out.println("Finally block"); }

        // b) multiple catch
        try {
            int arr[] = {1,2};
            System.out.println(arr[5]);
        } catch(ArithmeticException e){ System.out.println("Divide error"); }
          catch(ArrayIndexOutOfBoundsException e){ System.out.println("Array error"); }

        // c) nested try
        try {
            try { int a=5/0; } 
            catch(ArithmeticException e){ System.out.println("Inner catch"); }
        } catch(Exception e){ System.out.println("Outer catch"); }

        // d) throw
        try { throw new Exception("Manual throw"); } 
        catch(Exception e){ System.out.println(e.getMessage()); }

        // e) throws
        try { demoThrows(); } 
        catch(Exception e){ System.out.println("Caught throws exception"); }

        // f) custom exception
        try { throw new MyException("Custom Exception"); } 
        catch(MyException e){ System.out.println(e.getMessage()); }

        System.out.println("\nLab No.: 12");
        System.out.println("Name: Rujan Rajlawat");
        System.out.println("Roll No./Section: 22081013");
    }
}
