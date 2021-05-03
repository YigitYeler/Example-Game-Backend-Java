package Managers;

import Interfaces.BaseGameManager;
import Models.Campaign;
import Models.Game;
import Models.Player;

public class GameManager implements BaseGameManager{
	private Campaign campaign;
	
	public GameManager(Campaign campaign) {
		this.campaign = campaign;
	}

	@Override
	public void sellGame(Player player, Game game) {
		// TODO Auto-generated method stub
		if(campaign.isActive()) {
			double discountPrice = game.getPrice() - (game.getPrice() * campaign.getDiscount());
			System.out.println(game.getName() + " oyununu " + player.getFirstName() + " adlý kiþi " + campaign.getCampaignName() + " kampanyasýyla " + discountPrice + " fiyatýna satýn aldý ");
		}
		else {
			System.out.println(game.getName() + " oyununu " + player.getFirstName() + " adlý kiþi " + game.getPrice() + " fiyatýna satýn aldý");
		}
		
	}

}
