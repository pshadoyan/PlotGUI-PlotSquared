package me.patrick.plotgui.commands.inventory;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class Exit implements org.bukkit.event.Listener
{
  public Exit() {}
  
  @org.bukkit.event.EventHandler
  public void onInventoryclick1(InventoryClickEvent event)
  {
    org.bukkit.inventory.Inventory inv = event.getInventory();
    if (!inv.getTitle().equals("Plot Manager")) {
      return;
    }
    if (!(event.getWhoClicked() instanceof Player)) {
      return;
    }
    Player player = (Player)event.getWhoClicked();
    ItemStack item = event.getCurrentItem();
    
    if (item.getType() == org.bukkit.Material.REDSTONE_BLOCK) {
      player.performCommand("plotgui");
    }
    
    event.setCancelled(true);
  }
}
