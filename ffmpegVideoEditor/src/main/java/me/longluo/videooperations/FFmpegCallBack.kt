package me.longluo.videooperations

interface FFmpegCallBack {
    fun process(logMessage: LogMessage) {}
    fun statisticsProcess(statistics: Statistics) {}
    fun success() {}
    fun cancel() {}
    fun failed() {}
}