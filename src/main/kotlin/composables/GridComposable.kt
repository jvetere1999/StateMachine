import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.SpaceEvenly
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun GridElement(rows: Array<BooleanArray>) {
    Box(Modifier.fillMaxSize()) {
        Column(Modifier.size(500.dp)
            .align(Alignment.Center)) {
            for (row in rows) {
                GridCol(row)
            }
        }
    }
}