package com.nfy.pos.data.source

import com.nfy.pos.data.model.Product
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.util.UUID

class InMemoryProductDataSource {

    private val _products = MutableStateFlow<List<Product>>(emptyList())
    val products: Flow<List<Product>> = _products.asStateFlow()

    fun addProduct(name: String, price: Double) {
        val newProduct = Product(
            id = UUID.randomUUID().toString(),
            name = name,
            price = price,
            quantity = 1 // Default quantity for new product
        )
        _products.value = _products.value + newProduct
    }

    fun getProductById(id: String): Product? {
        return _products.value.find { it.id == id }
    }

    fun getAllProducts(): List<Product> {
        return _products.value
    }
}
