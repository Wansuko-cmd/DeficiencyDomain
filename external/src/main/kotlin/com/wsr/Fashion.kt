package com.wsr

object Fashion : Human {
    override fun response(topic: Topic): String = when (topic) {
        Topic.Hobby -> "水泳"
    }
}
