package Abstract;

import java.rmi.RemoteException;

import Entities.Gamer;


public interface IGameService {
	public void kayıt(Gamer gamer) throws NumberFormatException, RemoteException;
	
	
	public void sil(Gamer gamer);
	
	public void güncelle(Gamer gamer);
	
	

}
