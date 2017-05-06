package me.patrick.plotgui.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Plotgui implements CommandExecutor
{
  public Plotgui() {}
  
  public boolean onCommand(CommandSender sender, Command cmd, String stringLabel, String[] args)
  {
    if (!(sender instanceof Player)) {
      sender.sendMessage("You must be a player to use this command");
      return false;
    }
    Player player = (Player)sender;
    Inventory inv = org.bukkit.Bukkit.createInventory(null, 9, "Plot GUI");
    ItemStack spawnitem = nameItem(new ItemStack(Material.DIRT), ChatColor.AQUA + "Create Plot");
    inv.setItem(0, spawnitem);
    player.openInventory(inv);
    
    ItemStack spawnitem1 = nameItem(new ItemStack(Material.GRASS), ChatColor.AQUA + "Teleport to Plot");
    inv.setItem(1, spawnitem1);
    player.openInventory(inv);
    
    ItemStack spawnitem2 = nameItem(new ItemStack(Material.ENDER_CHEST), ChatColor.AQUA + "Manage your Plot");
    inv.setItem(3, spawnitem2);
    player.openInventory(inv);
    
    ItemStack spawnitem3 = nameItem(new ItemStack(Material.BOOK), ChatColor.AQUA + "Rate a Plot");
    inv.setItem(4, spawnitem3);
    player.openInventory(inv);
    
    ItemStack spawnitem4 = nameItem(new ItemStack(Material.MAP), ChatColor.AQUA + "Plot Info");
    inv.setItem(5, spawnitem4);
    player.openInventory(inv);
    
    ItemStack spawnitem5 = nameItem(new ItemStack(Material.BOOK_AND_QUILL), ChatColor.AQUA + "Leave a Comment");
    inv.setItem(7, spawnitem5);
    player.openInventory(inv);
    
    return true;
  }
  
  private ItemStack nameItem(ItemStack item, String name)
  {
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(name);
    item.setItemMeta(meta);
    return item;
  }
}
