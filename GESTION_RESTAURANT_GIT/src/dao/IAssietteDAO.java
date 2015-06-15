package dao;

import metier.Assiette;
import metier.Type;

public interface IAssietteDAO extends IDAO {

	public Assiette getAssiette(String string, double d, Type entree);
}