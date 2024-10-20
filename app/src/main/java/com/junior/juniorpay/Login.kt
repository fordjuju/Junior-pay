package com.junior.juniorpay

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.junior.juniorpay.ui.theme.JuniorPayTheme

@Composable
fun Login(modifier: Modifier = Modifier) {

    Column(Modifier.fillMaxSize()) {

    }

}

@Preview
@Composable
private fun LoginPreview() {
    JuniorPayTheme {
        Login(Modifier)
    }
}