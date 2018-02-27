package com.andrews_solutions.development.commands;


import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class GameCommand implements CommandExecutor{
	

	@Override
	public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
		if(!(commandSender instanceof Player)) {
			commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lUHC &8» &cYou cannot run this command as the console."));
			return true;
		}else {
			Player player = (Player) commandSender;
			if(player.hasPermission("uhc.commands.game")) {
				if(args.length < 1) {
					player.sendMessage("§c§lUHC §8» §eYou have specified too little arguments to run this command.");
					return true;
				}else if(args.length > 1) {
					player.sendMessage("§c§lUHC §8» §eYou have specified too many arguments to run this command.");
					return true;
				}else {
					if(args[0].equalsIgnoreCase("start")) {
						for(Player all : Bukkit.getOnlinePlayers()) {
							all.getInventory().clear();
							all.getInventory().setArmorContents(null);
							all.setAllowFlight(false);
							all.setGameMode(GameMode.SURVIVAL);
							double X = Math.random() * 1000;
							double Z = Math.random() * 1000;
							all.teleport(new Location(Bukkit.getWorld("world"), X, Bukkit.getWorld("world").getHighestBlockYAt((int) X,(int) Z), Z));
							all.setHealth(all.getMaxHealth());
							all.setSaturation(8.0F);
							all.setFoodLevel(20);
							all.sendMessage("§c§lUHC §8» §eThe game will begin when the hosts allow it.");
						}
						return true;
					}else if(args[0].equalsIgnoreCase("stop")) {
						for(Player all : Bukkit.getOnlinePlayers()) {
							all.getInventory().clear();
							all.getInventory().setArmorContents(null);
							all.teleport(new Location(Bukkit.getWorld("Lobby"), 0, 90, 0));
							all.setAllowFlight(true);
							all.setFoodLevel(20);
							all.setSaturation(8.0F);
							all.setGameMode(GameMode.ADVENTURE);
							all.sendMessage("§c§lUHC §8» §eThe game has been force stopped by the host. Apologies.");
						}
						return true;
					}else if(args[0].equalsIgnoreCase("kill")) {
						for(Player all : Bukkit.getOnlinePlayers()) {
							all.getInventory().clear();
							all.getInventory().setArmorContents(null);
							all.teleport(new Location(Bukkit.getWorld("Lobby"), 0, 90, 0));
							all.sendMessage("§c§lUHC §8» §eThe game has been force stopped by the host. Apologies.");
						}
						Bukkit.getServer().shutdown();
						return true;
					}else {
						return true;	
					}
				}
			}else {
				return true;
			}
		}
	}

}
