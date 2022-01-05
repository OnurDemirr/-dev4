import java.rmi.RemoteException;

import Concrete.KayıtManager;
import Concrete.SaleManager;
import Entities.Gamer;
import Entities.Sale;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		
		
		
		
		SaleManager manager = new SaleManager();
		manager.satıs(new Gamer("onur", "demir", 1996, "43696132228"));
		manager.kapanyaadı(new Sale("Emin", "genel müdür", "eskisini getir yenisini götür "));
		
		
		KayıtManager kayıtManager = new KayıtManager();
		kayıtManager.kayıt(new Gamer("onur", "demir", 19915, "43696132228"));
		kayıtManager.sil(new Gamer("furkan", "demir", 1990, "2345453"));
		kayıtManager.güncelle(new Gamer("mehmet", "demir", 1988, "23456"));
		

		
				
	


		
	}

}
