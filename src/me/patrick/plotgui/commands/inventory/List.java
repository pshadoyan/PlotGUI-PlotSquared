package me.patrick.plotgui.commands.inventory;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class List implements org.bukkit.event.Listener
{
  public List() {}
  
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
    String p = event.getWhoClicked().getName();
    ItemStack item = event.getCurrentItem();
    if (item.getType() == org.bukkit.Material.BOOK) {
      player.closeInventory();
      player.performCommand("plot list" + " " + p);
    }
    event.setCancelled(true);
  }
}
