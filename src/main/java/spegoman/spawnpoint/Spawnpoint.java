package spegoman.spawnpoint;

import org.bukkit.plugin.java.JavaPlugin;
import spegoman.spawnpoint.commands.SetSpawn;
import spegoman.spawnpoint.commands.Spawn;
import spegoman.spawnpoint.util.SpawnUtil;

public final class Spawnpoint extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        SpawnUtil spawnUtil = new SpawnUtil(this);
        getCommand("spawn").setExecutor(new Spawn(spawnUtil));
        getCommand("setSpawn").setExecutor(new SetSpawn(spawnUtil));
    }
}
