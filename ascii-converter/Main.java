public class Main {
    public static void main(String[] args) {
        String text = "Jasmine";

        System.out.print("ASCII decimal values: ");

        for (int i = 0; i < text.length(); i++) {
            int decimalValue = text.charAt(i);

            System.out.print(decimalValue);

            if (i < text.length() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }
}

