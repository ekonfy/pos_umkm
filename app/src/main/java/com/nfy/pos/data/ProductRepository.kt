package com.nfy.pos.data

import com.nfy.pos.data.model.Product
import com.nfy.pos.data.source.InMemoryProductDataSource
import kotlinx.coroutines.flow.Flow

class ProductRepository(private val dataSource: InMemoryProductDataSource) {

    val products: Flow<List<Product>> = dataSource.products

    fun addProduct(name: String, price: Double) {
        dataSource.addProduct(name, price)
    }

    fun getProductById(id: String): Product? {
        return dataSource.getProductById(id)
    }

    fun getAllProducts(): List<Product> {
        return dataSource.getAllProducts()
    }
}
