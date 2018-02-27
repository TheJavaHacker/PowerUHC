package com.andrews_solutions.development.teams;

import java.util.List;

import org.bukkit.ChatColor;

public abstract interface UHCTeam {
	
	public abstract String getName();
	
	public abstract List<String> getMembers();
	
	public abstract ChatColor getColor();

}
