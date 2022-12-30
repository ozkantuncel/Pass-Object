package com.ozkan.mediumobject

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun PageA(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick =
        {
            val book = Book(
                id = "1",
                title = "Satranç",
                description = "II. Dünya Savaşı’nın tüm yıkıcılığını dile getiriyor.",
                author = "Stefan Zweig",
                price = "10"
            )
            navController.currentBackStackEntry?.savedStateHandle?.set(
                key = "bookItem",
                value = book
            )
            navController.navigate(route = "PageB")

        }) {
            Text(text = "SayfaB'ye geç")
        }
    }
}