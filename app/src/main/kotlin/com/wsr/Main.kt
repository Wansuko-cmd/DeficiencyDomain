package com.wsr

import com.wsr.external.Topic
import com.wsr.people.bob.Bob
import com.wsr.people.tom.Tom

fun main() {
    val tom = Tom()
    val bob = Bob()

    (0..100).forEach { age ->
        println("${age}歳")
        println("tom: ${tom.response(Topic.Hobby)}")
        println("bob: ${bob.response(Topic.Hobby)}")
        println()
    }
}
