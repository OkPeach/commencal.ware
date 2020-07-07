package ca.commencal.ware.module.modules;

import ca.commencal.ware.module.Module;
import ca.commencal.ware.module.ModuleCategory;
import ca.commencal.ware.utils.system.Wrapper;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class NoRain extends Module {

	public NoRain() {
		super("NoRain", ModuleCategory.RENDER);
	}
	
	@Override
	public void onClientTick(ClientTickEvent event) {
        Wrapper.INSTANCE.world().setRainStrength(0.0f);
		super.onClientTick(event);
	}

}
