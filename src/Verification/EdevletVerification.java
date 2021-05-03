package Verification;

import Models.Player;

public class EdevletVerification implements Verification{

	@Override
	public boolean verify(Player player) {
		// TODO Auto-generated method stub
		if(player.getNationalityIdentity().length() == 11) {
			return true;
		}
		return false;
		
	}
	
}
