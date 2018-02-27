package com.andrews_solutions.development.teams;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;

public class GreenTeam implements UHCTeam{

	private List<String> members = new ArrayList<String>();
	
	@Override
	public String getName() {
		return "Green";
	}

	@Override
	public List<String> getMembers() {
		return this.members;
	}

	@Override
	public ChatColor getColor() {
		return ChatColor.GREEN;
	}

}
