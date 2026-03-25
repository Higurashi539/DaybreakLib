package dev.higurashi.daybreaklib;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(DaybreakLib.MOD_ID)
public class DaybreakLib {
    public static final String MOD_ID = "daybreaklib";
    public static final Logger LOGGER = LogUtils.getLogger();

    public DaybreakLib() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MinecraftForge.EVENT_BUS.register(this);
    }
}
