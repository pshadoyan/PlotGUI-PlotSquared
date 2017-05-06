package me.patrick.plotgui.commands.inventory;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class Comment implements org.bukkit.event.Listener
{
  public Comment() {}

    ArrayList<String> players = new ArrayList <String>();

  @org.bukkit.event.EventHandler(priority = EventPriority.HIGH)
  public void onComment(InventoryClickEvent event)
  {
      Inventory inv = event.getInventory();
    if (!inv.getTitle().equals("Plot GUI")) {
      return;
    }
    if (!(event.getWhoClicked() instanceof Player)) {
      return;
    }
    Player player = (Player)event.getWhoClicked();
    String p = event.getWhoClicked().getName();
    ItemStack item = event.getCurrentItem();
    if (item.getType() == org.bukkit.Material.BOOK_AND_QUILL)
    {
      player.closeInventory();
      player.sendMessage(ChatColor.GREEN + "Stand in a plot and enter the comment you'd like to be shown!");
      player.sendMessage(ChatColor.GREEN + "                                                ");
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
        event.getPlayer().performCommand("plot" + " " + "comment" + " " + "public" + " " + event.getMessage());
        players.remove(player_name);
        event.setCancelled(true);
    }

}
