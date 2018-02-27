package com.andrews_solutions.development.utils;

import org.bukkit.entity.Player;

import com.andrews_solutions.development.UHCCore;
import com.andrews_solutions.development.teams.UHCTeam;

public class TeamManager {
	
	public static void joinTeam(Player player, UHCTeam team) throws TeamException{
		if(UHCCore.getGameStates() == GameStates.LOBBY){
			for(UHCTeam t : UHCCore.getTeams()){
				if(t.getMembers().contains(player.getUniqueId().toString())){
					t.getMembers().remove(player.getUniqueId().toString());
				}
			}
			team.getMembers().add(player.getUniqueId().toString());
			player.sendMessage("§c§lUHC §8» §eYou have been added to the " + team.getColor() + team.getName() + "§e team.");
		}else{
			throw new TeamException("§c§lUHC §8» §cTeams cannot be modified during the game.");
		}
	}
	

}
