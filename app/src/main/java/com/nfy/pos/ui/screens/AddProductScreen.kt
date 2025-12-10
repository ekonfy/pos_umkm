package com.nfy.pos.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nfy.pos.ui.organisms.ProductForm
import com.nfy.pos.ui.templates.BaseScreenLayout

private const val TAG = "AddProductScreen"

@Composable
fun AddProductScreen(modifier: Modifier = Modifier) {
    BaseScreenLayout(
        modifier = modifier.fillMaxSize(),
        title = "Add New Product"
    ) { paddingValues: PaddingValues ->
        ProductForm(
            modifier = Modifier.padding(paddingValues),
            onSaveClick = { name, price ->
                // Di sini Anda akan mengintegrasikan ViewModel atau UseCase untuk menyimpan produk
                Log.d(TAG, "Saving product: Name = $name, Price = $price")
                // Contoh: productViewModel.saveProduct(name, price)
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAddProductScreen() {
    AddProductScreen()
}
