package Entities;

import Abstract.IEntities;

public class Sale implements IEntities {
	String personelAdı;
	String personelinCalıştığıbölüm;
	String kullandığıKapmanya;
	public Sale(String personelAdı, String personelinCalıştığıbölüm, String kullandığıKapmanya) {
		super();
		this.personelAdı = personelAdı;
		this.personelinCalıştığıbölüm = personelinCalıştığıbölüm;
		this.kullandığıKapmanya = kullandığıKapmanya;
	}
	public String getPersonelAdı() {
		return personelAdı;
	}
	public void setPersonelAdı(String personelAdı) {
		this.personelAdı = personelAdı;
	}
	public String getPersonelinCalıştığıbölüm() {
		return personelinCalıştığıbölüm;
	}
	public void setPersonelinCalıştığıbölüm(String personelinCalıştığıbölüm) {
		this.personelinCalıştığıbölüm = personelinCalıştığıbölüm;
	}
	public String getKullandığıKapmanya() {
		return kullandığıKapmanya;
	}
	public void setKullandığıKapmanya(String kullandığıKapmanya) {
		this.kullandığıKapmanya = kullandığıKapmanya;
	}
	

}
