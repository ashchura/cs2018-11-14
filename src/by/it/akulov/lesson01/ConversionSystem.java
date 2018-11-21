package by.it.akulov.lesson01;

public class ConversionSystem {
    public static void main(String[] args) {
        System.out.println("********************************************");
        System.out.println("*  DEC *      BIN *         OCT *      HEX *");
        System.out.println("********************************************");
        for (byte i = 0; i != -1; i++) {
            String binary = Integer.toBinaryString(i);
            String octal = Integer.toOctalString(i);
            String hex = Integer.toHexString(i);
            if (binary.length() > 8) {
                binary = binary.substring(binary.length() - 8);
            }
            binary = String.format("%8s", binary).replace(" ", "0");
            octal = String.format("%11s", octal).replace(" ", "0");
            hex = String.format("%8s", hex).replace(" ", "0");
            System.out.printf("* %4d * %8s * %11s * %8s *%n", i, binary, octal, hex);
        }
        // дополнительный вывод -1
        byte i1 = -1;
        String binary1 = Integer.toBinaryString(i1);
        String octal1 = Integer.toOctalString(i1);
        String hex1 = Integer.toHexString(i1);
        if (binary1.length() > 8) {
            binary1 = binary1.substring(binary1.length() - 8);
        }
        binary1 = String.format("%8s", binary1).replace(" ", "0");
        octal1 = String.format("%11s", octal1).replace(" ", "0");
        hex1 = String.format("%8s", hex1).replace(" ", "0");
        System.out.printf("* %4d * %8s * %11s * %8s *%n", i1, binary1, octal1, hex1);
        System.out.print("********************************************");
    }
}
