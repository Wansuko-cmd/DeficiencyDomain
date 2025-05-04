package com.wsr

import com.wsr.external.Fashion
import com.wsr.external.Topic
import com.wsr.people.bob.Bob
import com.wsr.people.tom.Tom

fun main() {
    (0..100).forEach { age ->
        Fashion.update(age)
        println("${age}歳")
        println("tom: ${Tom.response(Topic.Hobby)}")
        println("bob: ${Bob.response(Topic.Hobby)}")
        Bob.input(Fashion)
        println()
    }
}
