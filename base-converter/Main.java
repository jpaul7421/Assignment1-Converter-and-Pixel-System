public class Main {
    public static void main(String[] args) {
        String inputValue = "FF";
        int inputBase = 16;

        int decimalValue = Integer.parseInt(inputValue, inputBase);

        System.out.println("Input value: " + inputValue);
        System.out.println("Input base: " + inputBase);
        System.out.println("Binary: " 
                + Integer.toBinaryString(decimalValue));
        System.out.println("Decimal: " + decimalValue);
        System.out.println("Octal: " 
                + Integer.toOctalString(decimalValue));
        System.out.println("Hexadecimal: " 
                + Integer.toHexString(decimalValue).toUpperCase());
    }
}

