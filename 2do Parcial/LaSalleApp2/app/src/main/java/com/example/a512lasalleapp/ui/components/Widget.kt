package com.example.a512lasalleapp.ui.commponents

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a512lasalleapp.models.Student
import com.example.a512lasalleapp.ui.theme.GrayLight
import com.example.a512lasalleapp.ui.theme.LaSalleAppTheme
import org.w3c.dom.Text

@Composable
fun Widget(icon: ImageVector, text: String, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .size(90.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(GrayLight)
            .clickable {
                onClick()  
            },
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            androidx.compose.material3.Icon(
                imageVector = icon,
                contentDescription = text,
                modifier = Modifier.size(40.dp),
                tint = MaterialTheme.colorScheme.primary
            )
            Text(
                text = text,
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.bodySmall,
                fontWeight = MaterialTheme.typography.bodySmall.fontWeight
            )
        }
    }
}

@Preview
@Composable
fun WidgetPreview() {
    LaSalleAppTheme {
        Widget(icon = Icons.Default.Home, text = "Inicio", onClick = {})
    }
}
