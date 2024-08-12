package com.example.bankingsystem.cardsection

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankingsystem.ui.theme.BlueEnd
import com.example.bankingsystem.ui.theme.BlueStart
import com.example.bankingsystem.ui.theme.OrangeEnd
import com.example.bankingsystem.ui.theme.OrangeStart
import com.example.bankingsystem.ui.theme.PurpleEnd
import com.example.bankingsystem.ui.theme.PurpleStart

val cards = listOf(carddata("Debit",7645
    ,"1234 5678 1234 4567", "Business", color = getgradient(PurpleStart , PurpleEnd)
),carddata("VISA",7645
    ,"1234 5678 1234 4567", "Business", color = getgradient(OrangeStart , OrangeEnd)
),
    carddata("VISA",7645
        ,"1234 5678 1234 4567", "Business", color = getgradient(BlueStart , BlueEnd)
    ))




fun getgradient(startcolor : Color, endcolor: Color): Brush{

    return Brush.horizontalGradient(listOf(startcolor, endcolor))
}

@Composable
fun cardSection(){
    LazyRow(Modifier.padding(8.dp)) {
        items(cards){cards->
            bankcards(carddata = cards)
            
        }
    }

}

@Composable
fun bankcards(carddata: carddata){
    val balance = carddata.balance.toString()
    Card(Modifier.clip(RoundedCornerShape(8.dp)).padding(6.dp)) {
        Box(modifier = Modifier.background(carddata.color)) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(16.dp)) {
                Icon(imageVector = Icons.Rounded.ShoppingCart, contentDescription = null)
                Spacer(modifier = Modifier.height(5.dp))
                Text(text =carddata.cardtype, fontSize = 12.sp , fontWeight = FontWeight.Bold , color = MaterialTheme.colorScheme.background)
                Text(text = "$ $balance", fontSize = 12.sp , fontWeight = FontWeight.Bold , color = MaterialTheme.colorScheme.background)
                Text(text = carddata.cardnumber.toString())



            }
        }
    }
}
@Preview
@Composable
fun cardprev(){
    bankcards(carddata("Debit" ,7645
        ,"1234 5678 1234 4567", "Business", color = getgradient(PurpleStart , PurpleEnd)))
}