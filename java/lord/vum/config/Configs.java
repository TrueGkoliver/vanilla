package lord.vum.config;

import lord.vum.util.Reference;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = Reference.MODID, category = "")
@Mod.EventBusSubscriber(modid = Reference.MODID)
public class Configs {
	
	public static ConfigGeneral general = new ConfigGeneral();
	public static ConfigWorldGen worldgen = new ConfigWorldGen();
	
	public static class ConfigGeneral {
		//hi
	}
	
	public static class ConfigWorldGen {
		
		@Config.Comment({"Jade ore veins per chunk", "Default: 2"})
		@Config.RequiresWorldRestart
		public int jadeVeinFrequency = 2;
		
		@Config.Comment({"Amethyst ore veins per chunk", "Default: 2"})
		@Config.RequiresWorldRestart
		public int amethystVeinFrequency = 2;
		
		@Config.Comment({"Limestone veins per chunk", "Default: 6"})
		@Config.RequiresWorldRestart
		public int limestoneVeinFrequency = 6;
		
		@Config.Comment({"Marble veins per chunk", "Default: 6"})
		@Config.RequiresWorldRestart
		public int marbleVeinFrequency = 6;
	}
	
	@SubscribeEvent
	public static void onConfigReload(ConfigChangedEvent.OnConfigChangedEvent event) 
	{
		if (Reference.MODID.equals(event.getModID()))
			ConfigManager.sync(Reference.MODID, Config.Type.INSTANCE);
	}
	

}
