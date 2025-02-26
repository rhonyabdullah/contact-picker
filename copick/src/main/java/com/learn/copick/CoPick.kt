package com.learn.copick

interface CoPick {

    fun getCurrentTimeMillis(): Long

    /**
     * @return date time in `(EEEE) dd/MM/yyyy HH:mm:ss`
     */
    fun convertMillisToDateTime(millis: Long): String

    companion object {
        private val _instance = CoPickImpl()

        val instance: CoPick
            get() = _instance

    }
}
