class Solution {

// fun isValid(s: String): Boolean {

//     val stack = ArrayDeque<Char>()

//     for (i in s){
//         when(i){
//             '(','{','[' -> stack.addLast(i)

//             else -> {
//             val x:Char =  when(i){
//                     ')'->'('
//                     '}'->'{'
//                     ']'->'['

//                 else -> throw RuntimeException("Unknown char $i")
//             }
//                 if (x != stack.removeLast()) return false
//             }
//         }

//     }

//     return stack.isEmpty()
// }
    
    
fun isValid(s: String): Boolean {
    val stack = ArrayDeque<Char>()

    s.forEach {

        when (it) {
            '(', '[', '{' -> {
                stack.addLast(it)

            }
            else -> {

                val end: Char = when (it) {
                    '}' -> '{'
                    ']' -> '['
                    ')' -> '('
                    else -> throw RuntimeException("Unknown char $it")
                }


                if (stack.isEmpty()) return false
                if (end != stack.removeLast()) return false
            }
        }
    }

    return stack.isEmpty()
}
}