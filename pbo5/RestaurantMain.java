package pbo5;

public class RestaurantMain {
	public static void main (String [] args) {
		Restaurant menu = new Restaurant ();
		menu.tambahMenuMakanan("Bala-Bala", 1_000,20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("gehu", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Tahu", 1_000, 8);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		Restaurant.nextId();
		
		
		
		
		menu.pemesanan((byte)0, 10);
		menu.tampilMenuMakanan();
		}

}
