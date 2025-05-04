package com.wsr.tom

import com.wsr.external.Fashion
import com.wsr.external.Human
import com.wsr.external.Topic

class Tom : Human {
    override fun response(topic: Topic): String = Fashion.response(topic)
}
