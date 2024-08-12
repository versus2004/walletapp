package com.example.bankingsystem.BottomBar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue


@Composable
fun bottomBar(){
    val listed = listOf(
        items("Home" , Icons.Rounded.Home) ,

        items("Notifications" , Icons.Rounded.Notifications) ,

        items("Account" , Icons.Rounded.AccountCircle) ,

        items("Settings" , Icons.Rounded.Settings)
    )
    var selectedindex by remember {
        mutableIntStateOf(0)
    }
    NavigationBar {
        NavigationBar {
            listed.forEachIndexed { index, items ->
                NavigationBarItem(selected = selectedindex==index, onClick = { selectedindex = index }, icon = { Icon(
                    imageVector = items.icon,
                    contentDescription = items.name
                ) } , label = { items.name })
            }


        }
    }
}