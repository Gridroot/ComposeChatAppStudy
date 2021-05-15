package me.woocheol.myapplication.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun MaterialBind(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        content = content
    )
}
