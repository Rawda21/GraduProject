
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun LoginScreen(){
    var userName by remember { mutableStateOf(TextFieldValue(""))}
    var email by remember { mutableStateOf(TextFieldValue(""))}
    var passWord by remember { mutableStateOf(TextFieldValue(""))}
    var checkBox by remember {mutableStateOf(false)}
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
               Text(text = "Login to Bookline",
                    style = TextStyle(fontSize = 40.sp,
                                      fontFamily = FontFamily.Cursive),
                    color = Color.White
               )

               Spacer(modifier = Modifier.height(20.dp))
               TextField(label = {Text(text = "Enter your userName")},
                         value = userName,
                         onValueChange = {newText ->
                             userName = newText
               }, keyboardOptions = KeyboardOptions.Default.copy(
                       keyboardType = KeyboardType.Text),
                         singleLine = true
                         )
               Spacer(modifier = Modifier.height(10.dp))
               TextField(label = {Text(text = "Enter your password")},
                         value = email,
                         onValueChange = {newText ->
                             email = newText
                         },
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
               Row {
                   Checkbox(checked = checkBox,
                            onCheckedChange = {
                                checkBox = it
                            },
                            colors = CheckboxDefaults.colors(
                                    uncheckedColor = Color.White,
                                    checkedColor = Color.Yellow,
                                    checkmarkColor = Color.Magenta),
                            modifier = Modifier
                                .size(30.dp)
                                .clip(CircleShape),
                            )
                   Text(text = "Agree to term and condition",
                        fontSize = 20.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                   )
               }
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
                       Text(text = " Login " , fontSize = 25.sp)
               }
           }
           ClickableText(text = AnnotatedString("Sign up here"),
                         modifier = Modifier.align(Alignment.BottomCenter).
                                 padding(20.dp)
                         , onClick = {}
                         , style = TextStyle(
                                 color = Color.White,
                                 fontSize = 30.sp ,
                                 fontFamily = FontFamily.Cursive
                         )
                         )
       }
    }