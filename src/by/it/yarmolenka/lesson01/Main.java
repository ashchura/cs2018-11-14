package by.it.yarmolenka.lesson01;

public class Main {
    public static void main(String[] args) {
        for (int i = -128; i <= 127; i++) {
            String binary = Integer.toBinaryString(i);
            if (binary.length()>8) binary=binary.substring(binary.length()-8);
            binary = String.format("%8s", binary).replace(" ", "0");
            String octal = Integer.toOctalString(i);
            String hex = Integer.toHexString(i);
            System.out.printf("%8s %6d %12s %12s %n",binary, i, octal, hex);
        }
    }
}
