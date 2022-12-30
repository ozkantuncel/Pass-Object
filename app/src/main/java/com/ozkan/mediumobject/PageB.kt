package com.ozkan.mediumobject

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun PageB(book: Book,navController: NavController) {
  Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = book.id, fontSize = 17.sp,)
        Text(text = book.title, fontSize = 17.sp,)
        Text(text = book.author, fontSize = 17.sp,)
        Text(text = book.description, fontSize = 17.sp,)
        Text(text = book.price, fontSize = 17.sp,)

        Button(onClick =
        {
            navController.popBackStack()
            navController.navigate(route = "PageA")

        }) {
            Text(text = "SayfaA'ye geç")
        }
    }
}