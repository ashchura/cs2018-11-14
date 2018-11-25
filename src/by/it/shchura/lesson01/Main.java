package by.it.shchura.lesson01;

public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        for (byte i = 0; i != -1; i++) {
            String binary = Integer.toBinaryString(i);
            String octal = Integer.toOctalString(i);
            String hexademical = Integer.toHexString(i);

            if (binary.length() > 8) {
                binary=binary.substring(binary.length() - 8);
            }
            if (octal.length() > 8) {
                octal=octal.substring(octal.length() - 8);
            }
            if (hexademical.length() > 8) {
                hexademical=hexademical.substring(hexademical.length() - 8);
            }

            binary = String.format("%8s", binary).replace(" ", "0");
            octal = String.format("%8s", octal).replace(" ", "0");
            hexademical = String.format("%8s", hexademical).replace(" ", "0");

            System.out.printf("%8s %8s %8s %4d %n", binary, octal, hexademical, i);
        }
    }
}
