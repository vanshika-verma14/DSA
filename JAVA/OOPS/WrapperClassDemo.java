public class WrapperClassDemo {
    public static void main(String[] args) {
        // Wrapper class usage examples
        Integer myInt = Integer.valueOf(10);
        Double myDouble = Double.valueOf(5.5);
        Character myChar = Character.valueOf('X');
        System.out.println("Integer wrapper: " + myInt);
        System.out.println("Double wrapper: " + myDouble);
        System.out.println("Character wrapper: " + myChar);

        // Manual boxing: converting primitive to wrapper
        int originalInt = 100;
        Integer wrappedInt = Integer.valueOf(originalInt);
        System.out.println("Manually boxed Integer: " + wrappedInt);

        // Manual unboxing: converting wrapper to primitive
        Integer boxedInteger = 200;
        int extractedInt = boxedInteger.intValue();
        System.out.println("Manually unboxed int: " + extractedInt);

        // Convert a numeric string to an int
        String numericStr = "123" ;
        int convertedInt = Integer.parseInt(numericStr);
        System.out.println("String to int using parseInt: " + convertedInt);

        // String to Double conversion using parseDouble
        String priceStr = "99.99";
        Double price = Double.parseDouble(priceStr);
        System.out.println("String to Double: " + price);
        // Demonstrating autoboxing
        Integer autoWrapped = 50; // automatic int to Integer conversion
        System.out.println("Autoboxed Integer value: " + autoWrapped);
        // Demonstrating auto-unboxing
        int autoUnwrapped = autoWrapped; // automatic Integer to int conversion
        System.out.println("Auto-unboxed int value: " + autoUnwrapped);

        // Convert primitive char to Character wrapper
        char letter = 'Z';
        Character letterObj = Character.valueOf(letter);
        System.out.println("Character wrapper from char: " + letterObj);

        // Check if character is a letter
        boolean letterCheck = Character.isLetter('A');
        System.out.println("Is 'A' an alphabet letter? " + letterCheck);
    }
}
