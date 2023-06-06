# Minecraft-Plugin-SpawnPoint
Minecraft spigot plugin for version 1.19.4 which provides a command to create a spawnpoint and also teleport to it


### Command Usage:
```
/setspawn - Sets the server spawnpoint

/spawn - Teleport player to server spawn
```


### Demo:

Setting spawn and executing command - 


https://github.com/tushar-bhat/Minecraft-Plugin-SpawnPoint/assets/79742902/22aa0f26-d0ed-4ef4-a154-a3e4921de404


# 

### This plugin also teleports a player to the server spawn whenever a player respawns


https://github.com/tushar-bhat/Minecraft-Plugin-SpawnPoint/assets/79742902/5e3b8643-8f9f-4409-804a-475c9369a682



### Dev Talk
Whenever the /setspawn command is issued, the plugin saves the spawn details in a .yml file containing the details of the location of the spawn and accesses it everytime whenever /spawn command is issued.

The .yml file is stored in the Spawnpoint folder located in server's plugin folder as spawn.yml.

Example of the details stored in .yml file-

![image](https://github.com/tushar-bhat/Minecraft-Plugin-SpawnPoint/assets/79742902/7124f7ec-c449-4165-abc8-307290574f74)
