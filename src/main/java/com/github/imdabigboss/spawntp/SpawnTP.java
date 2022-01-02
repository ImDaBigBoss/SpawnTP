package com.github.imdabigboss.spawntp;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class SpawnTP extends JavaPlugin {
    private static Plugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
        
        getServer().getPluginManager().registerEvents(new EventListener(this), this);
    }
    
    public static Plugin getPlugin() {
        return plugin;
    }
}
   