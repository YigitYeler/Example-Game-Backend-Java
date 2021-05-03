package Managers;

import Interfaces.BasePlayerManager;
import Models.Player;
import Verification.EdevletVerification;

public class PlayerManager implements BasePlayerManager{
	private EdevletVerification eDevletVerification;
	
	public PlayerManager(EdevletVerification eDevletVerification) {
		this.eDevletVerification = eDevletVerification;
	}
	
	@Override
	public void addPlayer(Player player) {
		if(eDevletVerification.verify(player)) {
			System.out.println(player.getFirstName() + " Adlý oyuncu kaydedildi");
		}
		else {
			System.out.println("Kaydedilemedi");
		}
		
		
	}

	@Override
	public void deletePlayer(Player player) {
		System.out.println(player.getFirstName() + " Adlý oyuncu silindi");
		
	}

	@Override
	public void uptadePlayer(Player player, int id, String firstName, String lastName, String nationalityIdentity,
			String birthDate) {
		player.setId(id);
		player.setFirstName(firstName);
		player.setLastName(lastName);
		player.setNationalityIdentity(nationalityIdentity);
		player.setBirthDate(birthDate);
		
		System.out.println("Güncellenen oyuncu bilgileri : "
				+ player.getFirstName() + " " + player.getLastName() + " " + player.getNationalityIdentity()
				+ " " + player.getBirthDate());
		
	}

}
