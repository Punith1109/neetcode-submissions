
class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        s = s.toLowerCase();

        while (j > i) {
            char left = s.charAt(i);
            char right = s.charAt(j);

            if ((left > 'z' || left < 'a') &&
                (left < '0' || left > '9')) {
                i++;
                continue;
            }

            if ((right > 'z' || right < 'a') &&
                (right < '0' || right > '9')) {
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
