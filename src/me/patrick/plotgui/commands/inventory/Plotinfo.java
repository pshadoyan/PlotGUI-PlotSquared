package me.patrick.plotgui.commands.inventory;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Plotinfo implements org.bukkit.event.Listener
{
  public Plotinfo() {}
  
  @org.bukkit.event.EventHandler
  public void onPlotinfo(InventoryClickEvent event)
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
    if (item.getType() == Material.MAP) {
      player.performCommand("plot info");
    }
    event.setCancelled(true);
  }
}
