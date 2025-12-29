package com.example.mitienda.domain.model

data class Product(
    val productId: Int,
    val barcode: String,
    val name: String,
    val description: String,
    val price: Double,
    val stock: Int,
)