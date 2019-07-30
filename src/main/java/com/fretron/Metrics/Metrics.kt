package com.fretron.Metrics


import io.prometheus.client.Counter
import io.prometheus.client.Gauge
import io.prometheus.client.Summary



class Metrics {
    companion object {
        fun registerSummary(name: String, description: String): Summary {
            return Summary.build()
                .name(name).help(description).register()
        }

        fun registerCounter(name: String, description: String): Counter {
            return Counter.build()
                .name(name).help(description).register()
        }


        fun registerGauge(name: String, description: String): Gauge {
            return Gauge.build()
                .name(name).help(description).register()
        }


    }

}