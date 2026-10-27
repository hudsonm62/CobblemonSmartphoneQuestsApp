package com.ziroau.cobblemonsmartphonequestsapp.neoforge.client

import com.ziroau.cobblemonsmartphonequestsapp.client.SmartphoneQuestsAppClient
import net.neoforged.api.distmarker.Dist
import net.neoforged.bus.api.IEventBus
import net.neoforged.fml.common.Mod
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent

@Suppress("unused")
@Mod(value = "cobblemonsmartphonequestsapp", dist = [Dist.CLIENT])
class SmartphoneQuestsAppNeoForgeClient(modBus: IEventBus) {
    init {
        modBus.addListener(::onClientSetup)
    }

    private fun onClientSetup(event: FMLClientSetupEvent) {
        event.enqueueWork {
            SmartphoneQuestsAppClient.init()
        }
    }
}
