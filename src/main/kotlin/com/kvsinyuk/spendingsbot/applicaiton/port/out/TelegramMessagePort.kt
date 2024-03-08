package com.kvsinyuk.spendingsbot.applicaiton.port.out

import com.pengrad.telegrambot.model.request.Keyboard

interface TelegramMessagePort {
    fun sendMessage(
        chatId: Long,
        msg: String,
        keyboard: Keyboard? = null,
    )
}
