package com.ziroau.cobblemonsmartphonequestsapp.fabric.client

import com.ziroau.cobblemonsmartphonequestsapp.client.SmartphoneQuestsAppClient
import net.fabricmc.api.ClientModInitializer

class SmartphoneQuestsAppFabricClient : ClientModInitializer {
    override fun onInitializeClient() {
        SmartphoneQuestsAppClient.init()
    }
}
