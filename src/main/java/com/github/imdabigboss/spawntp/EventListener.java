package com.github.imdabigboss.spawntp;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

public class EventListener implements Listener {
	private Plugin plugin;

	public EventListener(Plugin plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		
		player.teleport(plugin.getServer().getWorld("world").getSpawnLocation());
    }
}
