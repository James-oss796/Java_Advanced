package generics.bounded;

public class Calculator {
    public static <T extends Number> double square(T number){
        return number.doubleValue() * number.doubleValue();
    }

    public static <T extends Number> double cube(T number){
        return number.doubleValue()*number.doubleValue()*number.doubleValue();
    }

    public static <T extends Number> int add(T number){
        return number.intValue() + number.intValue();
    }

    public static <T extends Number> int subtract(T number){
        return number.intValue() - number.intValue();
    }

    public static <T extends Number> int divide(T number){
        return number.intValue() / number.intValue();
    }

    public static <T extends Number> int multiply(T number){
        return number.intValue() * number.intValue();
    }

    public static void main(String[] args) {
        System.out.print(Calculator.add(3) + Calculator.subtract(5) +  Calculator.multiply(6) +  Calculator.divide(4) + Calculator.cube(4) + Calculator.square(3));
    }
}
