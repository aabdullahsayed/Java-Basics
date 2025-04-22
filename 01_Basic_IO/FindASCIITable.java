public class FindASCIITable {


        public static void main(String[] args) {
            System.out.println("ASCII Table (Characters 32-127):");
            System.out.println("---------------------------------");
            for (int i = 32; i < 128; i++) {
                System.out.printf("%d: %c\n", i, (char) i);
            }
            System.out.println("---------------------------------");
        }
    }