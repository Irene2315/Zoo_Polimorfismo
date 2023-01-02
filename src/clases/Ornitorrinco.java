package clases;

public class Ornitorrinco extends Animal {

private boolean enreserva;

public Ornitorrinco(String clase) {
	super(clase);
}

public boolean isEnreserva() {
	return enreserva;
}

public void setEnreserva(boolean enreserva) {
	this.enreserva = enreserva;
}
@Override
public  void parir() {
	System.out.println("Ha parido un ornitorrinco");
}
@Override
public String toString() {
	
	return super.toString() + "En reserva: " + this.isEnreserva();
}
}