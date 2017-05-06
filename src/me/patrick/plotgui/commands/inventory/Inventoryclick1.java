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

public class Inventoryclick1 implements Listener
{
  public Inventoryclick1() {}
  
  @EventHandler
  public void onInventoryclick1(InventoryClickEvent event)
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
    if (item.getType() == Material.ENDER_CHEST)
    {
      Inventory inv1 = org.bukkit.Bukkit.createInventory(null, 36, "Plot Manager");
      


      ItemStack spawnitem = NameItem(new ItemStack(Material.STAINED_CLAY, 1, (short)1), ChatColor.AQUA + "Add a Player");
      inv1.setItem(0, spawnitem);
      player.openInventory(inv1);
      
      ItemStack spawnitem1 = NameItem(new ItemStack(Material.HARD_CLAY), ChatColor.AQUA + "Remove Player");
      inv1.setItem(1, spawnitem1);
      player.openInventory(inv1);
      
      ItemStack spawnitem3 = NameItem(new ItemStack(Material.WOOL, 1, (short)14), ChatColor.AQUA + "Kick Player");
      inv1.setItem(3, spawnitem3);
      player.openInventory(inv1);
      
      ItemStack spawnitem4 = NameItem(new ItemStack(Material.WOOL, 1, (short)5), ChatColor.AQUA + "Trust Player");
      inv1.setItem(4, spawnitem4);
      player.openInventory(inv1);
      
      ItemStack spawnitem6 = NameItem(new ItemStack(Material.SLIME_BALL), ChatColor.AQUA + "Merge Plot");
      inv1.setItem(7, spawnitem6);
      player.openInventory(inv1);
      
      ItemStack spawnitem7 = NameItem(new ItemStack(Material.CHEST), ChatColor.AQUA + "Download plot");
      inv1.setItem(8, spawnitem7);
      player.openInventory(inv1);
      
      ItemStack spawnitem8 = NameItem(new ItemStack(Material.BOOK), ChatColor.AQUA + "List Your Plots");
      inv1.setItem(9, spawnitem8);
      player.openInventory(inv1);
      
      ItemStack spawnitem10 = NameItem(new ItemStack(Material.SIGN), ChatColor.AQUA + "Save Plot");
      inv1.setItem(12, spawnitem10);
      player.openInventory(inv1);
      
      ItemStack spawnitem11 = NameItem(new ItemStack(Material.DIRT), ChatColor.AQUA + "Change Biome");
      inv1.setItem(14, spawnitem11);
      player.openInventory(inv1);
      
      ItemStack spawnitem12 = NameItem(new ItemStack(Material.MAP), ChatColor.AQUA + "Clear Plot");
      inv1.setItem(16, spawnitem12);
      player.openInventory(inv1);
      
      ItemStack spawnitem13 = NameItem(new ItemStack(Material.DEAD_BUSH), ChatColor.AQUA + "Delete/Unclaim Plot");
      inv1.setItem(17, spawnitem13);
      player.openInventory(inv1);
      
      ItemStack spawnitem16 = NameItem(new ItemStack(Material.STAINED_GLASS, 1, (short)14), ChatColor.AQUA + "PVP ON");
      inv1.setItem(18, spawnitem16);
      player.openInventory(inv1);
      
      ItemStack spawnitem17 = NameItem(new ItemStack(Material.STAINED_GLASS, 1, (short)5), ChatColor.AQUA + "PVP OFF");
      inv1.setItem(19, spawnitem17);
      player.openInventory(inv1);
      
      ItemStack spawnitem18 = NameItem(new ItemStack(Material.DIAMOND), ChatColor.AQUA + "Gamemode: Creative");
      inv1.setItem(30, spawnitem18);
      player.openInventory(inv1);
      
      ItemStack spawnitem19 = NameItem(new ItemStack(Material.DIAMOND_SWORD), ChatColor.AQUA + "Gamemode: Survival");
      inv1.setItem(31, spawnitem19);
      player.openInventory(inv1);
      
      ItemStack spawnitem20 = NameItem(new ItemStack(Material.EYE_OF_ENDER), ChatColor.AQUA + "Gamemode: Spectator");
      inv1.setItem(32, spawnitem20);
      player.openInventory(inv1);
      
      ItemStack spawnitem21 = NameItem(new ItemStack(Material.REDSTONE_BLOCK), ChatColor.AQUA + "Back to menu");
      inv1.setItem(35, spawnitem21);
      player.openInventory(inv1);
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
