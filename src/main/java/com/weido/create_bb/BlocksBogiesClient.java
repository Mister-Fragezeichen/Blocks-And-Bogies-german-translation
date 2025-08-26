package com.weido.create_bb;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

import com.weido.create_bb.registry.BogiePartials;

@Mod(value = BlocksBogies.MOD_ID, dist = Dist.CLIENT)
public class BlocksBogiesClient {
    public BlocksBogiesClient(IEventBus modEventBus) {
        onCtorClient(modEventBus);
    }

    public static void onCtorClient(net.neoforged.bus.api.IEventBus modEventBus) {
        modEventBus.addListener(BlocksBogiesClient::clientInit);
    }
    public static void clientInit(final FMLClientSetupEvent event) {
        BogiePartials.init();
    }
}
