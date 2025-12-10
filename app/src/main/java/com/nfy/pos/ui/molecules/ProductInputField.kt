package com.nfy.pos.ui.molecules

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nfy.pos.ui.atoms.TextAtom
import com.nfy.pos.ui.atoms.TextFieldAtom

@Composable
fun ProductInputField(
    label: String,
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    placeholder: String? = null,
    isError: Boolean = false,
    supportingText: @Composable (() -> Unit)? = null
) {
    Column(modifier = modifier.fillMaxWidth()) {
        TextAtom(
            text = label,
            modifier = Modifier.padding(bottom = 4.dp)
        )
        TextFieldAtom(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier.fillMaxWidth(),
            placeholder = placeholder,
            isError = isError,
            supportingText = supportingText
        )
    }
}
