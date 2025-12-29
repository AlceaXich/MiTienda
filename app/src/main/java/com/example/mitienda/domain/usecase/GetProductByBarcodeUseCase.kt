package com.example.mitienda.domain.usecase

import com.example.mitienda.domain.model.Product
import com.example.mitienda.domain.repository.ProductRepository

class GetProductByBarcodeUseCase(
    private val repository: ProductRepository
) {
    suspend operator fun invoke(barcode: String): Product? {
        return repository.getProductByBarcode(barcode)
    }
}