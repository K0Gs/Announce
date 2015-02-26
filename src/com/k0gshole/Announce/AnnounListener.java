
package com.k0gshole.Announce;


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;



public class AnnounListener
    implements Listener {

            private App plugin;

            public AnnounListener(App plugin) {
/*  19*/        this.plugin = plugin;
            }
            @EventHandler
            public void onJoin(PlayerJoinEvent event) {
/*  26*/        Player player = event.getPlayer();
				
/*  27*/        String name = player.getName();


					player.sendMessage("***************************************************************");
					//player.sendMessage("//");
					player.sendMessage(App.joinmessage + name);
					//player.sendMessage("//");
					player.sendMessage("***************************************************************");
   

            }
            
}
