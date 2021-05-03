package Interfaces;

import Models.Campaign;

public interface BaseCampaignManager {
	void addCampaign(Campaign campaign);
	void deleteCampaign(Campaign campaign);
	void updateCampaign(Campaign campaign , int id, String campaignName,boolean isActive , double discount);
}
