package me.patrick.plotgui.commands.inventory;

import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class Perform implements org.bukkit.event.Listener
{
  public Perform() {}
  
  @org.bukkit.event.EventHandler
  public void onperform(PlayerCommandPreprocessEvent event)
  {
    org.bukkit.entity.Player player = event.getPlayer();
    org.bukkit.Bukkit.getPluginManager().callEvent(event);
    if (!event.isCancelled()) {
      player.performCommand(event.getMessage());
    }
  }
}
