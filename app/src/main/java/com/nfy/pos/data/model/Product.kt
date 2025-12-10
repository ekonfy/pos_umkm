package com.nfy.pos.data.model

data class Product(
    val id: String,
    val name: String,
    val price: Double,
    val quantity: Int = 0
)
