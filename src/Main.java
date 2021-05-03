import Managers.CampaignManager;
import Managers.GameManager;
import Managers.PlayerManager;
import Models.Campaign;
import Models.Game;
import Models.Player;
import Verification.EdevletVerification;

public class Main {

	public static void main(String[] args) {
		Player yigit = new Player(0, "Yiðit", "Yeler", "12121212121", "18.10.2002");
		Campaign campaign = new Campaign(0, "Yaz Ortasý indirimleri", true, 0.2);
		Game gta5 = new Game(0, "GTAV", 500);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign);
		
		PlayerManager playerManager = new PlayerManager(new EdevletVerification());
		playerManager.addPlayer(yigit);
		playerManager.uptadePlayer(yigit, 1, "Burak", "Ýmdat", "23232323232", "18.10.2001");
		
		GameManager gameManager = new GameManager(campaign);
		gameManager.sellGame(yigit, gta5);
		

		campaignManager.deleteCampaign(campaign);
		playerManager.deletePlayer(yigit);
		campaignManager.updateCampaign(campaign, 1, "Mayýs indirimleri", false, 0.4);
		
		
		
	}

}
