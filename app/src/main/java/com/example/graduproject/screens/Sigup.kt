package com.example.graduproject.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun SignupScreen(){
    var userSignp by remember { mutableStateOf(TextFieldValue(""))}
    var passWord by remember { mutableStateOf(TextFieldValue(""))}
    Box (
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Blue)
    ){
        Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp)
                    .background(color = Color.Blue)
        )
        {
            Text(text = "Sign up to Bookline",
                 style = TextStyle(fontSize = 40.sp,
                                   fontFamily = FontFamily.Cursive),
                 color = Color.White
            )

            Spacer(modifier = Modifier.height(20.dp))
            TextField(label = {Text(text = "Enter your userName")},
                      value = userSignp,
                      onValueChange = {newText ->
                          userSignp = newText
                      }, keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Text),
                      singleLine = true
            )
            Spacer(modifier = Modifier.height(10.dp))
            TextField(label = {Text(text = "Enter your Email")},
                      value = passWord,
                      onValueChange = {newText ->
                          passWord = newText
                      },
                      singleLine = true
            )
            Spacer(modifier = Modifier.height(10.dp))
            Button(
                    onClick = { /*TODO*/},
                    shape = RoundedCornerShape(50.dp),
                    modifier = Modifier
                        .width(150.dp)
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(
                            containerColor = Color.LightGray
                            ,contentColor = Color.Blue
                    )
            ) {
                Text(text = " sign up " , fontSize = 25.sp)
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row {
                Text(text = "Do not have acount?",
                     modifier = Modifier.padding(20.dp),
                     style = TextStyle(
                        color = Color.White,
                        fontSize = 15.sp
                )
                )
                ClickableText(text = AnnotatedString("create one "),
                        modifier = Modifier.padding(10.dp)
                              , onClick = {}
                              , style = TextStyle(
                        color = Color.White,
                        fontSize = 25.sp ,
                        fontWeight = FontWeight.Bold
                )
                )
            }
        }
    }
}
