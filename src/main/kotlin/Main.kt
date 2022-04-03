// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.Window
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import me.jvetere.naturalmath.math.Grid
import me.jvetere.naturalmath.math.createFunction


fun main() = Window {
    var text by remember { mutableStateOf("Hello, World!") }
    val temp: Array<BooleanArray> = Array(25) { BooleanArray(25) }
    val grid: Grid = Grid(25,25, createFunction("x^2"))
    GridElement(grid())
}