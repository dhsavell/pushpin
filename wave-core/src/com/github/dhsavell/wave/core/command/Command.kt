package com.github.dhsavell.wave.core.command

import com.github.dhsavell.wave.core.bot.Bot
import org.mapdb.DB
import sx.blah.discord.handle.obj.IMessage

sealed class CommandResult
object CommandFailed : CommandResult()
object CommandSucceeded : CommandResult()
data class CommandSucceededWithValue(val message: String) : CommandResult()

/**
 * Interface representing a command that can be called by a user.
 */
interface Command {
    /**
     * Name of this command, used both for display and call detection.
     */
    val name: String

    /**
     * Aliases of this command.
     */
    val aliases: Array<String>
        get() = arrayOf()

    /**
     * Executes this command.
     * @param bot Bot calling this command.
     * @param db MapDB instance.
     * @param message Message containing the command invocation.
     * @return Whether or not the command was executed successfully.
     */
    operator fun invoke(bot: Bot, db: DB, message: IMessage, args: List<String>): CommandResult
}