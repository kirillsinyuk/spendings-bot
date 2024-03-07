package com.kvsinyuk.spendingsbot.adapter.`in`.telegram.handler

import com.kvsinyuk.spendingsbot.applicaiton.port.out.TelegramMessagePort
import com.kvsinyuk.spendingsbot.domain.TelegramUpdateMessage
import org.springframework.stereotype.Component

@Component
class HelpCommandHandler(
    private val telegramMessagePort: TelegramMessagePort,
) : TelegramUpdateHandler {
    override fun process(update: TelegramUpdateMessage) {
        telegramMessagePort.sendMessage(
            update.chatId,
            "You used /help command!",
        )
    }

    override fun canApply(update: TelegramUpdateMessage): Boolean = update.message == HELP_CMD

    companion object {
        const val HELP_CMD = "/help"
    }
}
