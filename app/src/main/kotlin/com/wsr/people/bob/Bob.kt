package com.wsr.people.bob

import com.wsr.external.Human
import com.wsr.external.Topic

object Bob : Human {
    val values: MutableMap<Topic, String> = mutableMapOf(
        Topic.Hobby to "登山",
    )

    override fun response(topic: Topic): String = values.getOrPut(topic) { "分からない" }

    fun input(human: Human) {
        values
            .forEach { (topic, myValues) ->
                val externalValues = human.response(topic)
                val newValues = compare(myValues, externalValues)
                values[topic] = newValues
            }
    }

    private fun compare(current: String, new: String): String = listOf(current, new).random()
}
