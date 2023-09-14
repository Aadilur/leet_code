class Solution {
   

fun isPalindrome(x: Int): Boolean {
    val y = x.toString().reversed()
    return y.contentEquals(x.toString())
}

}