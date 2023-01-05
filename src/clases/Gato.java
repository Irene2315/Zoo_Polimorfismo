package clases;

public class Gato extends Animal{
private int vidas;

public Gato(String clase) {
	super(clase);
	
}

public int getVidas() {
	return vidas;
}

public void setVidas(int vidas) {
	this.vidas = vidas;
}
@Override
public  void parir() {
	System.out.println("Ha parido un gato");
}
@Override
public String toString() {
	
	return super.toString() + " Vidas: " + this.getVidas();
}
}