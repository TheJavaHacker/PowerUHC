package com.andrews_solutions.development;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.WorldCreator;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.andrews_solutions.development.commands.GameCommand;
import com.andrews_solutions.development.commands.TeamCommand;
import com.andrews_solutions.development.teams.BlueTeam;
import com.andrews_solutions.development.teams.CyanTeam;
import com.andrews_solutions.development.teams.GoldTeam;
import com.andrews_solutions.development.teams.GreenTeam;
import com.andrews_solutions.development.teams.PinkTeam;
import com.andrews_solutions.development.teams.PurpleTeam;
import com.andrews_solutions.development.teams.RedTeam;
import com.andrews_solutions.development.teams.SpectatorsTeam;
import com.andrews_solutions.development.teams.UHCTeam;
import com.andrews_solutions.development.teams.YellowTeam;
import com.andrews_solutions.development.utils.GameStates;
import com.andrews_solutions.development.utils.TeamSelectorGUI;

public class UHCCore extends JavaPlugin{
	
	private static GameStates gameStates;
	public static TeamSelectorGUI TSG;
	
	public static GameStates getGameStates() {
		return gameStates;
	}

	public static void setGameStates(GameStates gameStates) {
		UHCCore.gameStates = gameStates;
	}

	public static UHCTeam getTeam(Player player){
		for(UHCTeam team : getTeams()){
			if(team.getMembers().contains(player.getUniqueId().toString())){
				return team;
			}
		}
		return null;
	}
	
	public static List<UHCTeam> getTeams(){
		return teams;
	}
	
	public static UHCTeam getTeam(String name){
		for(UHCTeam team : getTeams()){
			if(team.getName().equalsIgnoreCase(name)){
				return team;
			}
		}
		return null;
	}
	
	private static List<UHCTeam> teams = new ArrayList<>();
	
	@Override
	public void onLoad(){
		setGameStates(GameStates.LOBBY);
		Bukkit.getServer().setWhitelist(true);
		Bukkit.getServer().createWorld(WorldCreator.name("UHCLobby"));
		createWorlds(new File("world"));
		createWorlds(new File("world_nether"));
		createWorlds(new File("world_the_end"));
	}
	
	@Override
	public void onEnable(){
		teams.add(new GoldTeam());
		teams.add(new SpectatorsTeam());
		teams.add(new YellowTeam());
		teams.add(new GreenTeam());
		teams.add(new PinkTeam());
		teams.add(new PurpleTeam());
		teams.add(new BlueTeam());
		teams.add(new RedTeam());
		teams.add(new CyanTeam());
		TSG = new TeamSelectorGUI(this);
		getServer().getPluginCommand("team").setExecutor(new TeamCommand());
		getServer().getPluginCommand("game").setExecutor(new GameCommand());
	}
	
	@Override
	public void onDisable(){
		
	}
	
	void createWorlds(File file){
		if(file.exists()){
			String[] children = file.list();
			for(int i = 0; i< children.length; i++){
				createWorlds(new File(file, children[i]));
			}
			file.delete();
		}else{
			Bukkit.getServer().createWorld(WorldCreator.name(file.toString()));
		}
	}

}
