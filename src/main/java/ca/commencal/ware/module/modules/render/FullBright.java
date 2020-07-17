package ca.commencal.ware.module.modules.render;

import ca.commencal.ware.module.Module;
import ca.commencal.ware.module.ModuleCategory;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class FullBright extends Module {

    public FullBright() {
        super("Fullbright", ModuleCategory.RENDER);
    }

    @Override
    public void onClientTick(TickEvent.ClientTickEvent event) {
        Minecraft.getMinecraft().gameSettings.gammaSetting = 10000f;
        super.onClientTick(event);
    }
}
