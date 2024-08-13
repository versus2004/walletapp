package com.example.bankingsystem.financesection

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.StarHalf
import androidx.compose.material.icons.rounded.StarHalf
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val finance = listOf(financedata("My Bussines" , Icons.AutoMirrored.Rounded.StarHalf),
    financedata("My Wallet" , Icons.Rounded.Wallet),financedata("My Wallet" , Icons.Rounded.Wallet),
)

@Composable
fun financeSection(){
Column {
    Text(text = "Finances" , fontSize = 17.sp  )
    LazyRow {
        items(finance){jiofin->

            financecard(financedata = jiofin)
            
        }
    }

}
}

@Composable
fun financecard(financedata: financedata)
{
    Box(modifier = Modifier
        .clip(RoundedCornerShape(10.dp))
        .background(MaterialTheme.colorScheme.onBackground).padding(8.dp))
    {
    Card() {
        Column() {

            Box(
                Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .background(color = Color.Cyan)){ Icon(imageVector = financedata.icon, contentDescription = financedata.name) }
            Text(text = financedata.name)

        }
    }
    }

}