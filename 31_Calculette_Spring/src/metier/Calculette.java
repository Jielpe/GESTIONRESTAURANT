package metier;

public class Calculette implements ICalculette {
	
	public Calculette() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see metier.ICalculette#addition(double, double)
	 */
	@Override
	public double addition( double a, double b )
	{
		return a+b;
	}
	
	/* (non-Javadoc)
	 * @see metier.ICalculette#soustraction(double, double)
	 */
	@Override
	public double soustraction( double a, double b )
	{
		return a-b;
	}
	
	/* (non-Javadoc)
	 * @see metier.ICalculette#multiplication(double, double)
	 */
	@Override
	public double multiplication( double a, double b )
	{
		return a*b;
	}
	
	/* (non-Javadoc)
	 * @see metier.ICalculette#division(double, double)
	 */
	@Override
	public double division( double a, double b )
	{
		return a/b;
	}
}
