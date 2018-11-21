package by.it.piskur.lesson01C;

public class Main {

	public static void main(String[] args) {
			for (byte i = 0; i != -1; i++) {
			String binary = Integer.toBinaryString(i);
			String octal = Integer.toOctalString(i);
			String hex = Integer.toHexString(i);
			if (binary.length() > 8) binary = binary.substring(binary.length() - 8);
			if (octal.length() > 8) octal = octal.substring(octal.length() - 8);
			if (hex.length() > 8) hex = hex.substring(hex.length() - 8);
			binary = String.format("%8s", binary).replace(" ", "0");
			System.out.printf("%4d %15s %15s %15s %n", i, binary, octal, hex);
		}

	}
}
