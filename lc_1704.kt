import java.util.*
class Solution {
 
    fun halvesAreAlike(s: String): Boolean {

        val v = charArrayOf('a','e','i','o','u')
        val str = s.toLowerCase()
        var a = 0
        var b = 0

        for (i in s.indices){
            if (i<s.length/2){
                if (v.contains(str[i])){
                    a+=1
                }
                continue
            }else {
                if (v.contains(str[i])){
                    b+=1
                }
            }
        }

        return a==b
    }
}