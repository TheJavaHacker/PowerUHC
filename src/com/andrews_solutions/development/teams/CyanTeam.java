package com.andrews_solutions.development.teams;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;

public class CyanTeam implements UHCTeam{

	private List<String> members = new ArrayList<>();
	
	@Override
	public String getName() {
		return "Cyan";
	}

	@Override
	public List<String> getMembers() {
		return this.members;
	}

	@Override
	public ChatColor getColor() {
		return ChatColor.DARK_AQUA;
	}

}
