
public interface ITarjetaDebito {

	public void comprar(float importe, String dni);
	
	public void retirarCajero(float importe, int pin);
	
	public String getId();
	
	public String getDniTitular();
	
	public int getSalgo();
	
	public void setPin(int iPin);
	
}