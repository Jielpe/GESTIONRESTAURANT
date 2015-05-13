package metier;

public interface ICalculette {

	/**
	 * Methode d'addition
	 * @param a Float
	 * @param b Float
	 * @return a+b Float
	 */
	public abstract double addition(double a, double b);

	/**
	 * Methode de soustraction
	 * @param a Float
	 * @param b Float
	 * @return a-b Float
	 */
	public abstract double soustraction(double a, double b);

	/**
	 * Methode de multiplication
	 * @param a Float
	 * @param b Float
	 * @return a*b Float
	 */
	public abstract double multiplication(double a, double b);

	/**
	 * Methode de division
	 * @param a Float
	 * @param b Float
	 * @return a/b Float
	 */
	public abstract double division(double a, double b);

}