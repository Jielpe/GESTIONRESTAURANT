package util;

import java.util.Scanner;

public class Util implements IUtil {
	private static Scanner input = new Scanner(System.in);

	/* (non-Javadoc)
	 * @see util.IUtil#getString(java.lang.String)
	 */
	@Override
	public String getString(String pPrompt) 
	{
		System.out.println(pPrompt + "");
		return input.nextLine();
	}

	/* (non-Javadoc)
	 * @see util.IUtil#getInt(java.lang.String)
	 */
	@Override
	public int getInt(String pPrompt) 
	{
		System.out.print(pPrompt + " ");
		int entier = input.nextInt();
		input.nextLine();
		return entier;
	}
	
	/* (non-Javadoc)
	 * @see util.IUtil#getChar(java.lang.String)
	 */
	@Override
	public char getChar(String pPrompt)
	{
		System.out.print(pPrompt + " ");
		return input.nextLine().charAt(0);
	}
	
	/* (non-Javadoc)
	 * @see util.IUtil#getDouble(java.lang.String)
	 */
	@Override
	public double getDouble (String pPrompt)
	{
		System.out.println(pPrompt+" ");
		double d = input.nextDouble();
		input.nextLine();
		return d;
	}
	
	/* (non-Javadoc)
	 * @see util.IUtil#prompt(java.lang.String)
	 */
	@Override
	public void prompt(Object pPrompt)
	{
		System.out.println(pPrompt);
	}
}
