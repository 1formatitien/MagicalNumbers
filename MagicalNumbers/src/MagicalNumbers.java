import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class MagicalNumbers {
	
	public int mIFirstBigInt;
	public int mISecondBigInt;
	
	public MagicalNumbers(){
		mIFirstBigInt = readInt();
		mISecondBigInt = readInt();
		//On doit supposer que le premier parametre 
		//est inférieur ou egal à celui du deuxieme
		if(mIFirstBigInt<=mISecondBigInt)
			displayMagicalNumber(mIFirstBigInt, mISecondBigInt);
		else
			displayMagicalNumber(mISecondBigInt, mIFirstBigInt);
	}
	
	public void clearScreen(){
		final String operatingSystem = System.getProperty("os.name");
		try {
			if (operatingSystem.contains("Windows"))
				Runtime.getRuntime().exec("cls");
			else
				Runtime.getRuntime().exec("clear");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}
	
	public int readInt() {
		int rIElem = 0;
		
		Scanner sc = new Scanner(System.in);
		boolean ok = true;
		try {
			clearScreen();
			System.out.println("Saisissez un entier\n");
			rIElem = sc.nextInt();
			System.out.println("Int : " + rIElem);
			ok = true;
		} catch (Exception e) {
			ok = false;
			readInt();
		}
		return rIElem;
	}
	
	public void displayMagicalNumber(int plMin, int plMax){
		System.out.println("Magic numbers : \n");
		for (int i = plMin+1; i < plMax; i++) {
			//L'ordre du test intervient sinon le resultat sera faux
			if((i%3==0)&&(i%5==0))
				System.out.print(" (H/S) | ");
			else
				if(i%3==0)
					System.out.print(" H | ");
				else
					if(i%5==0)
						System.out.print(" S | ");
					else
						System.out.print(" " + i + " | ");
		}
	}
	
	public static void main(String [] args){
		MagicalNumbers exe = new MagicalNumbers();
	}
}
