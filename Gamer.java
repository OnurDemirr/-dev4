package Entities;

import java.rmi.RemoteException;

import Abstract.IEntities;


public class Gamer  implements IEntities {
	
	String adı;
	String soydaı;
	int dogumYılı;
	String tcİD;
	public Gamer(String adı, String soydaı, int dogumYılı, String tcİD) {
		super();
		this.adı = adı;
		this.soydaı = soydaı;
		this.dogumYılı = dogumYılı;
		this.tcİD = tcİD;
	}
	public String getAdı() {
		return adı;
	}
	public void setAdı(String adı) {
		this.adı = adı;
	}
	public String getSoydaı() {
		return soydaı;
	}
	public void setSoydaı(String soydaı) {
		this.soydaı = soydaı;
	}
	public int getDogumYılı() {
		return dogumYılı;
	}
	public void setDogumYılı(int dogumYılı) {
		this.dogumYılı = dogumYılı;
	}
	public String getTcİD() {
		return tcİD;
	}
	public void setTcİD(String tcİD) {
		this.tcİD = tcİD;
	}
	
	

}
