class Solution {
    public String makeLargestSpecial(String s) {
        int balance = 0;
        int start = 0;
        List<String> parts = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            balance += (s.charAt(i) == '1') ? 1 : -1;
            if (balance == 0) {
                String inner = makeLargestSpecial(s.substring(start + 1, i));
                parts.add("1" + inner + "0");
                start = i + 1;
            }
        }
        parts.sort(Collections.reverseOrder());
        return String.join("", parts);
    }
}