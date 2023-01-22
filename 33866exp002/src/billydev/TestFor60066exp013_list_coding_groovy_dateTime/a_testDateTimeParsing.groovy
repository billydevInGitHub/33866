package billydev.TestFor60066exp013_list_coding_groovy_dateTime

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class a_testDateTimeParsing {
    static void main(String[] args) {
        String message="1900/01/01 06:02:02"
        LocalDateTime parsedDateTime = LocalDateTime.parse(message, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"))
        println(parsedDateTime)
    }
}
