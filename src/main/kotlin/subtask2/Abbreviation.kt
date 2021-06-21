package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        val string = StringBuilder()
        var ai = 0
        var bi = 0
        while (ai < a.length && bi < b.length) {
            if (a[ai].toUpperCase() == b[bi]) {
                string.append(a[ai].toUpperCase())
                bi++
            }
            ai++
        }
        return if (string.toString() == b) "YES" else "NO"
    }
}
