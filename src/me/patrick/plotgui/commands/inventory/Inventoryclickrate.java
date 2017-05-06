package me.patrick.plotgui.commands.inventory;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Inventoryclickrate implements Listener
{
  public Inventoryclickrate() {}
  
  @EventHandler
  public void onInventoryclickrate(InventoryClickEvent event)
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
    if (item.getType() == Material.BOOK)
    {

      Inventory inv2 = org.bukkit.Bukkit.createInventory(null, 18, "Rate The Plot");
      
      ItemStack spawnitem = NameItem(new ItemStack(Material.STAINED_CLAY, 1, (short)1), ChatColor.AQUA + "1");
      inv2.setItem(0, spawnitem);
      player.openInventory(inv2);
      
      ItemStack spawnitem1 = NameItem(new ItemStack(Material.STAINED_CLAY, 1, (short)2), ChatColor.AQUA + "2");
      inv2.setItem(1, spawnitem1);
      player.openInventory(inv2);
      
      ItemStack spawnitem2 = NameItem(new ItemStack(Material.STAINED_CLAY, 1, (short)3), ChatColor.AQUA + "3");
      inv2.setItem(2, spawnitem2);
      player.openInventory(inv2);
      
      ItemStack spawnitem3 = NameItem(new ItemStack(Material.STAINED_CLAY, 1, (short)4), ChatColor.AQUA + "4");
      inv2.setItem(3, spawnitem3);
      player.openInventory(inv2);
      
      ItemStack spawnitem4 = NameItem(new ItemStack(Material.STAINED_CLAY, 1, (short)5), ChatColor.AQUA + "5");
      inv2.setItem(4, spawnitem4);
      player.openInventory(inv2);
      
      ItemStack spawnitem5 = NameItem(new ItemStack(Material.STAINED_CLAY, 1, (short)6), ChatColor.AQUA + "6");
      inv2.setItem(5, spawnitem5);
      player.openInventory(inv2);
      
      ItemStack spawnitem6 = NameItem(new ItemStack(Material.STAINED_CLAY, 1, (short)7), ChatColor.AQUA + "7");
      inv2.setItem(6, spawnitem6);
      player.openInventory(inv2);
      
      ItemStack spawnitem7 = NameItem(new ItemStack(Material.STAINED_CLAY, 1, (short)8), ChatColor.AQUA + "8");
      inv2.setItem(7, spawnitem7);
      player.openInventory(inv2);
      
      ItemStack spawnitem8 = NameItem(new ItemStack(Material.STAINED_CLAY, 1, (short)9), ChatColor.AQUA + "9");
      inv2.setItem(8, spawnitem8);
      player.openInventory(inv2);
      
      ItemStack spawnitem9 = NameItem(new ItemStack(Material.STAINED_CLAY, 1, (short)10), ChatColor.AQUA + "10");
      inv2.setItem(13, spawnitem9);
      player.openInventory(inv2);
      
      ItemStack spawnitem10 = NameItem(new ItemStack(Material.REDSTONE_BLOCK, 1), ChatColor.AQUA + "Back to Menu");
      inv2.setItem(17, spawnitem10);
      player.openInventory(inv2);
    }
    


    event.setCancelled(true);
  }
  

  private ItemStack NameItem(ItemStack item, String name)
  {
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(name);
    item.setItemMeta(meta);
    return item;
  }
}
