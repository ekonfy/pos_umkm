package com.nfy.pos.ui.organisms

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nfy.pos.ui.atoms.ButtonAtom
import com.nfy.pos.ui.molecules.ProductInputField

@Composable
fun ProductForm(
    modifier: Modifier = Modifier,
    onSaveClick: (name: String, price: String) -> Unit
) {
    var productName by remember { mutableStateOf("") }
    var productPrice by remember { mutableStateOf("") }

    Column(modifier = modifier.fillMaxWidth().padding(16.dp)) {
        ProductInputField(
            label = "Product Name",
            value = productName,
            onValueChange = { productName = it },
            placeholder = "Enter product name"
        )
        Spacer(modifier = Modifier.height(16.dp))
        ProductInputField(
            label = "Product Price",
            value = productPrice,
            onValueChange = { productPrice = it },
            placeholder = "Enter product price"
        )
        Spacer(modifier = Modifier.height(24.dp))
        ButtonAtom(
            text = "Save Product",
            onClick = { onSaveClick(productName, productPrice) },
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ProductFormPreview() {
    ProductForm(onSaveClick = { name, price ->
        // Handle save logic in preview
    })
}
