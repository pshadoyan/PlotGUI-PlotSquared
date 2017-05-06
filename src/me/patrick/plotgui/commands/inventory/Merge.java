package me.patrick.plotgui.commands.inventory;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class Merge implements org.bukkit.event.Listener
{
  public Merge() {}
  
  @org.bukkit.event.EventHandler
  public void onMerge(InventoryClickEvent event)
  {
    org.bukkit.inventory.Inventory inv1 = event.getInventory();
    if (!inv1.getTitle().equals("Plot Manager")) {
      return;
    }
    if (!(event.getWhoClicked() instanceof Player)) {
      return;
    }
    Player player = (Player)event.getWhoClicked();
    ItemStack item = event.getCurrentItem();
    if (item.getType() == org.bukkit.Material.SLIME_BALL) {
      player.performCommand("plot merge");
    }
    event.setCancelled(true);
  }
}
