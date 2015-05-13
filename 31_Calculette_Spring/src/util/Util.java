package util;

import java.util.Scanner;

public class Util {
	private static Scanner input = new Scanner(System.in);

	/**
	 * Method which return the answer of the user to the question given in parameter
	 * @param pPrompt : the question (String)
	 * @return : the answer (String)
	 */
	public static String getString(String pPrompt) 
	{
		System.out.println(pPrompt + "");
		return input.nextLine();
	}

	/**
	 * Method which return the answer of the user to the question given in parameter
	 * @param pPrompt : the question (String)
	 * @return : the answer (int)
	 */
	public static int getInt(String pPrompt) 
	{
		System.out.print(pPrompt + " ");
		int entier = input.nextInt();
		input.nextLine();
		return entier;
	}
	
	/**
	 * Method which return the answer of the user to the question given in parameter
	 * @param pPrompt : the question (String)
	 * @return : the answer (char)
	 */
	public static char getChar(String pPrompt)
	{
		System.out.print(pPrompt + " ");
		return input.nextLine().charAt(0);
	}
	
	/**
	 * Method which retrun the answer of the user to the question given in parameter
	 * @param pPrompt : the question (String)
	 * @return : the answer (double)
	 */
	public double getDouble (String pPrompt)
	{
		System.out.println(pPrompt+" ");
		double d = input.nextDouble();
		input.nextLine();
		return d;
	}
	
	/**
	 * Methode d'addition
	 * @param a Float
	 * @param b Float
	 * @return a+b Float
	 */
	public double addition( double a, double b )
	{
		return a+b;
	}
	
	/**
	 * Methode de soustraction
	 * @param a Float
	 * @param b Float
	 * @return a-b Float
	 */
	public static double soustraction( double a, double b )
	{
		return a-b;
	}
	
	/**
	 * Methode de multiplication
	 * @param a Float
	 * @param b Float
	 * @return a*b Float
	 */
	public static double multiplication( double a, double b )
	{
		return a*b;
	}
	
	/**
	 * Methode de division
	 * @param a Float
	 * @param b Float
	 * @return a/b Float
	 */
	public static double division( double a, double b )
	{
		return a/b;
	}
}
