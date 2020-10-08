import kotlinx.coroutines.*

fun main(args: Array<String>) {
    GlobalScope.launch { // launch a new coroutine in background and continue
        delay(3330L) // non-blocking delay for 1 second (default time unit is ms)
        println("'launch'after 3,33 second") // print after delay
    }
    println("Main starting...") // main thread continues while coroutine is delayed
    Thread.sleep(2000L) // block main thread for 2 seconds to keep JVM alive
    println("Main running (2 seconds later...") // main thread continues while coroutine is delayed
    Thread.sleep(2000L) // block main thread for 2 seconds to keep JVM alive
    println("how to ask lauch'ed if its finished?") // main thread continues while coroutine is delayed

}