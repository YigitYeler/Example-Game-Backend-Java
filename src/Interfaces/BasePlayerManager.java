package Interfaces;

import Models.Player;

public interface BasePlayerManager {
	void addPlayer(Player player);
	void deletePlayer(Player player);
	void uptadePlayer(Player player, int id,String firstName,String lastName,String nationalityIdentity ,String birthDate);
}
