package pbo5;

public class Restaurant {
	private Food[] food ;
	private static byte id=0;
	
	public Restaurant ( ) {
		food = new Food[10];
		
	}
	public void tambahMenuMakanan (String nama, double harga, int stok ) {
		this.food[id]= new Food(nama,harga, stok,id);
	}
	public void tampilMenuMakanan() {
		for (int i=0; i<id;i++) {
			if(!isOutOfStock(i)) {
				System.out.println(food[i].getId()+ food[i].getNama_makanan() +"["+food[i].getStok() +"]"+"\tRp.  "+food[i].getHarga_makanan());
				
			}
		}
	}
	
	public void pemesanan(byte id, int qty) {
		food[id].setStok(qty);
	}
	
	public boolean isOutOfStock(int id) {
		if (food[id].getStok() == 0) {
			return true;
		}else {
			return false;
		}
	}
	public static void nextId() {
		id++;
	}
}


