package com.gialen.jetpackdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Clip
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.VerticalScroller
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.*
import androidx.ui.material.*
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview

/**
 * 作者： njb
 * 时间： 2018/11/26  13:30
 * 描述： JetPack尝鲜
 * 来源：
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme() {
                NewsComposeText()
            }
        }
    }

    @Composable
    private fun NewsComposeText() {
        val image = +imageResource(R.mipmap.invitation_bg)

        VerticalScroller {
            Column{
                repeat(6) {
                    Container(expanded = true, height = 180.dp,modifier =Spacing(16.dp) ) {
                        Clip(shape = RoundedCornerShape(10.dp)) {
                            //显示图片
                            DrawImage(image)
                        }
                    }
                }
            }
        }

    }

    @Preview
    @Composable
    fun DefaultPreview() {
        MaterialTheme {
            NewsComposeText()
        }
    }

}
