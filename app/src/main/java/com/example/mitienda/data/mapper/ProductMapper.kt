package com.example.mitienda.data.mapper

import com.example.mitienda.data.local.ProductEntity
import com.example.mitienda.domain.model.Product

fun ProductEntity.toDomain(): Product =
    Product(
        productId = productId,
        barcode = barcode,
        name = name,
        description = description,
        price = price,
        stock = stock,

    )