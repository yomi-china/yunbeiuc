package com.beigu.yunbeiuc.forge;

import com.beigu.yunbeiuc.YunbeiUrbanConstruction;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(YunbeiUrbanConstruction.MOD_ID)
public final class YunbeiUrbanConstructionForge {
    public YunbeiUrbanConstructionForge() {
        EventBuses.registerModEventBus(YunbeiUrbanConstruction.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        YunbeiUrbanConstruction.init();
    }
}
