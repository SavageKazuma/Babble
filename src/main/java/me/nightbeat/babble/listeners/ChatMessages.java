package me.nightbeat.babble.listeners;


import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatMessages implements Listener {
    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        event.setFormat(ChatColor.GRAY + "%s " + ChatColor.WHITE + "%s");
    }
}
