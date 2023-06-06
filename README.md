# Minecraft-Plugin-SpawnPoint
Minecraft spigot plugin for version 1.19.4 which provides a command to create a spawnpoint and also teleport to it


### Command Usage:
```
/setspawn - Sets the server spawnpoint

/spawn - Teleport player to server spawn
```


### Demo:

Setting spawn and executing command - 


https://github.com/tushar-bhat/Minecraft-Plugin-SpawnPoint/assets/79742902/288df010-0fe3-404b-b54a-4e55340b82ad


# 

### This plugin also teleports a player to the server spawn whenever a player respawns


https://github.com/tushar-bhat/Minecraft-Plugin-SpawnPoint/assets/79742902/646a2af7-f62e-45a3-abab-4cbbe49685ad


### Dev Talk
Whenever the /setspawn command is issued, the plugin saves the spawn details in a .yml file containing the details of the location of the spawn and accesses it everytime whenever /spawn command is issued.

The .yml file is stored in the Spawnpoint folder located in server's plugin folder as spawn.yml.

Example of the details stored in .yml file-

![image](https://github.com/tushar-bhat/Minecraft-Plugin-SpawnPoint/assets/79742902/d560032f-1e62-4077-ae2b-80e65a781614)
