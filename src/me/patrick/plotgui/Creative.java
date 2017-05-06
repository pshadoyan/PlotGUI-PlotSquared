package me.patrick.plotgui;

import java.util.logging.Logger;
import me.patrick.plotgui.commands.Plotgui;
import me.patrick.plotgui.commands.inventory.Biome;
import me.patrick.plotgui.commands.inventory.Clear;
import me.patrick.plotgui.commands.inventory.Comment;
import me.patrick.plotgui.commands.inventory.Delete;
import me.patrick.plotgui.commands.inventory.Download;
import me.patrick.plotgui.commands.inventory.Exit;
import me.patrick.plotgui.commands.inventory.Inventoryclick1;
import me.patrick.plotgui.commands.inventory.Inventoryclickrate;
import me.patrick.plotgui.commands.inventory.Inventorygamemode;
import me.patrick.plotgui.commands.inventory.List;
import me.patrick.plotgui.commands.inventory.Merge;
import me.patrick.plotgui.commands.inventory.Plotclickrate;
import me.patrick.plotgui.commands.inventory.Plotinfo;
import me.patrick.plotgui.commands.inventory.Plotsave;
import me.patrick.plotgui.commands.inventory.Plotstart;
import me.patrick.plotgui.commands.inventory.Tptoplot;
import me.patrick.plotgui.commands.players.Addplayer;
import me.patrick.plotgui.commands.players.Kick;
import me.patrick.plotgui.commands.players.Remove;
import me.patrick.plotgui.commands.players.Trust;
import org.bukkit.Server;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Creative
  extends JavaPlugin
{
  Logger logger = getLogger();
  PluginDescriptionFile pdfFile = getDescription();
  
  public Creative() {}
  
  public void onEnable() { logger.info(pdfFile.getName() + " has been enabled (V." + pdfFile.getVersion() + ")");
    
    registerCommands();
    registerEvents();
  }
  
  public void onDisable()
  {
    logger.info(pdfFile.getName() + "has been disabled (V." + pdfFile.getVersion() + ")");
  }
  


  private void registerCommands()
  {
    getCommand("plotgui").setExecutor(new Plotgui());
  }
  
  private void registerEvents() {
    PluginManager pm = getServer().getPluginManager();
    pm.registerEvents(new Inventoryclick1(), this);
    pm.registerEvents(new Inventoryclickrate(), this);
    pm.registerEvents(new Inventorygamemode(), this);
    pm.registerEvents(new Comment(), this);
    pm.registerEvents(new Plotclickrate(), this);
    pm.registerEvents(new Plotstart(), this);
    pm.registerEvents(new Tptoplot(), this);
    pm.registerEvents(new Plotinfo(), this);
    pm.registerEvents(new Addplayer(), this);
    pm.registerEvents(new Remove(), this);
    pm.registerEvents(new Merge(), this);
    pm.registerEvents(new Kick(), this);
    pm.registerEvents(new Trust(), this);
    pm.registerEvents(new Download(), this);
    pm.registerEvents(new Plotsave(), this);
    pm.registerEvents(new Biome(), this);
    pm.registerEvents(new Clear(), this);
    pm.registerEvents(new Delete(), this);
    pm.registerEvents(new List(), this);
    pm.registerEvents(new Exit(), this);
  }
}
