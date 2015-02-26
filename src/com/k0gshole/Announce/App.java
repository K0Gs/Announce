
package com.k0gshole.Announce;

import java.io.File;

import org.bukkit.Server;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;

// Referenced classes of package com.manygamers.rossfudgew.AgeChecker:
//            DOBCommand, BypassCommand, Birthday, Birthdays, 
//            EListener
// Created 2013 K0Gs
//updated may 2014 K0Gs

public class App extends JavaPlugin {

    private App plugin;

    public App(App plugin) {
       this.plugin = plugin;
    }

            File file;
            static String error = "An error has happened...... incoming stack trace....";
            static String joinmessage;
           static String isEnabled;
           static String isEnabled2;
           static String isEnabled3;
           static String isEnabled4;
           static String isEnabled5;
           static String repeatmessage;
           static String repeatmessage2;
           static String repeatmessage3;
           static String repeatmessage4;
           static String repeatmessage5;
           static Integer repeatevery;
           static Integer repeatevery2;
           static Integer repeatevery3;
           static Integer repeatevery4;
           static Integer repeatevery5;


            public App() {
/*  13*/        file = new File("plugins/Announce/config.yml");

            }

            public void onEnable() {
/*  29*/        config();

/*  34*/        getServer().getPluginManager().registerEvents(new AnnounListener(this), this);
/*  35*/        getLogger().info("Listeners have been enabled");

/*  40*/        task();

/*  42*/        getLogger().info("Plugin enabled");
            }

            public void onDisable() {

/*  48*/        getLogger().info("Plugin disabled");
            }

            void errorLogger() {
/*  52*/        getLogger().info(error);
            }

            void config() {
/* 106*/        //saveDefaultConfig();
/* 107*/        YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
/* 108*/        joinmessage = (String)config.get("onjoin");
/* 109*/        isEnabled = (String)config.get("enabled");
/* 109*/        isEnabled2 = (String)config.get("enabled2");
/* 109*/        isEnabled3 = (String)config.get("enabled3");
/* 109*/        isEnabled4 = (String)config.get("enabled4");
/* 109*/        isEnabled5 = (String)config.get("enabled5");
/* 109*/        repeatmessage = (String)config.get("repeat");
/* 109*/        repeatmessage2 = (String)config.get("repeat2");
/* 109*/        repeatmessage3 = (String)config.get("repeat3");
/* 109*/        repeatmessage4 = (String)config.get("repeat4");
/* 109*/        repeatmessage5 = (String)config.get("repeat5");
/* 110*/        repeatevery = ((Integer)config.get("interval")).intValue();
/* 110*/        repeatevery2 = ((Integer)config.get("interval2")).intValue();
/* 110*/        repeatevery3 = ((Integer)config.get("interval3")).intValue();
/* 110*/        repeatevery4 = ((Integer)config.get("interval4")).intValue();
/* 110*/        repeatevery5 = ((Integer)config.get("interval5")).intValue();

            }

            public void task() {

            	final Server Server = getServer();
            	
            	if (isEnabled.equals("true")){
            	int id = Bukkit.getScheduler().scheduleSyncRepeatingTask(App.this, new Runnable() { public void run() {Server.broadcastMessage(App.repeatmessage); } }, 1,App.repeatevery * 30 * 20);
            	}
            	else{
            		
            	}
            	if (isEnabled2.equals("true")){
            	int id2 = Bukkit.getScheduler().scheduleSyncRepeatingTask(App.this, new Runnable() { public void run() {Server.broadcastMessage(App.repeatmessage2); } }, 1,App.repeatevery2 * 33 * 20);
            	}
            	else{
            		
            	}
            	if (isEnabled3.equals("true")){
            	int id3 = Bukkit.getScheduler().scheduleSyncRepeatingTask(App.this, new Runnable() { public void run() {Server.broadcastMessage(App.repeatmessage3); } }, 1,App.repeatevery3 * 36 * 20);
            	}
            	else{
            		
            	}
            	if (isEnabled4.equals("true")){
            	int id4 = Bukkit.getScheduler().scheduleSyncRepeatingTask(App.this, new Runnable() { public void run() {Server.broadcastMessage(App.repeatmessage4); } }, 1,App.repeatevery4 * 39 * 20);
            	}
            	else{
            		
            	}
            	if(isEnabled5.equals("true")){
            	int id5 = Bukkit.getScheduler().scheduleSyncRepeatingTask(App.this, new Runnable() { public void run() {Server.broadcastMessage(App.repeatmessage5); } }, 1,App.repeatevery5 * 42 * 20);
            	}
            	else{
            		
            	}

            }

}
