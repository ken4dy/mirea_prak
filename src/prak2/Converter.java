package prak2;
// 2.8
public class Converter {
    public static void main(String[] args)
    {
        String[] text = {"h","e","l","l","o", " ", "w","o","r","l","d"};
        System.out.println("Было: " + ToString(text));
        Convert(text);
        System.out.println("Стало: " + ToString(text));
    }

    private static void Convert(String[] text)
    {
        String temp = "";
        int sortedStrings = 0;
        for (int counter = 0; counter < text.length/2; counter++) {
            temp = text[text.length - 1 - sortedStrings];
            text[text.length - 1 - sortedStrings] = text[counter];
            text[counter] = temp;

            sortedStrings++;
        }
    }

    private static String ToString(String[] text)
    {
        StringBuffer stringBuffer = new StringBuffer();

        for (String str: text)
        {
            stringBuffer.append(str + " ");
        }

        return stringBuffer.toString();
    }
}