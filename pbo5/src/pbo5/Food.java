package pbo5;

public class Food {
	private String nama_makanan;
	private double  harga_makanan;
	private int  stok;
	private byte id;
	
	public Food (String nama, double harga, int stok, byte id ) {
		this.nama_makanan= nama;
		this.harga_makanan=harga;
		this.stok=stok;
		this.id=id;
	}
	
	public byte getId() {
		return id;
	}
	public void setId(byte id) {
		this.id = id;
	}
	public String getNama_makanan() {
		return nama_makanan;
	}
	public void setNama_makanan(String nama_makanan) {
		this.nama_makanan = nama_makanan;
	}
	public double getHarga_makanan() {
		return harga_makanan;
	}
	public void setHarga_makanan(double harga_makanan) {
		this.harga_makanan = harga_makanan;
	}
	public int getStok() {
		return stok;
	}
	public void setStok(int kuantitas) {
		this.stok -= kuantitas;
	}
	
}
