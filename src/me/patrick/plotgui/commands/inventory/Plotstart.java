package me.patrick.plotgui.commands.inventory;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Plotstart implements org.bukkit.event.Listener
{
  public Plotstart() {}
  
  @org.bukkit.event.EventHandler
  public void onPlotstart(InventoryClickEvent event)
  {
    Inventory inv = event.getInventory();
    if (!inv.getTitle().equals("Plot GUI")) {
      return;
    }
    if (!(event.getWhoClicked() instanceof Player)) {
      return;
    }
    Player player = (Player)event.getWhoClicked();
    ItemStack item = event.getCurrentItem();
    if (item.getType() == org.bukkit.Material.DIRT) {
      player.performCommand("plot auto");
    }
    event.setCancelled(true);
  }
}
