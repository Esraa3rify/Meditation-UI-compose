package com.example.firstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstcomposeapp.ui.theme.AquaBlue
import com.example.firstcomposeapp.ui.theme.Beige3
import com.example.firstcomposeapp.ui.theme.DarkerButtonBlue
import com.example.firstcomposeapp.ui.theme.DeepBlue
import com.example.firstcomposeapp.ui.theme.FirstComposeAppTheme
import com.example.firstcomposeapp.ui.theme.LightGreen1
import com.example.firstcomposeapp.ui.theme.LightRed
import com.example.firstcomposeapp.ui.theme.OrangeYellow1
import com.example.firstcomposeapp.ui.theme.TextWhite

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column(

                modifier = Modifier
                    .fillMaxSize()
                    .background(DeepBlue)
                    .padding(18.dp)


            )


            {


                Greeting("Misha")
                Text(
                    "We wish you have a good day!",
                    color = Color.White, fontSize = 15.sp,
                    modifier = Modifier.offset(7.dp, 7.dp)
                        .blur(0.6.dp)


                )

            }


            Box(
                // shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .padding(top = 90.dp, start = 30.dp)
                    .background(DarkerButtonBlue)
                    .blur(1.dp)
                    .clip(RoundedCornerShape(10.dp))


            ) {
                Column(
                    modifier = Modifier
                        .height(50.dp)
                        .padding(16.dp)


                ) {
                    Text(
                        text = "Sweet Sleep",
                        color = Color.White
                    )
                }
            }


            Box(
                // shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .padding(top = 90.dp, start = 150.dp)
                    .background(DarkerButtonBlue)
                    .blur(1.dp)
                //  backgroundColor = MaterialTheme.colors.surface,
            ) {
                Column(
                    modifier = Modifier
                        .height(50.dp)
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Insomnia",
                        color = Color.White
                    )
                }
            }

            Box(
                // shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .padding(top = 90.dp, start = 250.dp)
                    .background(DarkerButtonBlue)
                    .blur(1.dp)

            ) {
                Column(
                    modifier = Modifier
                        .height(50.dp)
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Depression",
                        color = Color.White
                    )
                }
            }


            Box(
                // shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .padding(top = 190.dp, start = 30.dp)
                    .background(LightRed)
                    .blur(1.dp)
                    .clip(RoundedCornerShape(10.dp))


            ) {
                Column(
                    modifier = Modifier
                        .height(100.dp)
                        .width(350.dp)


                ) {


                    Text(
                        "Daily Thought",
                        color = Color.White, fontSize = 20.sp,
                        modifier = Modifier
                            .offset(17.dp, 17.dp)


                    )
                }
                Row {
                    Text(
                        "Meditation",
                        color = Color.White, fontSize = 15.sp,
                        modifier = Modifier
                            .offset(17.dp, 50.dp)


                    )


                    Text(
                        ".3-10 min",
                        color = Color.White, fontSize = 15.sp,
                        modifier = Modifier
                            .offset(20.dp, 50.dp)


                    )

                }

            }


            Text(
                "Featured",
                color = Color.White, fontSize = 35.sp,
                modifier = Modifier
                    .offset(30.dp, 310.dp)
                    .blur(0.6.dp)

            )












            Box(
                // shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .padding(top = 370.dp, start = 30.dp)
                    .background(AquaBlue)
                    .blur(1.dp)
                    .clip(RoundedCornerShape(10.dp))


            ) {
                Column(
                    modifier = Modifier
                        .height(190.dp)
                        .width(200.dp)


                ) {

                    Text(
                        "Sleep",
                        color = Color.White, fontSize = 27.sp,
                        modifier = Modifier
                            .offset(17.dp, 17.dp)


                    )

                    Text(
                        "Meditation",
                        color = Color.White, fontSize = 27.sp,
                        modifier = Modifier
                            .offset(17.dp, 27.dp)


                    )
                }


            }



            Box(
                // shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .padding(top = 370.dp, start = 240.dp)
                    .background(LightGreen1)
                    .blur(1.dp)
                    .clip(RoundedCornerShape(10.dp))


            ) {

                Column(
                    modifier = Modifier
                        .height(190.dp)
                        .width(200.dp)


                ) {

                    Text(
                        "Tips For",
                        color = Color.White, fontSize = 27.sp,
                        modifier = Modifier
                            .offset(17.dp, 17.dp)


                    )

                    Text(
                        "Sleeping",
                        color = Color.White, fontSize = 27.sp,
                        modifier = Modifier
                            .offset(17.dp, 27.dp)


                    )
                }
            }


            Box(
                // shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .padding(top = 570.dp, start = 240.dp)
                    .background(Beige3
                    )
                    .blur(1.dp)
                    .clip(RoundedCornerShape(10.dp))


            ) {

                Column(
                    modifier = Modifier
                        .height(190.dp)
                        .width(200.dp)


                ) {

                    Text(
                        "Calming",
                        color = Color.White, fontSize = 27.sp,
                        modifier = Modifier
                            .offset(17.dp, 17.dp)


                    )

                    Text(
                        "Sounds",
                        color = Color.White, fontSize = 27.sp,
                        modifier = Modifier
                            .offset(17.dp, 27.dp)


                    )
                }
            }
            Box(
                // shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .padding(top = 570.dp, start = 30.dp)
                    .background( OrangeYellow1)
                    .blur(1.dp)
                    .clip(RoundedCornerShape(10.dp))


            ) {
                Column(
                    modifier = Modifier
                        .height(190.dp)
                        .width(200.dp)


                ) {

                    Text(
                        "Night",
                        color = Color.White, fontSize = 27.sp,
                        modifier = Modifier
                            .offset(17.dp, 17.dp)


                    )

                    Text(
                        "Island",
                        color = Color.White, fontSize = 27.sp,
                        modifier = Modifier
                            .offset(17.dp, 27.dp)


                    )
                }


            }


            }

    }

    @Composable
    fun Greeting(name: String) {
        Text(
            "Good Morning, $name",

            color = Color.White,
            fontSize = 20.sp


        )
    }
}
