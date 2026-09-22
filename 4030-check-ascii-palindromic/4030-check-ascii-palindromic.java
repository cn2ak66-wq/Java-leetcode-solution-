class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder str = new StringBuilder();

        for (char c : s.toCharArray()) {
            String x = Integer.toBinaryString(c);
            while (x.length() < 8) {
                x = "0" + x;
            }
            str.append(x);
        }

        String a = str.toString();
        String b = str.reverse().toString();

        return a.equals(b);
    }
}