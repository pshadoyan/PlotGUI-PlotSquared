package me.patrick.plotgui.commands.inventory;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class Biome implements org.bukkit.event.Listener
{
  public Biome() {}

    ArrayList<String> players = new ArrayList <String>();


  @org.bukkit.event.EventHandler
  public void onBiome(InventoryClickEvent event)
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
    String p = event.getWhoClicked().getName();
    if (item.getType() == org.bukkit.Material.DIRT)
    {
        player.closeInventory();
        player.performCommand("plot biome 1");
        player.sendMessage(ChatColor.GREEN + "Stand in your plot and enter the biome you'd like to be shown, print exactly as seen above");
        player.sendMessage(ChatColor.GREEN + "                                                                          ");
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
            event.getPlayer().performCommand("plot" + " " + "biome" + " " + event.getMessage());
            players.remove(player_name);
            event.setCancelled(true);
    }

}
