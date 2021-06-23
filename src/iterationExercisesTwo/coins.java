package iterationExercisesTwo;

public class coins {
	public static void main(String[] args) {
		givechange(458,2000);
	}

	private static void givechange(int d, int e) {
		// could do this without while loops if used floor division, but should probably do it in line with the tutorial. Might make output messy though
		// I think I have a rounding error even though it should all be doubles
		//Yep, changing it all to pennies to work in ints
		int changedue = e-d;
		int fifties = 0;
		while (changedue >= 5000) {
			changedue -= 5000;
			fifties ++;
		}
		if (fifties !=0) {
			System.out.println(fifties + " £50 notes");
		}
		int twenties = 0;
		while (changedue >= 2000) {
			changedue -= 2000;
			twenties ++;
		}
		if (twenties !=0) {
			System.out.println(twenties + " £20 notes");
		}
		int tens = 0;
		while (changedue >= 1000) {
			changedue -= 1000;
			tens ++;
		}
		if (tens !=0) {
			System.out.println(tens + " £10 notes");
		}
		int fives = 0;
		while (changedue >= 500) {
			changedue -= 500;
			fives ++;
		}
		if (fives !=0) {
			System.out.println(fives + " £5 notes");
		}
		int twos = 0;
		while (changedue >= 200) {
			changedue -= 200;
			twos ++;
		}
		if (twos !=0) {
			System.out.println(twos + " £2 coins");
		}
		int pounds = 0;
		while (changedue >= 100) {
			changedue -= 100;
			pounds ++;
		}
		if (pounds !=0) {
			System.out.println(pounds + " £1 coins");
		}
		int fiftyp = 0;
		while (changedue >= 50) {
			changedue -= 50;
			fiftyp ++;
		}
		if (fiftyp !=0) {
			System.out.println(fiftyp + " 50p coins");
		}
		int twentyp = 0;
		while (changedue >= 20) {
			changedue -= 20;
			twentyp ++;
		}
		if (twentyp !=0) {
			System.out.println(twentyp + " 20p coins");
		}
		int tenp = 0;
		while (changedue >= 10) {
			changedue -= 10;
			tenp ++;
		}
		if (tenp !=0) {
			System.out.println(tenp + " 10p coins");
		}
		int fivep = 0;
		while (changedue >= 5) {
			changedue -= 5;
			fivep ++;
		}
		if (fivep !=0) {
			System.out.println(fivep + " 5p coins");
		}
		int twop = 0;
		while (changedue >= 2) {
			changedue -= 2;
			twop ++;
		}
		if (twop !=0) {
			System.out.println(twop + " 2p coins");
		}
		int pennies = 0;
		while (changedue >= 1) {
			changedue -= 1;
			pennies ++;
		}
		if (pennies !=0) {
			System.out.println(pennies + " 1p coins");
		}
	}

}
