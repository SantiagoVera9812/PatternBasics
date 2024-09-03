package com.example.patternsbasics.eventBus

sealed class SportEvent {

    data class ResultSuccess(val sportKey: Int,
                             val sportName: String,
                             val result: List<String>?,
                             val isWarning: Boolean = false): SportEvent()

    data class ResultError(val code: Int, val msg: String): SportEvent()

    data object AdEvent : SportEvent()
}