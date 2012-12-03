package me.groot314.pvpPlus;

import java.io.File;
import java.io.IOException;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.omg.CORBA.portable.InputStream;


public class data extends JavaPlugin{

	   static public FileConfiguration commandConfig = null;
	    static File dataConfigFile = null;
	
	

     
	
	
    public FileConfiguration loadCommandConfig() {
        if (commandConfig == null) {
            if (dataConfigFile == null)
                dataConfigFile = new File(this.getDataFolder(), "commands.yml");
            if (dataConfigFile.exists()) {
                commandConfig = YamlConfiguration.loadConfiguration(dataConfigFile);
            } else {
                InputStream defConfigStream = (InputStream) getResource("commands.yml");
                commandConfig = YamlConfiguration.loadConfiguration(defConfigStream);
            }
        }
        return commandConfig;
    }
   
    //
    public void saveCommandConfig() {
        if (commandConfig == null || dataConfigFile == null)
            return;
        try {
            commandConfig.save(dataConfigFile);
        } catch (IOException e) {
        	getLogger().severe("Unable to save command config to " + dataConfigFile + '.');
        }
    }
}