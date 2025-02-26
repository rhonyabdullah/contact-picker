package com.learn.copick

class CoPickImpl : CoPick {

    override fun getCurrentTimeMillis(): Long {
        return System.currentTimeMillis()
    }

}
