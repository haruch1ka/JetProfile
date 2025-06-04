package com.example.jetprofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetprofile.components.Label
import com.example.jetprofile.ui.theme.JetProfileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetProfileTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(20.dp),

                        ) {
                        Image(
                            painter = painterResource(id = R.drawable.icon),
                            contentDescription = "プロフィール",
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(10.dp))

                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        Text(
                            text = "伊藤　大樹",
                            color = Color.Gray,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.ExtraBold

                        );
                        Spacer(modifier = Modifier.height(20.dp))

                        //職業
                        Text(
                            text = "職業: エンジニア",
                            color = Color.Gray,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.ExtraBold

                        );
                        Spacer(modifier = Modifier.height(20.dp))
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
                        Spacer(modifier = Modifier.height(20.dp))

                        //詳細表示ボタン
                        Button(
                            onClick = { /* 詳細表示の処理 */ },
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF85F6A)),
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = "詳細を表示",
                                color = Color.White,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )

                        }
                        Spacer(modifier = Modifier.height(20.dp))

                        // 趣味 & 居住地
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color.LightGray.copy(alpha = 0.2f))
                                .padding(horizontal = 10.dp, vertical = 20.dp),
                        ) {
                            Label(
                                icon = Icons.Default.Favorite,
                                text = "趣味：バイク、キャンプ、個人開発",
                                color = Color.Gray
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Label(
                                icon = Icons.Default.LocationOn,
                                text = "居住地：愛知県 名古屋市",
                                color = Color.Gray
                            )

                        }
                    }

                }
            }
        }
    }
}

