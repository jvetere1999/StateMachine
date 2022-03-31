package me.jvetere.naturalmath.math.flags

enum class StringForm(val form:String) {
    TERM("{[-]|[0-9]+|[flag]|[a-z][^][0-9]+"),
    FUNCTION("{}+{}+{}+{}+...")
}
