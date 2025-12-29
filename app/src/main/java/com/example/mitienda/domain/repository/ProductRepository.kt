package com.example.mitienda.domain.repository

import com.example.mitienda.domain.model.Product

interface ProductRepository {
    suspend fun getProductByBarcode(barcode: String): Product?
}