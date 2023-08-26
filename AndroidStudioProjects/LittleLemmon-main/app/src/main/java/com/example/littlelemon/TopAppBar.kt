package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.IconButton
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.ui.theme.LittleLemonTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable

fun TopAppBar(scaffoldState: ScaffoldState? = null, scope: CoroutineScope? = null){
    Row(
        modifier = Modifier.padding(vertical = 2.dp)
    ) {
        IconButton(onClick = {
            scope?.launch { scaffoldState?.drawerState?.open() }
        }) {
            Image(
                modifier = Modifier.size(30.dp),
                painter = painterResource(id = R.drawable.hamburger),
                contentDescription = "Menu icon"
            )
        }

        Spacer(modifier = Modifier.padding(horizontal = 26.dp))
        Box(){
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center){
                Image(
                    modifier = Modifier.width(30.dp),
                    painter = painterResource(id = R.drawable.lemonlogon_nobg),
                    contentDescription = "Lemon logo"
                )

                Box(modifier = Modifier.padding(vertical = 10.dp, horizontal = 8.dp)){
                    Text(text = "Little Lemon", style = TextStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    ))

                }

                Box(modifier = Modifier.padding(vertical = 10.dp, horizontal = 8.dp)){
                    Row (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End){
                        Image(
                            modifier = Modifier.size(30.dp),
                            painter = painterResource(id = R.drawable.cart),
                            contentDescription = "Cart icon"
                        )
                    }

                }
            }
        }






    }
}
@Composable
@Preview
fun TopAppBarPreview() {
    LittleLemonTheme {
        TopAppBar()
    }
}
