package com.andrews_solutions.development.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;

import com.andrews_solutions.development.UHCCore;
import com.andrews_solutions.development.utils.GameStates;
import com.andrews_solutions.development.utils.ScoreboardManager;
import com.andrews_solutions.development.utils.TeamException;
import com.andrews_solutions.development.utils.TeamManager;

public class JoinListener implements Listener{
	
	int MIN_PLAYERS =  16;
	
	@EventHandler
	public void onLogin(PlayerLoginEvent e){
		
		GameStates state = UHCCore.getGameStates();
		if(state != GameStates.LOBBY){
			e.disallow(PlayerLoginEvent.Result.KICK_OTHER, "§c§lUHC §8» §cThe game has already started\n§cPlease join another server.");
		}
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		Player player = e.getPlayer();
		
		player.sendMessage("§c§lUHC §8» §eWelcome to UHC!");
		int players = Bukkit.getOnlinePlayers().size();
		if(players < MIN_PLAYERS){
			player.sendMessage("§c§lUHC §8» §eThe game will begin when we get §c" + MIN_PLAYERS + "§e.");
		}else{
			player.sendMessage("§c§lUHC §8» §eThe game will begin shortly...");
		}
		player.setHealth(player.getMaxHealth());
		player.setFoodLevel(20);
		player.setSaturation(20F);
		player.setLevel(0);
		player.setExp(0.0F);
		player.getInventory().clear();
		player.getInventory().setArmorContents(null);
		if(player.hasPermission("uhc.onjoin.flight")){
			player.setAllowFlight(true);
			player.isFlying();
		}
		try{
			TeamManager.joinTeam(player, UHCCore.getTeam("Spectators"));
		}catch(TeamException e1){
			e1.printStackTrace();
		}
		
		ScoreboardManager.lobbyScoreboard(player);
	}

}
