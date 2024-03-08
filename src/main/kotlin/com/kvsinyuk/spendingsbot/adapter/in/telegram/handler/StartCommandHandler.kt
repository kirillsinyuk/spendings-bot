package com.kvsinyuk.spendingsbot.adapter.`in`.telegram.handler

import com.kvsinyuk.spendingsbot.applicaiton.port.out.TelegramMessagePort
import com.kvsinyuk.spendingsbot.domain.TelegramUpdateMessage
import org.springframework.stereotype.Component

@Component
class StartCommandHandler(
    private val telegramMessagePort: TelegramMessagePort,
) : TelegramUpdateHandler {
    override fun process(update: TelegramUpdateMessage) {
        telegramMessagePort.sendMessage(update.chatId, "You used /start command!")
    }

    override fun canApply(update: TelegramUpdateMessage) = update.message == START_CMD

    companion object {
        const val START_CMD = "/start"
    }
}
