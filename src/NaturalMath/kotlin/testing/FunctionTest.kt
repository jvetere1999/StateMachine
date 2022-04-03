package testing


import me.jvetere.naturalmath.math.ExpressionFunction
import me.jvetere.naturalmath.math.createFunction
import org.junit.jupiter.api.Test

internal class FunctionTest {
    @Test
    internal fun basic() {
        val exp: String = "-2sin(x^2)+2x+1"
        val func: ExpressionFunction = createFunction(exp)

    }
}