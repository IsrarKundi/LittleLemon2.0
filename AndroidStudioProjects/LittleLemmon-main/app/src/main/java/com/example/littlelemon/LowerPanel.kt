package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LowerPanel() {
    Column {
        WeeklySpecial()
        MenuDish()
    }
}


@Composable
fun WeeklySpecial(){
    Card (modifier = Modifier.fillMaxWidth()){
        Text(text = "Weekly Special",
            Modifier.padding(8.dp),
            style = TextStyle(fontSize = 26.sp, fontWeight = FontWeight.Bold)
        )
    }
}


@Composable
fun MenuDish() {
    Card {
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)){
            Column(modifier = Modifier.padding(5.dp)) {
                Text(text = "Greek Salad",
                    style = TextStyle(fontSize = 18.sp,
                        fontWeight = FontWeight.Bold)
                )
                Text(text = "The famous Greek salad of crispy lettuce, peppers, olives, our Chicago ...",
                    style = TextStyle(fontSize = 18.sp,
                        color = Color.Gray
                    ),
                    modifier = Modifier.
                    fillMaxWidth(0.75f)
                )
                Text(text = "\$12.99",
                    style = TextStyle(fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray)
                )
            }

                Image(painter = painterResource(id = R.drawable.greeksalad),
                    contentDescription = "",
                    Modifier.width(100.dp).
                    padding(top = 20.dp).clip(RoundedCornerShape(2.dp)))
            }



    }
}

@Preview(showBackground = true)
@Composable
fun LowerPanelPreview(){
    LowerPanel()
}
