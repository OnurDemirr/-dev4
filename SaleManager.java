package Concrete;

import Abstract.ICampingService;
import Abstract.IGameService;
import Abstract.ISaleService;
import Entities.Camping;
import Entities.Game;
import Entities.Gamer;
import Entities.Sale;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;

public class SaleManager implements ISaleService, ICampingService, IGameService{
	
	ICampingService campingService;
	Sale sale;
	Game game;

	@Override
	public void satıs(Gamer gamer) {
		
		System.out.println("bu oyun "+ gamer.getAdı() +" isimli oyucuya satılmıştır");
		
	}

	public SaleManager(Sale sale) {
		super();
		this.sale = sale;
	}

	public SaleManager() {
		// TODO Auto-generated constructor stub
	}

	
		
	

	@Override
	public void kampanyaSil(Sale sale) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kampanyaGüncelle(Sale sale) {
		System.out.println( "sisteme yeni kampanya girişi yapılmaktadır. kapanya adı "+ sale.getKullandığıKapmanya()+ "güncellenmiştir.");
		
	}

	@Override
	public void kayıt(Gamer gamer) {
		
		
	}

	@Override
	public void sil(Gamer gamer) {
		System.out.println(" oyuncu"+ gamer.getAdı()+ " isimli oyuncu kaydı silinmiştir.");
		
	}

	@Override
	public void güncelle(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kapanyaadı(Sale sale) {
		System.out.println( "sisteme yeni kampanya girişi yapılmaktadır. kapanya adı "+ sale.getKullandığıKapmanya()+ "adıdır");
	}

	
}
