package com.wsr.external

sealed interface Topic {
    data object Hobby : Topic {
        val choices = listOf("水泳", "登山", "読書", "映画")
    }
}
