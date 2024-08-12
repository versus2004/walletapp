package com.example.bankingsystem.cardsection

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Brush

data class carddata(
    val cardtype : String,
    val balance : Long ,
    val cardnumber : String ,
    val cardname : String,
    val color : Brush,
    @DrawableRes val log : Int
)
