//package com.example.chatbot.components
//
//import android.text.Layout.Alignment
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.rounded.Send
//import androidx.compose.material3.Icon
//import androidx.compose.material3.IconButton
//import androidx.compose.material3.OutlinedTextField
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.unit.dp
//import androidx.compose.material3.Text
//import androidx.compose.ui.draw.clip
//
//
//@Composable
//fun ChatFooter(
//    onClick: (text: String) -> Unit
//) {
//    var inputText by remember {
//        mutableStateOf(value = "")
//    }
//
//    Row {
//        var verticalAlignment = Alignment.ALIGN_CENTER
//        var horizontalArrangement = Arrangement.Center
//        var modifier = Modifier
//            .fillMaxWidth()
//            .background(Color.LightGray)
//            .padding(10.dp)
//    };
//    @Composable {
//        OutlinedTextField(
//            value = inputText,
//            onValueChange = { inputText = it },
//            placeholder = { Text(text = "Enter Your Question") },
//            singleLine = true,
//            modifier = Modifier
//                .fillMaxWidth()
//                .background(Color.Gray)
//        )
//
//        IconButton(onClick = {  }) {
//            Icon(
//                Icons.Rounded.Send, contentDescription = null,
//                modifier = Modifier.size(40.dp).clip(CircleShape).background(Color.Black).padding(8.dp), tint = Color.White
//            )
//        }
//
//
//    }
//}
//

package com.example.chatbot.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.draw.clip
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment


@Composable
fun ChatFooter(
    onClick: (text: String) -> Unit
) {
    var inputText by remember { mutableStateOf(TextFieldValue()) }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
            .padding(10.dp),

    ) {
        OutlinedTextField(
            value = inputText,
            onValueChange = { inputText = it },
            placeholder = { Text(text = "Enter Your Question") },
            singleLine = true,
            modifier = Modifier.weight(1f) // Occupy available space
        )

        IconButton(
            onClick = {
                onClick(inputText.text)
                inputText = TextFieldValue("")
            },
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Color.Black)
                .padding(8.dp)
        ) {
            Icon(
                Icons.Rounded.Send,
                contentDescription = null,
//                modifier = Modifier.size(40.dp).clip(CircleShape).background(Color.Black).padding(8.dp),
                tint = Color.White
            )
        }
    }
}

@Preview
@Composable
fun PreviewChatFooter() {
    ChatFooter(onClick = {})
}

