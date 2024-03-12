package com.kvsinyuk.spendingsbot.adapter.out.jpa.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.springframework.data.annotation.CreatedDate
import java.time.Instant

@Entity
@Table(name = "category")
class CategoryEntity {
    @Id
    private var id: Long = 0

    private var chatId: Long = 0

    private lateinit var name: String

    @CreatedDate
    private lateinit var createdAt: Instant
}
