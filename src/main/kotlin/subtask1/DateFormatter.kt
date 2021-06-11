package subtask1

import java.text.SimpleDateFormat
import java.util.*


class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            val calendar = Calendar.getInstance(Locale("ru")).apply {
                isLenient = false
                set(year.toInt(), month.toInt() - 1, day.toInt())
            }
            val dateFormat = SimpleDateFormat("dd MMMM, EEEE")
            dateFormat.format(calendar.time)
        } catch (e: Exception) {
            "Такого дня не существует"
        }
    }
}
