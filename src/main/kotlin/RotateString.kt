import java.util.*

object ClassRotateString {
    private fun checkString(s1: String, s2: String, indexFound: Int, Size: Int): Boolean {
        for (i in 0 until Size) {
            if (s1[i]
                != s2[(indexFound + i) % Size]
            ) return false
        }
        return true
    }
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter a string: ")
        val s1 = sc.nextLine()
        val sc2 = Scanner(System.`in`)
        print("Enter a string: ")
        val s2 = sc2.nextLine()
        if (s1.length != s2.length) {
            println(
                "s2 is not a rotation on s1"
            )
        } else {
            val indexes = ArrayList<Int>()
            val Size = s1.length
            val firstChar = s1[0]
            for (i in 0 until Size) {
                if (s2[i] == firstChar) {
                    indexes.add(i)
                }
            }
            var isRotation = false
            for (idx in indexes) {
                isRotation = checkString(s1, s2, idx, Size)
                if (isRotation) break
            }
            if (isRotation) println(
                "true"
            ) else println(
                "false"
            )
        }
    }
}