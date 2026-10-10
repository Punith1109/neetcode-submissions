
class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        s = s.toLowerCase();

        while (j > i) {
            char left = s.charAt(i);
            char right = s.charAt(j);

            if ((left > 122 || left < 97) &&
                (left < 48 || left > 57)) {
                i++;
                continue;
            }

            if ((right > 122 || right < 97) &&
                (right < 48 || right > 57)) {
                j--;
                continue;
            }

            if (left == right) {
                i++;
                j--;
            } else {
                return false;
            }
        }

        return true;
    }
}
