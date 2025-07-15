class Solution {
    public int strStr(String haystack, String needle) {
        haystack=haystack.toLowerCase();
        needle=needle.toLowerCase();
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
