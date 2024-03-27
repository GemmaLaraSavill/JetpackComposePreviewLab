package com.gemma.previewsexample.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.gemma.previewsexample.R
import com.gemma.previewsexample.ui.theme.PreviewsExampleTheme
import androidx.compose.ui.res.painterResource as painterResource1

@Composable
fun CustomCard(
    title: String,
    subtitle: String,
    @DrawableRes image: Int
) {
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.padding(16.dp)
    ) {
        Column {
            Image(
                painter = painterResource1(id = image),
                contentDescription = null,
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .height(380.dp)
                    .fillMaxWidth()
            )
            Spacer(Modifier.height(16.dp))
            Text(
                text = title,
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(start = 8.dp, end = 8.dp)
            )
            Text(
                text = subtitle,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 8.dp, end = 8.dp, bottom = 8.dp)
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun CustomCardPreview() {
    PreviewsExampleTheme {
        CustomCard(title = "Title", subtitle = "A subtitle", image = R.drawable.skidroid)
    }
}
