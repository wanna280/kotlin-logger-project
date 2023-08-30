package com.wanna.logger.impl.layout.converter

import com.wanna.logger.impl.event.ILoggingEvent

class ThreadNameConverter : Converter<ILoggingEvent> {
    override fun convert(expression: String, event: ILoggingEvent): String {
        return event.getThreadName()
    }
}