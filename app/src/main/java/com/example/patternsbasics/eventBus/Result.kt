package com.example.patternsbasics.eventBus

data class Result(val sportKey: Int, val sportName: String, val result: List<String>?, val isWarning: Boolean = false) {

}