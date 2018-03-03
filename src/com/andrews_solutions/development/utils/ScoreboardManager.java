package com.andrews_solutions.development.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;

import net.md_5.bungee.api.ChatColor;

public class ScoreboardManager {
	
	public void lobbyScoreboard(Player player) {
		
		org.bukkit.scoreboard.ScoreboardManager BoardManager = Bukkit.getScoreboardManager();
		Scoreboard board = BoardManager.getNewScoreboard();
		
		Objective objective = board.registerNewObjective("doesn't matter", "dummy");
		
		Score blank15 = objective.getScore(ChatColor.translateAlternateColorCodes('&', ""));
		blank15.setScore(15);
		
		Score name14 = objective.getScore(ChatColor.translateAlternateColorCodes('&', "&cName:"));
		name14.setScore(14);
		
		Score name13 = objective.getScore(player.getDisplayName());
		name13.setScore(13);
		
		Score blank12 = objective.getScore("");
		blank12.setScore(12);
		
		player.setScoreboard(board);
		
	}

}
