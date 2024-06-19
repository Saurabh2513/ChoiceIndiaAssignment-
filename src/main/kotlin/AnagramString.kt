import java.util.*


fun main(args: Array<String>) {
    val str1 = Scanner(System.`in`)
    println("enter string 1 :")
    val s1 = str1.next()
    val str2 = Scanner(System.`in`)
    println("enter string 2 :")
    val s2 = str2.next()
    println(isAnagram(s1, s2))
}

fun isAnagram(str1: String, str2: String): Boolean {
    val s1 = str1.length
    val s2 = str2.length
    return if (s1 != s2) {
        false
    } else {
        val count = IntArray(26)
        for (i in 0 until s1) {
            count[str1[i].code - 'a'.code]++
        }
        for (i in 0 until s2) {
            count[str2[i].code - 'a'.code]--
        }
        for (i in count.indices) {
            if (count[i] != 0) {
                return false
            }
        }
        true
    }
}




