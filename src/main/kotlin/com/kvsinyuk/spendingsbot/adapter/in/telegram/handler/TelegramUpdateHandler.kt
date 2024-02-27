package com.kvsinyuk.spendingsbot.adapter.`in`.telegram.handler

import com.kvsinyuk.spendingsbot.domain.TelegramUpdateMessage

interface TelegramUpdateHandler {
    fun process(update: TelegramUpdateMessage)

    fun canApply(update: TelegramUpdateMessage): Boolean
}
