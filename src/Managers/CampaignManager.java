package Managers;

import Interfaces.BaseCampaignManager;
import Models.Campaign;

public class CampaignManager implements BaseCampaignManager{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " isimli kampanya eklendi");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " isimli kampanya silindi");
		
	}

	@Override
	public void updateCampaign(Campaign campaign, int id , String campaignName,boolean isActive , double discount){
		campaign.setId(id);
		campaign.setCampaignName(campaignName);
		campaign.setDiscount(discount);
		campaign.setActive(isActive);
		
		System.out.println(campaign.getCampaignName() + " adlý kampanya güncellendi");
	
		
	}

}
