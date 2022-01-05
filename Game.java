package Entities;

import Abstract.IEntities;

public class Game implements IEntities {
	
	String adı;
	String tarzı;
	int üretimYılı;
	int yasAralığı;
	public Game(String adı, String tarzı, int üretimYılı, int yasAralığı) {
		super();
		this.adı = adı;
		this.tarzı = tarzı;
		this.üretimYılı = üretimYılı;
		this.yasAralığı = yasAralığı;
	}
	public String getAdı() {
		return adı;
	}
	public void setAdı(String adı) {
		this.adı = adı;
	}
	public String getTarzı() {
		return tarzı;
	}
	public void setTarzı(String tarzı) {
		this.tarzı = tarzı;
	}
	public int getÜretimYılı() {
		return üretimYılı;
	}
	public void setÜretimYılı(int üretimYılı) {
		this.üretimYılı = üretimYılı;
	}
	public int getYasAralığı() {
		return yasAralığı;
	}
	public void setYasAralığı(int yasAralığı) {
		this.yasAralığı = yasAralığı;
	}
	
	

}
