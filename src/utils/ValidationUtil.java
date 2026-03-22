package utils;

public class ValidationUtil {
    private ValidationUtil(){}

    public static void requireNonNull(Object obj, String message){

        if(obj == null)
            throw new IllegalArgumentException(message);
    }

    public static void requirePositive(Long value, String message){

        if(value <= 0)
            throw new IllegalArgumentException(message);
    }

    public static void requireNonEmpty(String value, String message){

        if(value.isBlank())
            throw new IllegalArgumentException(message);
    }

}
