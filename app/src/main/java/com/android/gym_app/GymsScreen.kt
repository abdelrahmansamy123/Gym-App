package com.android.gym_app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.gym_app.ui.theme.Gym_AppTheme

@Composable
fun GymsScreen() {
    LazyColumn() {
        items(listOfGyms) {
            GymItem(it)
        }
    }
}

@Composable
fun GymItem(gym: Gym) {
    Card(elevation = 8.dp, modifier = Modifier.padding(8.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)) {
            GymIcon(Icons.Filled.Place, Modifier.weight(0.15f))
            GymDetails(gym, Modifier.weight(0.85f))
        }

    }
}

@Composable
fun GymDetails(gym: Gym, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = gym.name,
            style = MaterialTheme.typography.h6,
            color = Color.Blue
        )
        CompositionLocalProvider(
            LocalContentAlpha provides ContentAlpha.medium
        ) {
            Text(
                gym.place,
                style = MaterialTheme.typography.body2
            )
        }
    }
}

@Composable
fun GymIcon(vector: ImageVector, modifier: Modifier) {
    Image(
        imageVector = vector,
        contentDescription = "Gym Icon",
        modifier = modifier,
        colorFilter = ColorFilter.tint(Color.DarkGray)
    )

}


@Preview(showBackground = true)
@Composable
fun _GymScreenPreview() {
    Gym_AppTheme {
        GymsScreen()
    }
}