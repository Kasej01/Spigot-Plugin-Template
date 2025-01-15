package com.yourname;

import org.bukkit.plugin.java.JavaPlugin;


public class TemplatePlugin extends JavaPlugin{
    @Override
    public void onEnable() {
        getLogger().info("TemplatePlugin has been enabled!");
    }

    public void onDisable() {
        getLogger().info("TemplatePlugin has been disabled!");
    }
}