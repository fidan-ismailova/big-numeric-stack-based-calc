package calculator;

import java.math.BigDecimal;

public class Main {
	/** an array of Objects, simulating user input */
	public static Object[] testInput = {
    	new BigDecimal("3419229223372036854775807.23343"),
        new BigDecimal("2.0"),
        "*",
    };

	public static void main(String[] args) {
		BigNumCalc calc = new BigNumCalc();
        System.out.println(calc.calculate(testInput));
	}
}
