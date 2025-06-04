package com.example.jetprofile.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CompanySection() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.fillMaxWidth()

    ) {
        //会社名
        Text(
            text = "株式会社Sample",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(10.dp))
        //部署・グループ名
        Text(
            text = "開発部　モバイルグループ",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(20.dp))

        //Email
        Label(
            icon = Icons.Default.Email,
            text = "メールアドレス",
            color = Color.Gray
        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text = "example@ezweb.ne.jp",
            fontSize = 16.sp,
        )
        Spacer(modifier = Modifier.height(5.dp))
        Divider(
            modifier = Modifier.clip(RoundedCornerShape(1000.dp)),
            thickness = 2.dp
        )
    }
}