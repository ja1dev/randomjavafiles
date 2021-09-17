public class StringRec {

    public static String decompress(String compressedText) {
        char stringChars[] = compressedText.toCharArray();
        String result = "";

        for (int i = 0; i < stringChars.length; i++) {
            char countChar = stringChars[i];

            if(!Character.isDigit(countChar)) {
                result += countChar;
            } else if(i+1 < stringChars.length){
                i++;
                for (int count = 0; count < countChar - '0'; count++) {
                    result += stringChars[i];
                }
            }
        }

        return result;
    }

    public static void main(String args[]) {
        String before = "q9w5e2rt5y4qw2Er3T";
        String after = decompress(before);

        System.out.println(after);
    }
}
