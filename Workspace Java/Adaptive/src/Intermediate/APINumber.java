package Intermediate;

import java.math.BigDecimal;
import java.text.DecimalFormat;


public class APINumber{
	public static void main(String[] args){
		System.out.println("API Number Constructor....");

		double decimal=7.27467;
		System.out.println("The test number : " +decimal);
		int decimalPlace=3;//the scale for the decimal

		//user of BigDecimal class
		BigDecimal bd = new BigDecimal(decimal);


		//set the scale and round of if >=0.5
		bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
		double bigDecimal= bd.doubleValue();
		System.out.println("BigDecimal rounded in 3rd decimal : " + bigDecimal);

		System.out.println("");

		//use of DecimalFormat
		DecimalFormat decFormat= new DecimalFormat("#");//patern
		double formatDecimal= new Double(decFormat.format(decimal)).doubleValue();
		System.out.println("Decimal Format rounded in 2nd decimal" + formatDecimal);

		System.out.println("");
		System.out.println("-------------------------");
		System.out.println("");

		DecimalFormat numFormat;
		String number;
		//2 digits before decimal point and then 2 digits (rounded)
		numFormat = new DecimalFormat("000.##");
		number = numFormat.format(-15.567);
		System.out.println("1. DecimalFormat with . :" + number);

		System.out.println("");

		numFormat = new DecimalFormat("'$'00.##");
		number = numFormat.format(15.567);
		System.out.println("2. DecimalFormat with '$' :" + number);
		System.out.println("");

		//use of, to group numbers
		numFormat = new DecimalFormat("#,###,###");
		number = numFormat.format(1556789);
		System.out.println("3. DecimalFormat with ',' :" + number);

		System.out.println("");

		//user of % for percentage
		numFormat = new DecimalFormat("%");
		number = numFormat.format(0.15);
		System.out.println("4. DecimalFormat with '%' :" + number);
		System.out.println("");

		// 2digits before decimal point and 2 digits after
		numFormat = new DecimalFormat("00.00");
		number = numFormat.format(15.56213217);
		System.out.println("5. DecimalFormat with '4'digits :" + number);
		
		System.out.println("");

		//left part of decimal number
		numFormat = new DecimalFormat("##");
		number = numFormat.format(156.567);
		System.out.println("6. DecimalFormat with  no decimal part:" + number);
		System.out.println("");


		//5 or less digits in the decimal part
		numFormat = new DecimalFormat(".##");
		number = numFormat.format(1890.562132137);
		System.out.println("7. DecimalFormat with 5 or less digits int the decimal part:" + number);
		System.out.println("");


		//String 'JCG' in front of the number
		numFormat = new DecimalFormat("'JCG'000.#");
		number = numFormat.format(15.567);
		System.out.println("8. DecimalFormat with  no decimal part:" + number);


	}
}