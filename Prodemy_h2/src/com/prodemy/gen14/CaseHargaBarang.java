/**
 * 
 */
package com.prodemy.gen14;

import com.prodemy.gen14.model.Barang;
import com.prodemy.gen14.util.StringUtil;

/**
 * @author Wahyu Wijayanto
 *
 */
public class CaseHargaBarang {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		String[]namaBarang = new String[3];
		int[]hargaBarang = new int[3];
		int[]jumlahStok = new int[3];
		
		namaBarang[0] = "Oreo";
		hargaBarang[0] = 5000;
		jumlahStok[0] = 10;
		
		namaBarang[1] = "Silverqueen";
		hargaBarang[1] = 50000;
		jumlahStok[1] = 20;
		
		namaBarang[2] = "Ultra";
		hargaBarang[2] = 7000;
		jumlahStok[2] = 13;
	
	for (int i=0; i<namaBarang.length; i++) {
		//System.out.println("Nama:"+namaBarang[i]+ "-> harga:"+hargaBarang[i]+" -> stok:"+jumlahStok[i]);
	}
	
	
	Barang[] daftarBarang = new Barang[2];
	
	Barang b1 = new Barang("Oreo", 5000, 10);
	Barang b2 = new Barang();
	b2.setNama("BengBeng");
	
	b2.setHarga(1000);
	
	b2.setPersediaan(10);
	
	daftarBarang[0] = b1;
	daftarBarang[1] = b2;
	for (int i=0; i<daftarBarang.length; i++) {
		String harga = StringUtil.toRupiah(daftarBarang[i].getHarga());
		System.out.println("Nama:"+daftarBarang[i].getNama()+"->harga: "+harga+"->stok:"+daftarBarang[i].getPersediaan());	
	}
		
		//BELAJAR, BUATLAH 3 MACAM BUAH DENGAN HARGA DAN STOK YANG BERBEDA DISETIAP BUAHNYA
		
		/*String[]namaBuah=new String[3];
		int[]hargaBuah=new int[3];
		int[]stokBuah=new int[3];
		
		namaBuah[0]="Jambu";
		hargaBuah[0]=5000;
		stokBuah[0]=10;
		
		namaBuah[1]="Apel";
		hargaBuah[1]=7000;
		stokBuah[1]=20;
		
		namaBuah[2]="Salak";
		hargaBuah[2]=9000;
		stokBuah[2]=30;
		
		for(int i=0;i<namaBuah.length;i++) {
			System.out.println("Nama:"+namaBuah[i]+ "->Harga:Rp."+hargaBuah[i]+ "->Stok:"+stokBuah[i]+"Kg");
		}*/
		
	}

}
