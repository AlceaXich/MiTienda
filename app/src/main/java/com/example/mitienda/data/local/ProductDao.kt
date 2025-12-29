package com.example.mitienda.data.local

import androidx.room.Dao
import androidx.room.Query

@Dao
interface ProductDao {

    @Query("SELECT * FROM products WHERE barcode = :barcode")
    suspend fun getProductByBarcode(barcode: String): ProductEntity
}