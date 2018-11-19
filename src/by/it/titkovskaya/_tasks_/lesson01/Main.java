public class Main {

    public static void main(String[] args) {
        for (byte i = 0; i != -1; i++) {
            String binary = Integer.toBinaryString(i);
            String octal = Integer.toOctalString(i);
            String hex = Integer.toHexString(i);
            if (binary.length() > 8) binary = binary.substring(binary.length() - 8);
            binary = String.format("%8s", binary).replace(" ", "0");
            octal = String.format("%8s", octal);
            hex = String.format("%8s", hex);
            System.out.printf("%8s %8s %8s %4d %n", binary, octal, hex, i);
        }
    }
}
