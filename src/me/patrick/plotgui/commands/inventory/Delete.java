package me.patrick.plotgui.commands.inventory;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class Delete implements org.bukkit.event.Listener
{
  public Delete() {}
  
  @org.bukkit.event.EventHandler
  public void onDelete(InventoryClickEvent event)
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
    if (item.getType() == org.bukkit.Material.DEAD_BUSH) {
      player.performCommand("plot delete");
    }
    event.setCancelled(true);
  }
}
