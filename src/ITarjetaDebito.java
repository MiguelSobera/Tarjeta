
public interface ITarjetaDebito {

	public void comprar(float importe, String dni);
	
	public void retirarCajero(float importe, int pin);
	
	public String getId();
	
	public void setId(int iId);
	
	public String getDniTitular();
	
	public int getSaldo();
	
	public void setPin(int iPin);
	
}
