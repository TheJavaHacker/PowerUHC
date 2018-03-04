package com.andrews_solutions.development.utils;

import org.bukkit.Bukkit;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;

import com.andrews_solutions.development.UHCCore;

import net.md_5.bungee.api.ChatColor;

public class ScoreboardManager {
	
	public static void lobbyScoreboard(Player player) {
		
		org.bukkit.scoreboard.ScoreboardManager BoardManager = Bukkit.getScoreboardManager();
		Scoreboard board = BoardManager.getNewScoreboard();
		
		Objective objective = board.registerNewObjective("doesn't matter", "dummy");
		objective.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cCentral UHC"));
		objective.setDisplaySlot(DisplaySlot.SIDEBAR);
		
		Score blank15 = objective.getScore(ChatColor.translateAlternateColorCodes('&', ""));
		blank15.setScore(15);
		
		Score name14 = objective.getScore(ChatColor.translateAlternateColorCodes('&', "&cName:"));
		name14.setScore(14);
		
		Score name13 = objective.getScore(player.getDisplayName());
		name13.setScore(13);
		
		Score blank12 = objective.getScore("");
		blank12.setScore(12);
		
		Score Wins11 = objective.getScore(ChatColor.translateAlternateColorCodes('&', "&cTotal Wins:"));
		Wins11.setScore(11);
		
		Score Wins10 = objective.getScore(ChatColor.translateAlternateColorCodes('&', "&7" + player.getStatistic(Statistic.PLAYER_KILLS)));
		Wins10.setScore(10);
		
		Score blank9 = objective.getScore(ChatColor.translateAlternateColorCodes('&', "&2"));
		blank9.setScore(9);
		
		Score Losses8 = objective.getScore(ChatColor.translateAlternateColorCodes('&', "&cTotal Losses:"));
		Losses8.setScore(8);
		
		Score Losses7 = objective.getScore(ChatColor.translateAlternateColorCodes('&', "&7" + player.getStatistic(Statistic.DEATHS)));
		Losses7.setScore(7);
		
		Score blank6 = objective.getScore(ChatColor.translateAlternateColorCodes('&', "&8"));
		blank6.setScore(6);
		
		Score Kits5 = objective.getScore(ChatColor.translateAlternateColorCodes('&', "&cSelected Kit:"));
		Kits5.setScore(5);
		
		Score Kits4 = objective.getScore(ChatColor.translateAlternateColorCodes('&', "&7Error."));
		Kits4.setScore(4);
		
		Score blank3 = objective.getScore(ChatColor.translateAlternateColorCodes('&', "&6"));
		blank3.setScore(3);
		
		Score Teams2 = objective.getScore(ChatColor.translateAlternateColorCodes('&', "&cSelected Team:"));
		Teams2.setScore(2);
		
		Score Teams1 = objective.getScore(ChatColor.translateAlternateColorCodes('&', "&7" + UHCCore.getTeam(player).getName()));
		Teams1.setScore(1);
		
		player.setScoreboard(board);
		
	}

}
