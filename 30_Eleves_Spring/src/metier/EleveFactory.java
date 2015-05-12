package metier;

public class EleveFactory {
	
	// Design pattern Singleton
	
	protected static EleveFactory instance = null;
	
	public static EleveFactory getInstance()
	{
		if ( instance == null )
		{
			instance = new EleveFactory();
		}
		return instance;
	}
	
	public EleveFactory() {	}
	
	public IEleve getEleve ()
	{
        return new Eleve();
	}
	
	

}

