package me.patrick.plotgui.commands.players;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Kick implements org.bukkit.event.Listener
{
  public Kick() {}

  ArrayList<String> players = new ArrayList <String>();
  
  @org.bukkit.event.EventHandler
  public void onPlotinfo(InventoryClickEvent event)
  {
    Inventory inv1 = event.getInventory();
    if (!inv1.getTitle().equals("Plot Manager")) {
      return;
    }
    if (!(event.getWhoClicked() instanceof Player)) {
      return;
    }
    Player player = (Player)event.getWhoClicked();
    String p = event.getWhoClicked().getName();
    ItemStack item = event.getCurrentItem();
    ItemStack spawnitem3 = NameItem(new ItemStack(org.bukkit.Material.WOOL, 1, (short)14), org.bukkit.ChatColor.AQUA + "Kick Player");
    if (item.equals(spawnitem3)) {
      player.closeInventory();
      player.sendMessage(ChatColor.GREEN + "Enter the name of the player you'd like to kick from your plot!");
      player.sendMessage(ChatColor.GREEN + "                                                               ");
      players.add(p);
    }
    event.setCancelled(true);
  }

  @org.bukkit.event.EventHandler
  public void playerInput(AsyncPlayerChatEvent event)
  {
    if(players.isEmpty())
    {
      return;
    }
    String player_name = players.get(0);
    if (!(player_name.equals(event.getPlayer().getName())))
    {
      return;
    }
    event.getPlayer().performCommand("plot" + " " + "kick" + " "  + event.getMessage());
    players.remove(player_name);
    event.setCancelled(true);
  }
  
  private ItemStack NameItem(ItemStack item, String name) {
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(name);
    item.setItemMeta(meta);
    return item;
  }
}
