package com.kvsinyuk.spendingsbot.adapter.out.jpa.entity

enum class CommandStatus {
    ADD_SPENDING,
    ADD_SPENDING_SET_CATEGORY,
    ADD_SPENDING_SET_DESCRIPTION,
    ADD_SPENDING_SET_SUM,

    ADD_CATEGORY,
    ADD_CATEGORY_SET_NAME,
}
