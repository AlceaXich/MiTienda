package com.example.mitienda.data.repository

import com.example.mitienda.data.local.ProductDao
import com.example.mitienda.data.mapper.toDomain
import com.example.mitienda.domain.model.Product
import com.example.mitienda.domain.repository.ProductRepository

class ProductRepositoryImpl(
    private val productDao: ProductDao
) : ProductRepository {
    override suspend fun getProductByBarcode(barcode: String): Product? {
        return productDao.getProductByBarcode(barcode)?.toDomain()
    }
}