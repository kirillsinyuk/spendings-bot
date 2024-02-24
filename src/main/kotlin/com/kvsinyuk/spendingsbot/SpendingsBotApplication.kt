package com.kvsinyuk.spendingsbot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpendingsBotApplication

fun main(args: Array<String>) {
	runApplication<SpendingsBotApplication>(*args)
}
