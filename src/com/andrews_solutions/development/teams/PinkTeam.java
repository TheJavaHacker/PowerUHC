package com.andrews_solutions.development.teams;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;

public class PinkTeam implements UHCTeam{

	private List<String> members = new ArrayList<String>();
	
	@Override
	public String getName() {
		return "Pink";
	}

	@Override
	public List<String> getMembers() {
		return this.members;
	}

	@Override
	public ChatColor getColor() {
		return ChatColor.LIGHT_PURPLE;
	}

}
