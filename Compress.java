public static String compress(String original) {
    if (original.isEmpty()) return "";
    StringBuilder compressed = new StringBuilder();
    char lastlet = original.charAt(0);
    int count = 1;
    for (int i = 1; i < original.length(); i++) {
        if (lastlet == original.charAt(i)) {
            count = count + 1;
        } else {
            compressed.append(count);
            compressed.append(lastlet);
            lastlet = original.charAt(i);
            count = 1;
        }
    }
    compressed.append(count);
    compressed.append(lastlet);
    return compressed.toString();
}
