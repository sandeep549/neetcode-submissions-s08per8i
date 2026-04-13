class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val res = HashMap<List<Int>, MutableList<String>>()

        for(s in strs) {
            val count = MutableList(26) { 0 }
            for(c in s) {
                count[c - 'a']++
            }
            res.getOrPut(count) { mutableListOf() }.add(s)
        }

        return res.values.toList()
    }
}
