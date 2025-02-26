package com.learn.copick

interface CoPick {

    fun getCurrentTimeMillis(): Long

    companion object {
        private val _instance = CoPickImpl()

        val instance: CoPick
            get() = _instance

    }
}
