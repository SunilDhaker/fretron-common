package com.fretron.Utils

import com.fretron.Logger.Log
import java.util.*

class  ClientCacheManager<T>  constructor(private val flushIntervalMinute : Int) {

    private val cache = HashMap<String, Data<T>>()

    init {
        val timer = Timer()
        timer.schedule(Task(),0, flushIntervalMinute * 60 * 1000L)
        Log.info("start scheduler..")
    }


    fun get(key: String): T? {
        if (cache.containsKey(key)) {
            val valueObj = cache[key]!!
            return valueObj.value
        }
        return null
    }

    fun save(key: String, value: T, expireValue: Long) {
        cache[key] = Data(System.currentTimeMillis(), expireValue, value)
    }


    inner class Task : TimerTask() {
        override fun run() {
            try {
                val currentTime = System.currentTimeMillis()
                Log.info("process for remove all key expire at ${Date(currentTime)}")
                var totalCount = 0
                val it = cache.iterator()
                while (it.hasNext()) {
                    val entry = it.next()
                    val valueObj = entry.value
                    val insertedAt = valueObj.insertedAt
                    val expireAfter = valueObj.expireTime
                    val expireAt = insertedAt + expireAfter
                    if (expireAt < currentTime) {
                        it.remove()
                        totalCount++

                    }
                }
                Log.info("total expired records : $totalCount")
            } catch (e: Exception) {
                Log.error("Vehicle Timer Task in Exception : ${e.localizedMessage}")
                Log.error(Log.exceptionStack(e))
            }

        }
    }


    companion object {
        const val INSERTED_AT = "insertedAt"
        const val EXPIRE_AFTER = "expireAfter"
    }


    class Data<T>(val insertedAt :Long ,val expireTime :Long ,val value: T){}


}