package util;

public interface IUtil {

	/**
	 * Method which return the answer of the user to the question given in parameter
	 * @param pPrompt : the question (String)
	 * @return : the answer (String)
	 */
	public abstract String getString(String pPrompt);

	/**
	 * Method which return the answer of the user to the question given in parameter
	 * @param pPrompt : the question (String)
	 * @return : the answer (int)
	 */
	public abstract int getInt(String pPrompt);

	/**
	 * Method which return the answer of the user to the question given in parameter
	 * @param pPrompt : the question (String)
	 * @return : the answer (char)
	 */
	public abstract char getChar(String pPrompt);

	/**
	 * Method which retrun the answer of the user to the question given in parameter
	 * @param pPrompt : the question (String)
	 * @return : the answer (double)
	 */
	public abstract double getDouble(String pPrompt);

	/**
	 * Method which prompt its parameter
	 * @param pPrompt : to prompt (String)
	 */
	public abstract void prompt(Object pPrompt);

}