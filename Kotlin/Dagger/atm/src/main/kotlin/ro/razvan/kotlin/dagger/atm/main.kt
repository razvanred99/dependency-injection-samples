package ro.razvan.kotlin.dagger.atm

import java.util.*

fun main() {
    Scanner(System.`in`).use { scanner ->
        val commandProcessor = CommandProcessorFactory.create().processor()

        while (scanner.hasNextLine()) {
            commandProcessor.process(scanner.nextLine())
        }
    }
}