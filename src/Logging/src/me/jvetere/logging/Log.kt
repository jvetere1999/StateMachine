package me.jvetere.logging

import java.sql.Date
import java.sql.Timestamp
import java.time.Instant
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter

data class Log(val entry: String) {
    val timestamp: String = DateTimeFormatter
        .ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS")
        .format(Instant.now())
}
