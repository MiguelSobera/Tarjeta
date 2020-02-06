
public class Principal {
	//Final de la tarea 3
	public static void main(String[] args) {
		ITarjetaMonedero monedero = new Tarjeta("1234567890", "12345678A", 1234, 500);
		ITarjetaDebito tarjeta = new Tarjeta("1234567890", "12345678A", 5678, 60000);
		//Tarea 9 terminada
		System.out.println("Pagando con tarjeta...");
		tarjeta.comprar(20, "1234567890");
		//tarea 10 terminada
		System.out.println("Importe Pizza Hut 20€...");
		System.out.println("");
		System.out.println("El saldo actual del monedero es: " + monedero.getSaldo());
		System.out.println("Pagando con monedero...");
}
}