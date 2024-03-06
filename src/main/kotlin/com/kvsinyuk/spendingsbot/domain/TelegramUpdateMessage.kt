package com.kvsinyuk.spendingsbot.domain

data class TelegramUpdateMessage(
    val message: String?,
    val chatId: Long,
)
