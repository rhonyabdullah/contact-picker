package com.learn.copick

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

internal class CoPickImpl : CoPick {

    override fun getCurrentTimeMillis(): Long {
        return System.currentTimeMillis()
    }

    override fun convertMillisToDateTime(millis: Long): String {
        return SimpleDateFormat("(EEEE) dd/MM/yyyy HH:mm:ss", Locale.getDefault()).format(Date(millis))
    }
}
