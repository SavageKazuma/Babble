package me.nightbeat.babble;

import me.nightbeat.babble.listeners.ChatMessages;
import me.nightbeat.babble.listeners.JoinLeave;
import org.bukkit.plugin.java.JavaPlugin;

    public final class Babble extends JavaPlugin {

        @Override
        public void onEnable() {

            getServer().getPluginManager().registerEvents(new JoinLeave(), this);
            getServer().getPluginManager().registerEvents(new ChatMessages(), this);
        }
    }
