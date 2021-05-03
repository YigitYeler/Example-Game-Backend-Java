package Models;

public class Campaign {
	private int id;
	private String campaignName;
	private boolean isActive;
	private double discount;
	
	public Campaign(int id, String campaignName, boolean isActive, double discount) {
		this.id = id;
		this.campaignName = campaignName;
		this.isActive = isActive;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
