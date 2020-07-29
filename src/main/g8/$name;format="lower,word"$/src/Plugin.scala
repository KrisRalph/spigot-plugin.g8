package $name;format="lower,word"$

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class Plugin extends JavaPlugin {
  override def onEnable(): Unit = {
    println("Plugin enabled!")
  }
}
