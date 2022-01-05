package Entities ;

import Abstract.ICampingService;
import Abstract.IEntities;

public class Camping implements IEntities{
	String kapanyaAdı;
	int indirimOranı;
	int normalfiyat;
	int indirimlifiyat= normalfiyat- normalfiyat*indirimOranı/100;
	int indirimKodu;
	int kodluİndirim=indirimlifiyat- indirimlifiyat*5/100;
	
	
	public String getKapanyaAdı() {
		return kapanyaAdı;
	}
	public void setKapanyaAdı(String kapanyaAdı) {
		this.kapanyaAdı = kapanyaAdı;
	}
	public int getIndirimOranı() {
		return indirimOranı;
	}
	public void setIndirimOranı(int indirimOranı) {
		this.indirimOranı = indirimOranı;
	}
	public int getNormalfiyat() {
		return normalfiyat;
	}
	public void setNormalfiyat(int normalfiyat) {
		this.normalfiyat = normalfiyat;
	}
	public int getIndirimlifiyat() {
		return indirimlifiyat;
	}
	public void setIndirimlifiyat(int indirimlifiyat) {
		this.indirimlifiyat = indirimlifiyat;
	}
	public int getIndirimKodu() {
		return indirimKodu;
	}
	public void setIndirimKodu(int indirimKodu) {
		this.indirimKodu = indirimKodu;
	}
	public int getKodluİndirim() {
		return kodluİndirim;
	}
	public void setKodluİndirim(int kodluİndirim) {
		this.kodluİndirim = kodluİndirim;
	}
	
	public Camping(String kapanyaAdı, int indirimOranı, int normalfiyat, int indirimlifiyat, int indirimKodu,
			int kodluİndirim) {
		super();
		this.kapanyaAdı = kapanyaAdı;
		this.indirimOranı = indirimOranı;
		this.normalfiyat = normalfiyat;
		this.indirimlifiyat = indirimlifiyat;
		this.indirimKodu = indirimKodu;
		this.kodluİndirim = kodluİndirim;}
	
	
	

}
