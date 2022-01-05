package Concrete;


import java.rmi.RemoteException;

import javax.naming.spi.DirStateFactory.Result;

import Abstract.IGameService;

import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class KayıtManager implements IGameService  {
	 
	
	
	KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
	

	

	



	@Override
	public void kayıt(Gamer gamer) throws NumberFormatException, RemoteException {

		if (kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong("43696132228"), "ONUR", "DEMİR", 1990)) {
			System.out.println("doğrulama doğru.");
			System.out.println(gamer.getAdı()+ " "+ gamer.getSoydaı()+ " isimli oyuncu sisteme kayıt edildi." );
			
		}
		
		else {
			
			System.out.println("nüfus doğrulaması yanlış, oyuncu sisteme kayıt edilemedi. lütfen bilgilerinizi kontrol ediniz. ");
		}
		
	}

	
	
	
	
	
	
	
	
	
	

	@Override
	public void sil(Gamer gamer) {
		System.out.println( gamer.getAdı() + " oyuncu sistemden silindi.");
		
	}

	@Override
	public void güncelle(Gamer gamer) {
		System.out.println( gamer.getAdı() + gamer.getSoydaı() +" oyuncu bilgileri sistemde güncellendi");
		
	}




	

}
