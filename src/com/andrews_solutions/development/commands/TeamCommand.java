package com.andrews_solutions.development.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.andrews_solutions.development.UHCCore;

public class TeamCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
		if(!(commandSender instanceof Player)) {
			commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cYou cannot run this command as the console."));
			return true;
		}else {
			Player player = (Player) commandSender;
			if(args.length >= 1) {
				player.sendMessage("§c§lUHC §8» §eYou have specified too many arguments to run this command.");
				return true;
			}else {
				UHCCore.TSG.show(player);
				player.sendMessage("§c§lUHC §8» §eYou are being shown the team selection GUI.");
				return true;
			}
		}
	}

}
