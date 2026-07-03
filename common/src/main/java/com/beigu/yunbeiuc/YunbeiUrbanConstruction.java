package com.beigu.yunbeiuc;

import com.beigu.yunbeiuc.block.MunicipalBlocks;
import com.beigu.yunbeiuc.block.RoadBlocks;
import com.beigu.yunbeiuc.block.SignBlocks;
import com.beigu.yunbeiuc.entity.ModBlockEntities;
import com.beigu.yunbeiuc.item.ModItemGroups;
import com.beigu.yunbeiuc.item.ModItems;
import com.beigu.yunbeiuc.network.ModEvents;
import com.beigu.yunbeiuc.network.ModMessages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class YunbeiUrbanConstruction {
    public static final String MOD_ID = "yunbeiuc";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        LOGGER.info("YunbeiUrbanConstruction has finished loading");

        MunicipalBlocks.init();
        RoadBlocks.init();
        SignBlocks.init();
        ModBlockEntities.init();
        ModItems.registerItems();
        ModItemGroups.init();
        ModMessages.registerC2SPackets();
        ModEvents.register();
    }
}
