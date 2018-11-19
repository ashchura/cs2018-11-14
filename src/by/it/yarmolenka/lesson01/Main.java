package by.it.yarmolenka.lesson01;

public class Main {
    public static void main(String[] args) {
        for (int i = -128; i <= -1; i++) {
            String binary = Integer.toBinaryString(i);
            if (binary.length()>8) binary=binary.substring(binary.length()-8);
            binary = String.format("%8s", binary).replace(" ", "0");
            String octal = Integer.toOctalString(Math.abs(i));
            octal = "-" + octal;
            String hex = Integer.toHexString(Math.abs(i));
            hex = "-" + hex;
            System.out.printf("%8s %6d %6s %6s %n",binary, i, octal, hex);
        }
        for (int i = 0; i <= 127; i++) {
            String binary = Integer.toBinaryString(i);
            if (binary.length()>8) binary=binary.substring(binary.length()-8);
            binary = String.format("%8s", binary).replace(" ", "0");
            String octal = Integer.toOctalString(Math.abs(i));
            String hex = Integer.toHexString(Math.abs(i));
            System.out.printf("%8s %6d %6s %6s %n",binary, i, octal, hex);
        }
    }
}
