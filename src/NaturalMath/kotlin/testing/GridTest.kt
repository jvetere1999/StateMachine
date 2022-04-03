package testing

import me.jvetere.naturalmath.math.ExpressionFunction
import me.jvetere.naturalmath.math.Grid
import me.jvetere.naturalmath.math.createFunction
import org.junit.jupiter.api.Test

internal class GridTest {

    @Test
    internal fun basic(){
        val func1: ExpressionFunction = createFunction("2x^2+sin(x^2)^2")
        var grid: Grid = Grid(25, 25, func1)
        println(grid)
    }
    @Test
    fun get() {

    }

    @Test
    fun set() {
    }
}