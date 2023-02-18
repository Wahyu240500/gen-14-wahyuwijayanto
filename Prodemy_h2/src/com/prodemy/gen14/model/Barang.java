/**
 * 
 */
package com.prodemy.gen14.model;

/**
 * @author Wahyu Wijayanto
 *
 */
public class Barang {
	private String nama;
	public int harga;
	public int persediaan;
	
	public Barang() {
		super();
	}
	public Barang(String nama, int harga, int persediaan) {
		super();
		this.nama = nama;
		this.harga = harga;
		this.persediaan = persediaan;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public int getHarga() {
		return harga;
	}
	public void setHarga(int harga) {
		this.harga = harga;
	}
	public int getPersediaan() {
		return persediaan;
	}
	public void setPersediaan(int persediaan) {
		this.persediaan = persediaan;
	}

}
