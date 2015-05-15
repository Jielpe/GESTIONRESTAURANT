
package metier;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class methodeUtil{
	
	/** Constructeur privé */
	private methodeUtil()
	{}
 
	/** Instance unique non préinitialisée */
	private static methodeUtil INSTANCE = null;
 
	/** Point d'accès pour l'instance unique du singleton */
	public static methodeUtil getInstance()
	{			
		if (INSTANCE == null)
		{ 	INSTANCE = new methodeUtil();	
		}
		return INSTANCE;
	}
	
	public Scanner input = new Scanner(System.in);
	
	
	
/**
	 * Method which return the answer of the user to the question given in
	 * parameter
	 * 
	 * @param pPrompt
	 *            : the question (String)
	 * @return : the answer (String)
	 */
	public String getString(String pPrompt) {
		System.out.println(pPrompt + "");
		return input.nextLine();
	}
	/**
	* Method which return the answer of the user to the question given in
	* parameter
	* @param pPrompt : the question (String)
	* @return : the answer (Date)
	*/
	public Date getDate(String pPrompt) throws ParseException {
		System.out.println(pPrompt + " ");
		return new SimpleDateFormat("dd/MM/yy").parse(input.nextLine());
	}
	/**
	 * Method which return the answer of the user to the question given in
	 * parameter
	 * 
	 * @param pPrompt
	 *            : the question (String)
	 * @return : the answer (char)
	 */
	public char getChar(String pPrompt) {
		System.out.print(pPrompt + " ");
		return input.nextLine().charAt(0);
	}
}