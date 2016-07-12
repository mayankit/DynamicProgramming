package com.mayank.strings;

public class CaesarCipher {

	public static void main(String[] args) {
		String str = "abcdefGHIJKLmno";

		String s1 = encrypt(25, str);
		String s2 = decrypt(25, s1);
		System.out.println(s1);
		System.out.println(s2);
		
		String s3 = ciperEncrypt(25,str);
		String s4 = ciperDecrypt(25,s3);
		
		System.out.println(s3);
		System.out.println(s4);
	}

	private static String decrypt(int i, String str) {
		StringBuilder sb = new StringBuilder();

		for (char cha : str.toCharArray()) {
			int value = (int) cha;

			if (value > 96 && value < 123) {
				value = value - 25;
				if (value < 97) {
					value = value + 26;
				}
				sb.append(Character.toChars(value));
			} else {
				value = value - 25;
				if (value < 65) {
					value = value + 26;
				}
				sb.append(Character.toChars(value));
			}

		}
		return sb.toString();
	}

	private static String encrypt(int i, String str) {
		StringBuilder sb = new StringBuilder();

		for (char cha : str.toCharArray()) {
			int value = (int) cha;

			if (value > 96 && value < 123) {
				value = value + 25;
				if (value > 122) {
					value = value - 26;
				}
				sb.append(Character.toChars(value));
			} else {
				value = value + 25;
				if (value > 90) {
					value = value - 26;
				}
				sb.append(Character.toChars(value));
			}

		}
		return sb.toString();
	}

	private static String ciperEncrypt(int shift, String str) {

		StringBuilder sb = new StringBuilder();

		for (char cha : str.toCharArray()) {

			int value = (int) cha;
			if (value > 96 && value < 123) {
				value = ((value + shift - 97) % 26) + 97;
			} else {
				value = ((value + shift - 65) % 26) + 65;
			}
			sb.append(Character.toChars(value));
		}
		return sb.toString();

	}

	private static String ciperDecrypt(int shift, String str) {

		return ciperEncrypt(26-shift, str);
	}

}
