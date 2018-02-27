package com.andrews_solutions.development.utils;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import com.andrews_solutions.development.UHCCore;
import com.andrews_solutions.development.teams.BlueTeam;
import com.andrews_solutions.development.teams.CyanTeam;
import com.andrews_solutions.development.teams.GoldTeam;
import com.andrews_solutions.development.teams.GreenTeam;
import com.andrews_solutions.development.teams.PinkTeam;
import com.andrews_solutions.development.teams.PurpleTeam;
import com.andrews_solutions.development.teams.RedTeam;
import com.andrews_solutions.development.teams.SpectatorsTeam;
import com.andrews_solutions.development.teams.YellowTeam;

import net.md_5.bungee.api.ChatColor;

public class TeamSelectorGUI implements Listener{
	
	private Inventory inventory;
	
	public TeamSelectorGUI(Plugin plugin) {
		
		this.inventory = Bukkit.createInventory(null, 9, ChatColor.translateAlternateColorCodes('&', "&c&l            Team Selector"));
		
		ItemStack BlueTeam = new ItemStack(Material.WOOL, 1, (short) 11);
		ItemMeta BlueMeta = BlueTeam.getItemMeta();
		BlueMeta.setDisplayName(ChatColor.BLUE + "Blue Team.");
		ArrayList<String> BlueLore = new ArrayList<>();
		BlueLore.add(ChatColor.DARK_GRAY + "Team Selector");
		BlueLore.add(ChatColor.BLACK + "");
		BlueLore.add(ChatColor.GRAY + "Click this item to select");
		BlueLore.add(ChatColor.GRAY + "to join the" + ChatColor.BLUE + "Blue Team" + ChatColor.GRAY + ".");
		BlueLore.add(ChatColor.RED + "");
		BlueLore.add(ChatColor.GRAY + "Join " + UHCCore.getTeam("Blue").getMembers().size() + " other players on this team.");
		BlueLore.add(ChatColor.AQUA + "");
		BlueMeta.setLore(BlueLore);
		BlueTeam.setItemMeta(BlueMeta);
		
		ItemStack RedTeam = new ItemStack(Material.WOOL, 1, (short) 11);
		ItemMeta RedMeta = RedTeam.getItemMeta();
		RedMeta.setDisplayName(ChatColor.RED + "Red Team.");
		ArrayList<String> RedLore = new ArrayList<>();
		RedLore.add(ChatColor.DARK_GRAY + "Team Selector");
		RedLore.add(ChatColor.BLACK + "");
		RedLore.add(ChatColor.GRAY + "Click this item to select");
		RedLore.add(ChatColor.GRAY + "to join the" + ChatColor.RED + "Red Team" + ChatColor.GRAY + ".");
		RedLore.add(ChatColor.RED + "");
		RedLore.add(ChatColor.GRAY + "Join " + UHCCore.getTeam("Red").getMembers().size() + " other players on this team.");
		RedLore.add(ChatColor.AQUA + "");
		RedMeta.setLore(RedLore);
		RedTeam.setItemMeta(RedMeta);
		
		ItemStack GoldTeam = new ItemStack(Material.WOOL, 1, (short) 11);
		ItemMeta GoldMeta = GoldTeam.getItemMeta();
		GoldMeta.setDisplayName(ChatColor.GOLD + "Gold Team.");
		ArrayList<String> GoldLore = new ArrayList<>();
		GoldLore.add(ChatColor.DARK_GRAY + "Team Selector");
		GoldLore.add(ChatColor.BLACK + "");
		GoldLore.add(ChatColor.GRAY + "Click this item to select");
		GoldLore.add(ChatColor.GRAY + "to join the" + ChatColor.GOLD + "Gold Team" + ChatColor.GRAY + ".");
		GoldLore.add(ChatColor.RED + "");
		GoldLore.add(ChatColor.GRAY + "Join " + UHCCore.getTeam("Gold").getMembers().size() + " other players on this team.");
		GoldLore.add(ChatColor.AQUA + "");
		GoldMeta.setLore(GoldLore);
		GoldTeam.setItemMeta(GoldMeta);
		
		ItemStack PinkTeam = new ItemStack(Material.WOOL, 1, (short) 11);
		ItemMeta PinkMeta = PinkTeam.getItemMeta();
		PinkMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Pink Team.");
		ArrayList<String> PinkLore = new ArrayList<>();
		PinkLore.add(ChatColor.DARK_GRAY + "Team Selector");
		PinkLore.add(ChatColor.BLACK + "");
		PinkLore.add(ChatColor.GRAY + "Click this item to select");
		PinkLore.add(ChatColor.GRAY + "to join the" + ChatColor.LIGHT_PURPLE + "Pink Team" + ChatColor.GRAY + ".");
		PinkLore.add(ChatColor.RED + "");
		PinkLore.add(ChatColor.GRAY + "Join " + UHCCore.getTeam("Pink").getMembers().size() + " other players on this team.");
		PinkLore.add(ChatColor.AQUA + "");
		PinkMeta.setLore(PinkLore);
		PinkTeam.setItemMeta(PinkMeta);
		
		ItemStack GreenTeam = new ItemStack(Material.WOOL, 1, (short) 11);
		ItemMeta GreenMeta = GreenTeam.getItemMeta();
		GreenMeta.setDisplayName(ChatColor.GREEN + "Green Team.");
		ArrayList<String> GreenLore = new ArrayList<>();
		GreenLore.add(ChatColor.DARK_GRAY + "Team Selector");
		GreenLore.add(ChatColor.BLACK + "");
		GreenLore.add(ChatColor.GRAY + "Click this item to select");
		GreenLore.add(ChatColor.GRAY + "to join the" + ChatColor.GREEN + "Green Team" + ChatColor.GRAY + ".");
		GreenLore.add(ChatColor.RED + "");
		GreenLore.add(ChatColor.GRAY + "Join " + UHCCore.getTeam("Green").getMembers().size() + " other players on this team.");
		GreenLore.add(ChatColor.AQUA + "");
		GreenMeta.setLore(GreenLore);
		GreenTeam.setItemMeta(GreenMeta);
		
		ItemStack YellowTeam = new ItemStack(Material.WOOL, 1, (short) 11);
		ItemMeta YellowMeta = YellowTeam.getItemMeta();
		YellowMeta.setDisplayName(ChatColor.YELLOW + "Yellow Team.");
		ArrayList<String> YellowLore = new ArrayList<>();
		YellowLore.add(ChatColor.DARK_GRAY + "Team Selector");
		YellowLore.add(ChatColor.BLACK + "");
		YellowLore.add(ChatColor.GRAY + "Click this item to select");
		YellowLore.add(ChatColor.GRAY + "to join the" + ChatColor.YELLOW + "Yellow Team" + ChatColor.GRAY + ".");
		YellowLore.add(ChatColor.RED + "");
		YellowLore.add(ChatColor.GRAY + "Join " + UHCCore.getTeam("Yellow").getMembers().size() + " other players on this team.");
		YellowLore.add(ChatColor.AQUA + "");
		YellowMeta.setLore(YellowLore);
		YellowTeam.setItemMeta(YellowMeta);
		
		ItemStack PurpleTeam = new ItemStack(Material.WOOL, 1, (short) 11);
		ItemMeta PurpleMeta = PurpleTeam.getItemMeta();
		PurpleMeta.setDisplayName(ChatColor.DARK_PURPLE + "Purple Team.");
		ArrayList<String> PurpleLore = new ArrayList<>();
		PurpleLore.add(ChatColor.DARK_GRAY + "Team Selector");
		PurpleLore.add(ChatColor.BLACK + "");
		PurpleLore.add(ChatColor.GRAY + "Click this item to select");
		PurpleLore.add(ChatColor.GRAY + "to join the" + ChatColor.DARK_PURPLE + "Purple Team" + ChatColor.GRAY + ".");
		PurpleLore.add(ChatColor.RED + "");
		PurpleLore.add(ChatColor.GRAY + "Join " + UHCCore.getTeam("Purple").getMembers().size() + " other players on this team.");
		PurpleLore.add(ChatColor.AQUA + "");
		PurpleMeta.setLore(PurpleLore);
		PurpleTeam.setItemMeta(PurpleMeta);
		
		ItemStack CyanTeam = new ItemStack(Material.WOOL, 1, (short) 11);
		ItemMeta CyanMeta = CyanTeam.getItemMeta();
		CyanMeta.setDisplayName(ChatColor.DARK_AQUA + "Cyan Team.");
		ArrayList<String> CyanLore = new ArrayList<>();
		CyanLore.add(ChatColor.DARK_GRAY + "Team Selector");
		CyanLore.add(ChatColor.BLACK + "");
		CyanLore.add(ChatColor.GRAY + "Click this item to select");
		CyanLore.add(ChatColor.GRAY + "to join the" + ChatColor.DARK_AQUA + "Cyan Team" + ChatColor.GRAY + ".");
		CyanLore.add(ChatColor.RED + "");
		CyanLore.add(ChatColor.GRAY + "Join " + UHCCore.getTeam("Cyan").getMembers().size() + " other players on this team.");
		CyanLore.add(ChatColor.AQUA + "");
		CyanMeta.setLore(CyanLore);
		CyanTeam.setItemMeta(CyanMeta);
		
		ItemStack Spectators = new ItemStack(Material.BED, 1);
		ItemMeta SpecMeta = Spectators.getItemMeta();
		SpecMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cBe a spectator."));
		ArrayList<String> SpecLore = new ArrayList<>();
		SpecLore.add(ChatColor.DARK_GRAY + "Spectator Toggle");
		SpecLore.add(ChatColor.BLACK + "");
		SpecLore.add(ChatColor.GRAY + "Click this item to select");
		SpecLore.add(ChatColor.GRAY + "to watch as a" + ChatColor.DARK_GRAY + "Spectator" + ChatColor.GRAY + ".");
		SpecLore.add(ChatColor.RED + "");
		SpecLore.add(ChatColor.GRAY + "Join " + UHCCore.getTeam("Spectators").getMembers().size() + " other players as a spectator.");
		SpecLore.add(ChatColor.AQUA + "");
		SpecMeta.setLore(SpecLore);
		Spectators.setItemMeta(SpecMeta);
		
		this.inventory.setItem(4, Spectators);
		this.inventory.setItem(0, GoldTeam);
		this.inventory.setItem(1, YellowTeam);
		this.inventory.setItem(2, GreenTeam);
		this.inventory.setItem(3, PinkTeam);
		this.inventory.setItem(6, PurpleTeam);
		this.inventory.setItem(7, RedTeam);
		this.inventory.setItem(8, BlueTeam);
		
		Bukkit.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	public void show(Player player) {
		player.openInventory(this.inventory);
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		Player player = (Player) e.getWhoClicked();
		if(!e.getInventory().equals(this.inventory)) return;
		if(!e.getCurrentItem().getItemMeta().hasDisplayName()) return;
		if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "Blue Team.")) {
			e.setCancelled(true);
			try {
				TeamManager.joinTeam(player, new BlueTeam());
			} catch (TeamException e1) {
				e1.printStackTrace();
			}
			player.closeInventory();
			return;
		}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.RED + "Red Team.")) {
			e.setCancelled(true);
			try {
				TeamManager.joinTeam(player, new RedTeam());
			}catch(TeamException e1) {
				e1.printStackTrace();
			}
			player.closeInventory();
			return;
		}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "Gold Team.")) {
			e.setCancelled(true);
			try {
				TeamManager.joinTeam(player, new GoldTeam());
			}catch(TeamException e1) {
				e1.printStackTrace();
			}
			player.closeInventory();
			return;
		}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Pink Team.")) {
			e.setCancelled(true);
			try {
				TeamManager.joinTeam(player, new PinkTeam());
			}catch(TeamException e1) {
				e1.printStackTrace();
			}
			player.closeInventory();
			return;
		}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "Purple Team.")) {
			e.setCancelled(true);
			try {
				TeamManager.joinTeam(player, new PurpleTeam());
			}catch(TeamException e1) {
				e1.printStackTrace();
			}
			player.closeInventory();
			return;
		}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "Yellow Team.")) {
			e.setCancelled(true);
			try {
				TeamManager.joinTeam(player, new YellowTeam());
			}catch(TeamException e1) {
				e1.printStackTrace();
			}
			player.closeInventory();
			return;
		}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Green Team.")) {
			e.setCancelled(true);
			try {
				TeamManager.joinTeam(player, new GreenTeam());
			}catch(TeamException e1) {
				e1.printStackTrace();
			}
			player.closeInventory();
			return;
		}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_AQUA + "Cyan Team.")) {
			e.setCancelled(true);
			try {
				TeamManager.joinTeam(player, new CyanTeam());
			}catch(TeamException e1) {
				e1.printStackTrace();
			}
			player.closeInventory();
			return;
		}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&cBe a spectator."))) {
			e.setCancelled(true);
			try {
				TeamManager.joinTeam(player, new SpectatorsTeam());
			}catch(TeamException e1) {
				e1.printStackTrace();
			}
			player.closeInventory();
			return;
		}
	}

}
