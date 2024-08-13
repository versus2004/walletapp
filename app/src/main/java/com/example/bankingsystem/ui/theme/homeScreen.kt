package com.example.bankingsystem.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bankingsystem.BottomBar.bottomBar
import com.example.bankingsystem.BottomBar.items
import com.example.bankingsystem.cardsection.cardSection
import com.example.bankingsystem.financesection.financeSection
import com.example.bankingsystem.walletsection.walletSection

@Composable
fun homeScreen(){

    Scaffold(bottomBar = {
         bottomBar()

    }) { padding->
        Column(Modifier.padding(padding)) {
            walletSection()
            cardSection()
            Spacer(modifier = Modifier.height(8.dp))
            financeSection()
        }

    }
}

@Preview
@Composable
fun prev(){
    homeScreen()
}