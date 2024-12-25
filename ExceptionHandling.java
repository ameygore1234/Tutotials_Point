package tutorials_point;

public class ExceptionHandling {
//unchecked exceptions
    public static void main(String[] args) {

        handleArithmeticException(200);
        handleNullPointerException(null);

    }


    public static void handleArithmeticException(int number)
    {
        try
        {
            int a = number/0;
        }
        catch (ArithmeticException exception)
        {
            exception.printStackTrace();
        }
    }

    public static void handleNullPointerException(String s)
    {
        try
        {
            System.out.println(s.length());
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }
    }
}
