package me.patrick.plotgui.commands.inventory;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Inventorygamemode implements org.bukkit.event.Listener
{
  public Inventorygamemode() {}
  
  @EventHandler
  public void onInventorygamemode(InventoryClickEvent event)
  {
    Inventory inv1 = event.getInventory();
    if (!inv1.getTitle().equals("Plot Manager")) {
      return;
    }
    if (!(event.getWhoClicked() instanceof Player)) {
      return;
    }
    Player player = (Player)event.getWhoClicked();
    ItemStack item = event.getCurrentItem();
    ItemStack spawnitem16 = NameItem(new ItemStack(Material.STAINED_GLASS, 1, (short)14), ChatColor.AQUA + "PVP ON");
    ItemStack spawnitem17 = NameItem(new ItemStack(Material.STAINED_GLASS, 1, (short)5), ChatColor.AQUA + "PVP OFF");
    if (item.getType() == Material.DIAMOND)
    {
      player.setGameMode(GameMode.CREATIVE);
      player.sendMessage("GameMode changed to CREATIVE");
      player.closeInventory();
    }
    

    if (item.getType() == Material.DIAMOND_SWORD)
    {
      player.setGameMode(GameMode.SURVIVAL);
      player.sendMessage("GameMode changed to SURVIVAL");
      player.closeInventory();
    }
    
    if (item.getType() == Material.EYE_OF_ENDER)
    {
      player.setGameMode(GameMode.SPECTATOR);
      player.sendMessage("GameMode changed to SPECTATOR");
      player.closeInventory();
    }
    

    if (item.equals(spawnitem16))
    {
      player.setGameMode(GameMode.SURVIVAL);
      player.sendMessage(ChatColor.RED + "PVP ON");
      player.closeInventory();
    }
    

    if (item.equals(spawnitem17))
    {
      player.setGameMode(GameMode.CREATIVE);
      player.sendMessage(ChatColor.GREEN + "PVP OFF");
      player.closeInventory();
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
