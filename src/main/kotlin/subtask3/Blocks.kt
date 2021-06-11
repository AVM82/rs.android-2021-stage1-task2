package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {

        val arr = blockA.filter { it!!::class == blockB }.toList()

        return when (blockB) {
            String::class -> arr.joinToString("")
            Int::class -> arr.map { it as Int }.sumBy { it }
            LocalDate::class -> arr.map { it as LocalDate }.sorted().last()
                .format(DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale("ru")))
            else -> throw NotImplementedError("Not implemented")
        }
    }
}
