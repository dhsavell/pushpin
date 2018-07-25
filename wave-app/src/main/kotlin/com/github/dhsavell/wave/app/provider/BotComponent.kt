package com.github.dhsavell.wave.app.provider

import com.github.dhsavell.wave.app.LauncherModule
import com.github.dhsavell.wave.core.bot.Bot
import dagger.Component

@Component(modules = [ManagerModule::class, BotModule::class, LauncherModule::class])
interface BotComponent {
    fun bot(): Bot
}