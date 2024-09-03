package com.example.patternsbasics.singleton

import com.example.patternsbasics.eventBus.EventBus

object Singleton {

    private val eventBustInstance: EventBus by lazy{

        EventBus()
    }

    fun eventBustInstance() = eventBustInstance
}