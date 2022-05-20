
package me.nightbeat.babble.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
public class JoinLeave implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){

        Player player = e.getPlayer();

        if (player.hasPlayedBefore()){
            e.setJoinMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "+" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + player.getDisplayName());
        }else{
            e.setJoinMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "+" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + player.getDisplayName());
        }

    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e){

        Player player = e.getPlayer();

        e.setQuitMessage(ChatColor.DARK_GRAY + "[" + ChatColor.RED + "-" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + player.getDisplayName());

    }

}