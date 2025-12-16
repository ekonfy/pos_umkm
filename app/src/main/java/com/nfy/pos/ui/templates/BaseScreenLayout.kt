package com.nfy.pos.ui.templates

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nfy.pos.ui.atoms.TextAtom

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BaseScreenLayout(
    modifier: Modifier = Modifier,
    title: String? = null,
    content: @Composable (PaddingValues) -> Unit
) {
    Scaffold(
        topBar = {
            if (title != null) {
                TopAppBar(
                    title = { TextAtom(text = title) }
                )
            }
        },
        modifier = modifier
    ) {
        // Perlu blok lambda di sini untuk konten
        Surface(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.padding(it)) { // Menggunakan 'it' untuk PaddingValues
                content(it)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBaseScreenLayout() {
    BaseScreenLayout(title = "Sample Title") {
        Text(text = "This is the content of the screen") // Modifier padding sudah ditangani di dalam BaseScreenLayout
    }
}
