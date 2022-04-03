package mathtest

import org.junit.jupiter.api.Test
import me.jvetere.naturalmath.math.*
import me.jvetere.naturalmath.math.Function
import me.jvetere.naturalmath.math.createFunction

internal class TestingRange {

    @Test
    internal fun toStringTesting() {
        val exp: String = "-2sin(x^2)+2x+1"
        val func: Function = createFunction(exp)
        val grid: Grid = Grid(25, 25, func)
        println(grid)
    }
    /**
     * Proposed function test
     * 2x^2+2x+3
     * -2sin(x^2)+2x+1
     */



    /**
     * Term toStringTesting block
     * val exp: String = "x^2"
     * val term: Term = createTerm(exp)
     * val firstOrder: Term? = term.derive()
     * println(term)
     * println(term.calculate(3.0))
     * println(firstOrder)
     * println(firstOrder!!.calculate(3.0))
     */

}