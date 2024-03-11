package com.kvsinyuk.spendingsbot.adapter.out.jpa.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import org.springframework.data.annotation.CreatedDate
import java.math.BigDecimal
import java.time.Instant

@Entity
@Table(name = "spending")
class SpendingEntity {
    @Id
    private var id: Long = 0

    private var chatId: Long = 0

    @ManyToOne
    private lateinit var category: CategoryEntity

    private var description: String? = null

    private var sum: BigDecimal = BigDecimal.ZERO

    @CreatedDate
    private lateinit var createdAt: Instant
}
