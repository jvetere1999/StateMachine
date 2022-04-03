import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Absolute.SpaceEvenly
import androidx.compose.material.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp

@Composable
fun GridCol(row: BooleanArray){
    Row (horizontalArrangement = SpaceEvenly){
        var x: Int = 0
        for (col in row) {
            if (col) {
                Box (
                    modifier = Modifier
                        .size(10.dp)
                        .clip(RectangleShape)
                        .background(Color.Black))
            }
            else {
                Box(
                    modifier = Modifier
                        .size(10.dp)
                        .clip(RectangleShape)
                        .background(Color.White)
                        .border(1.dp, Color.Black, RectangleShape)
                )
            }
            x++
        }
    }
}