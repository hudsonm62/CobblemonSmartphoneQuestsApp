package com.ziroau.cobblemonsmartphonequestsapp.client.actions

import com.cobblemon.mod.common.CobblemonSounds.POKEDEX_CLICK
import com.nbp.cobblemon_smartphone.api.SmartphoneAction
import com.ziroau.cobblemonsmartphonequestsapp.client.SmartphoneQuestsAppClient.MOD_ID
import earth.terrarium.heracles.client.HeraclesClient.openQuestScreen
import net.minecraft.client.MinecraftClient
import net.minecraft.util.Identifier

class OpenQuestsAction(
    override val id: String = "open_quests",
    override val texture: Identifier = Identifier.of(MOD_ID, "textures/quests_icon.png"),
    override val hoverTexture: Identifier = Identifier.of(MOD_ID, "textures/quests_icon_hover.png")
) : SmartphoneAction {
    override fun onClick() {
        val client = MinecraftClient.getInstance()
        val player = client.player ?: return
        player.playSound(POKEDEX_CLICK, 0.5f, 1f)

        openQuestScreen()
    }
}
