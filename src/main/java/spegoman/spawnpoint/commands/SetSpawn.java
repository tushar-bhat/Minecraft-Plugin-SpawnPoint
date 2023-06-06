package spegoman.spawnpoint.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import spegoman.spawnpoint.util.SpawnUtil;

public class SetSpawn implements CommandExecutor {

    private SpawnUtil spawnUtil;
    public SetSpawn(SpawnUtil spawnUtil){
        this.spawnUtil = spawnUtil;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String [] args){
        if(!(sender instanceof Player)){
            sender.sendMessage("Only player can run this command");
            return true;
        }
        Player player = (Player) sender;
        spawnUtil.set(player.getLocation());

        player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&aSet the server spawn"));
        return true;
    }
}

