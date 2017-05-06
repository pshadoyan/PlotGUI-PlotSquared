package me.patrick.plotgui.commands.inventory;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Plotclickrate implements org.bukkit.event.Listener
{
  public Plotclickrate() {}
  
  @org.bukkit.event.EventHandler
  public void onPlotclickrate(InventoryClickEvent event)
  {
    org.bukkit.inventory.Inventory inv2 = event.getInventory();
    if (!inv2.getTitle().equals("Rate The Plot")) {
      return;
    }
    if (!(event.getWhoClicked() instanceof Player)) {
      return;
    }
    Player player = (Player)event.getWhoClicked();
    ItemStack item = event.getCurrentItem();
    ItemStack spawnitem = NameItem(new ItemStack(Material.STAINED_CLAY, 1, (short)1), ChatColor.AQUA + "1");
    if (item.equals(spawnitem)) {
      player.sendMessage(ChatColor.YELLOW + "You Have Rated The plot 1/10");
      player.performCommand("plot rate 1");
      player.closeInventory();
    }
    ItemStack spawnitem1 = NameItem(new ItemStack(Material.STAINED_CLAY, 1, (short)2), ChatColor.AQUA + "2");
    if (item.equals(spawnitem1)) {
      player.sendMessage(ChatColor.YELLOW + "You Have Rated The plot 2/10");
      player.performCommand("plot rate 2");
      player.closeInventory();
    }
    ItemStack spawnitem2 = NameItem(new ItemStack(Material.STAINED_CLAY, 1, (short)3), ChatColor.AQUA + "3");
    if (item.equals(spawnitem2)) {
      player.sendMessage(ChatColor.YELLOW + "You Have Rated The plot 3/10");
      player.performCommand("plot rate 3");
      player.closeInventory();
    }
    ItemStack spawnitem3 = NameItem(new ItemStack(Material.STAINED_CLAY, 1, (short)4), ChatColor.AQUA + "4");
    if (item.equals(spawnitem3)) {
      player.sendMessage(ChatColor.YELLOW + "You Have Rated The plot 4/10");
      player.performCommand("plot rate 4");
      player.closeInventory();
    }
    ItemStack spawnitem4 = NameItem(new ItemStack(Material.STAINED_CLAY, 1, (short)5), ChatColor.AQUA + "5");
    if (item.equals(spawnitem4)) {
      player.sendMessage(ChatColor.YELLOW + "You Have Rated The plot 5/10");
      player.performCommand("plot rate 5");
      player.closeInventory();
    }
    ItemStack spawnitem5 = NameItem(new ItemStack(Material.STAINED_CLAY, 1, (short)6), ChatColor.AQUA + "6");
    if (item.equals(spawnitem5)) {
      player.sendMessage(ChatColor.YELLOW + "You Have Rated The plot 6/10");
      player.performCommand("plot rate 6");
      player.closeInventory();
    }
    ItemStack spawnitem6 = NameItem(new ItemStack(Material.STAINED_CLAY, 1, (short)7), ChatColor.AQUA + "7");
    if (item.equals(spawnitem6)) {
      player.sendMessage(ChatColor.YELLOW + "You Have Rated The plot 7/10");
      player.performCommand("plot rate 7");
      player.closeInventory();
    }
    ItemStack spawnitem7 = NameItem(new ItemStack(Material.STAINED_CLAY, 1, (short)8), ChatColor.AQUA + "8");
    if (item.equals(spawnitem7)) {
      player.sendMessage(ChatColor.YELLOW + "You Have Rated The plot 8/10");
      player.performCommand("plot rate 8");
      player.closeInventory();
    }
    ItemStack spawnitem8 = NameItem(new ItemStack(Material.STAINED_CLAY, 1, (short)9), ChatColor.AQUA + "9");
    if (item.equals(spawnitem8)) {
      player.sendMessage(ChatColor.YELLOW + "You Have Rated The plot 9/10");
      player.performCommand("plot rate 9");
      player.closeInventory();
    }
    ItemStack spawnitem9 = NameItem(new ItemStack(Material.STAINED_CLAY, 1, (short)10), ChatColor.AQUA + "10");
    if (item.equals(spawnitem9)) {
      player.sendMessage(ChatColor.YELLOW + "You Have Rated The plot 10/10");
      player.performCommand("plot rate 10");
      player.closeInventory();
    }
    if (item.getType() == Material.REDSTONE_BLOCK) {
      player.performCommand("plotgui");
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
