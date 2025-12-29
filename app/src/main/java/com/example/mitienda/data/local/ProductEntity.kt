package com.example.mitienda.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class ProductEntity(
    @PrimaryKey
    val productId: Int,

    val barcode: String,
    val name: String,
    val description: String,
    val price: Double,
    val stock: Int,
) {
}