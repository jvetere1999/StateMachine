import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Grid(rows: List<Int>, cols: List<Int>) {
    LazyColumn {
        itemsIndexed(rows) { index, row ->
            LazyRow {
                itemsIndexed(cols) { index, column ->
                    Text(
                        modifier = Modifier
                            .padding(8.dp)
                            .background(Color.Red)
                            .width(100.dp)
                            .height(100.dp),
                        textAlign = TextAlign.Center,
                        color = Color.White,
                        text = "Row $row Column = $column"
                    )
                }
            }

        }
    }
}