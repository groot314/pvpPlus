package me.groot314.pvpPlus;

import org.bukkit.plugin.java.JavaPlugin;

public class pvpPlus extends JavaPlugin{
	
	@Override
	public void onEnable() {
		getCommand("pvpPlus").setExecutor(new command(this));
		super.onEnable();
	}
	
	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		super.onDisable();
	}
}
