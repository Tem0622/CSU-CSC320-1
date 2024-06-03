package Week6;
//Code from Japheth Ouko's weekly discussion

public class Methods {
    public static void main(String[] args) {
        // initialize variables with defined methods
        int first = sum(1, 2);
        double second = sum(1.5, 2.5);
        int genericFirst = genericSum(2, 3);
        double genericSecond = genericSum(2.5, 3.5);

        // print results
        System.out.println("Adding two integer numbers: " + first);
        System.out.println("Adding two double numbers: " + second);
        System.out.println("Adding two generic integer numbers: " + genericFirst);
        System.out.println("Adding two generic double numbers: " + genericSecond);
    }

    // method to add two integer numbers
    public static int sum(int x, int y) {
        return x + y;
    }

    // method to add two double numbers
    public static double sum(double x, double y) {
        return x + y;
    }

    /* Generic method to add both integer and double values */
    @SuppressWarnings("unchecked")
    public static <T extends Number> T genericSum(T num1, T num2) {
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() + num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Invalid data type");
        }
    }
}
