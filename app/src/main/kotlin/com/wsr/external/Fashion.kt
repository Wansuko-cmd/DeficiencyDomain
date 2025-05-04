package com.wsr.external

object Fashion : Human {
    val values: MutableMap<Topic, String> = mutableMapOf(
        Topic.Hobby to "水泳",
    )

    override fun response(topic: Topic): String = values[topic]!!

    fun update(age: Int) {
        if (age % 8 == 0) values[Topic.Hobby] = Topic.Hobby.choices.random()
    }
}
