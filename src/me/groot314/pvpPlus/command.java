package me.groot314.pvpPlus;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class command implements CommandExecutor{
	
	private pvpPlus plugin; // pointer to your main class, unrequired if you don't need methods from the main class
	 
	public command(pvpPlus plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String arg[]) {
		if (cmd.getName().equalsIgnoreCase("pvpPlus")){ 
			sender.sendMessage(ChatColor.AQUA + "----PVP PLUS----");
			return true;
		} 
		return false;
	}
	
}
