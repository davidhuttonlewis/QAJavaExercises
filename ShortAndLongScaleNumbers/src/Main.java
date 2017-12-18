import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {

		Main m1 = new Main();

		m1.setUpNumber();

	}

	void setUpNumber() {

		String appNum = "";
		String hundred = "";
		String thousand = "";
		String million = "";
		String billion = "";
		String trillion = "";
		String quadrillion = "";
		String quintillion = "";
		String sextillion = "";
		BigInteger num = new BigInteger("1234567891111");
		String conNum = String.valueOf(num);
		int length = conNum.length();
		appNum = String.format("%024d", num);

		hundred += appNum.substring(appNum.length() - 3, appNum.length());
		thousand += appNum.substring(appNum.length() - 6, appNum.length() - 3);
		million += appNum.substring(appNum.length() - 9, appNum.length() - 6);
		billion += appNum.substring(appNum.length() - 12, appNum.length() - 9);
		trillion += appNum.substring(appNum.length() - 15, appNum.length() - 12);
		quadrillion += appNum.substring(appNum.length() - 18, appNum.length() - 15);
		quintillion += appNum.substring(appNum.length() - 21, appNum.length() - 18);
		sextillion += appNum.substring(appNum.length() - 24, appNum.length() - 21);

		printShortScale(hundred, thousand, million, billion, trillion, quadrillion, quintillion, sextillion, length);
		printLongScale(hundred, thousand, million, billion, trillion, quadrillion, quintillion, sextillion, length);
	}

	void printShortScale(String hundred, String thousand, String million, String billion, String trillion,
			String quadrillion, String quintillion, String sextillion, int length) {

		if (!(length < 21))
			System.out.print(sextillion + " Sextillion, ");
		if (!(length < 18))
			System.out.print(quintillion + " Quintillion, ");
		if (!(length < 15))
			System.out.print(quadrillion + " Quadrillion, ");
		if (!(length < 12))
			System.out.print(trillion + " Trillion, ");
		if (!(length < 9))
			System.out.print(billion + " Billion, ");
		if (!(length < 6))
			System.out.print(million + " Million, ");
		if (!(length < 3))
			System.out.print(thousand + " thousand, ");
		if (length > 0)
			System.out.println(hundred);

	}

	void printLongScale(String hundred, String thousand, String million, String billion, String trillion,
			String quadrillion, String quintillion, String sextillion, int length) {

		if (!(length < 21))
			System.out.print(sextillion + " Trilliard, ");
		if (!(length < 18))
			System.out.print(quintillion + " Trillion, ");
		if (!(length < 15))
			System.out.print(quadrillion + " Billiard, ");
		if (!(length < 12))
			System.out.print(trillion + " Billion, ");
		if (!(length < 9))
			System.out.print(billion + " Milliard, ");
		if (!(length < 6))
			System.out.print(million + " Million, ");
		if (!(length < 3))
			System.out.print(thousand + " thousand, ");
		if ((length > 0))
			System.out.println(hundred);
	}

	String removeLeadingZeros(String str) {
		if (str == null) {
			return null;
		}
		char[] chars = str.toCharArray();
		int index = 0;
		for (; index < str.length(); index++) {
			if (chars[index] != '0') {
				break;
			}
		}
		return (index == 0) ? str : str.substring(index);
	}

}
