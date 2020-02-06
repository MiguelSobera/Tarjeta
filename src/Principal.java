
public class Principal {
	//Declaracion de los datos en el main
	public static void main(String[] args) {
		ITarjetaMonedero monedero = new Tarjeta("13247453753", "29553065C", 1594, 200);
		ITarjetaDebito tarjeta = new Tarjeta("1324567985", "29556545T", 1326, 200000);
		//Aclaracion del pago
		System.out.println("Pagando con tarjeta...");
		tarjeta.comprar(100, "29556545T");
		//Se termina de implementar datos en el main
		System.out.println("Importe Foster Hollywood 100€...");
		System.out.println("");
		System.out.println("El saldo actual del monedero es: " + monedero.getSaldo());
		System.out.println("Pagando con monedero...");
}
}