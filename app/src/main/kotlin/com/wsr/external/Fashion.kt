package com.wsr.external

object Fashion : Human {
    override fun response(topic: Topic): String = when (topic) {
        Topic.Hobby -> "水泳"
    }
}
