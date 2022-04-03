package mathtest

import me.jvetere.naturalmath.math.Function
import me.jvetere.naturalmath.math.createFunction
import org.junit.jupiter.api.Test

internal class FunctionTest {
    @Test
    internal fun basic() {
        val exp: String = "-2sin(x^2)+2x+1"
        val func: Function = createFunction(exp)

    }
}