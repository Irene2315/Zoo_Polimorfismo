package clases;

public class Perro extends Animal{
private String raza;

public Perro(String clase) {
	super(clase);
}

public String getRaza() {
	return raza;
}

public void setRaza(String raza) {
	this.raza = raza;
}

@Override
public  void parir() {
	System.out.println("Ha parido un perro");
}

@Override
public String toString() {
	
	return super.toString() + " Raza: " + this.getRaza();
}


}
