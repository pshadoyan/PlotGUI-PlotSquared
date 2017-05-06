package me.patrick.plotgui.commands.inventory;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Tptoplot implements org.bukkit.event.Listener
{
  public Tptoplot() {}
  
  @org.bukkit.event.EventHandler
  public void onTptoplot(InventoryClickEvent event)
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
    if (item.getType() == org.bukkit.Material.GRASS) {
      player.performCommand("plot home");
    }
    event.setCancelled(true);
  }
}
