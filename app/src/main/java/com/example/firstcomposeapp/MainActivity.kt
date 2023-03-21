package com.example.firstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstcomposeapp.ui.theme.AquaBlue
import com.example.firstcomposeapp.ui.theme.Beige3
import com.example.firstcomposeapp.ui.theme.DarkerButtonBlue
import com.example.firstcomposeapp.ui.theme.DeepBlue
import com.example.firstcomposeapp.ui.theme.FirstComposeAppTheme
import com.example.firstcomposeapp.ui.theme.HomeScreen
import com.example.firstcomposeapp.ui.theme.LightGreen1
import com.example.firstcomposeapp.ui.theme.LightRed
import com.example.firstcomposeapp.ui.theme.OrangeYellow1
import com.example.firstcomposeapp.ui.theme.TextWhite

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstComposeAppTheme{
                HomeScreen()
            }
        }
    }
}


