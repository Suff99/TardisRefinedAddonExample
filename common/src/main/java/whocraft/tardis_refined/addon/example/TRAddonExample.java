package whocraft.tardis_refined.addon.example;

import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import whocraft.tardis_refined.TardisRefined;
import whocraft.tardis_refined.addon.example.events.TRAddonCommonEvents;
import whocraft.tardis_refined.addon.example.upgrades.TRAddonExampleUpgrades;

public class TRAddonExample
{
	public static final String MOD_ID = "tardisrefined_example";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	public static void init() {
		TRAddonCommonEvents.setupEvents();
		TRAddonExampleUpgrades.UPGRADE_DEFERRED_REGISTRY.register();
	}



	public static ResourceLocation makeKey(String id){
		return new ResourceLocation(MOD_ID, id);
	}
}
