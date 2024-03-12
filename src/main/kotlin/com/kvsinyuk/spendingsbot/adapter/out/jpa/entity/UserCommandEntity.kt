package com.kvsinyuk.spendingsbot.adapter.out.jpa.entity

import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.springframework.data.annotation.CreatedDate
import java.time.Instant

@Entity
@Table(name = "user_command")
class UserCommandEntity {
    @Id
    private var chatId: Long = 0

    @Enumerated(EnumType.STRING)
    private lateinit var status: CommandStatus

    @CreatedDate
    private lateinit var createdAt: Instant
}
