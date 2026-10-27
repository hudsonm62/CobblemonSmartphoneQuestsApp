package com.ziroau.cobblemonsmartphonequestsapp.client

import com.nbp.cobblemon_smartphone.api.SmartphoneActionRegistry
import com.ziroau.cobblemonsmartphonequestsapp.client.actions.OpenQuestsAction
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
object SmartphoneQuestsAppClient {
    const val MOD_ID = "cobblemonsmartphonequestsapp"
    val LOGGER: Logger = LogManager.getLogger(MOD_ID)

    fun init() {
        try {
            SmartphoneActionRegistry.register(OpenQuestsAction())
            LOGGER.info("Registered Quests App to Cobblemon Smartphone")
        } catch (e: Exception) {
            LOGGER.error("Failed to initialize $MOD_ID", e)
        }
    }
}
