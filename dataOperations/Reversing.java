package dataOperations;

import java.io.*;

public class Reversing {
    private static int i = 0;

    public static String reverse(Object t){
        if(t == null) return null;
        String s = t.toString();
        char[] cArr = s.toCharArray();
        char cTemp;
        int j = s.length()-1;

        for(int i = 0; i < s.length() / 2; i++){
            cTemp = s.charAt(i);
            cArr[i] = s.charAt(j);
            cArr[j] = cTemp;
            j--;
        }

        return String.valueOf(cArr);
    }

    public static String reverseStringRecursively(String s){
        if(s.isEmpty()) return s;

        return reverseStringRecursively(s.substring(1)) + s.charAt(0);
    }

    public static String reverseStringWswaps(String s) {
        StringBuilder reversedString = new StringBuilder();


        for (int z = s.length() - 1; 0 <= z; z--) {

            System.out.println("z is at: " + z + "\nchar is :" + s.charAt(i));


            // WITH STRING CONCATENATION: '+='
            // M + I = MI -> 4 bytes
            // MI + H = MIH -> 6 bytes
            // ...
            // MIHSA + H = MIHSAH -> 12 bytes
            // the more characters, the more memory used

            // WITH STRINGBUILDER
            // i = 0 -> 1 byte
            // [] 16 -> 16 bytes
            // i = 1 -> 1 byte
            // [M] 16 -> 16 bytes
            // i = 2 -> 1 byte
            // [MI] 16 -> 16 bytes
            //...
            // i = 6 -> 1 byte
            // [MIHSAH] 16 -> 16 bytes
            reversedString.append(s.charAt(z));
        }
        return reversedString.toString();
    }

    public static void reverseEveryLine(File f){

        if(f == null) return;
        String line;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(f));
            BufferedWriter writer = new BufferedWriter(new FileWriter("reverseRecursively.txt"));

            while((line=reader.readLine()) != null){
                line = reverse(line);
                writer.write("\n"+line);
            }

            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void reverseFile(File from, File to)
    {
        try
        {
            FileReader rdr = new FileReader(from);
            FileWriter wtr = new FileWriter(to);
            to.delete();
            reverseWriteTo(rdr, wtr);
            wtr.close();
            rdr.close();
        }
        catch (IOException e)
        {
            throw new UncheckedIOException(e);
        }
    }

    private static void reverseWriteTo(Reader rdr, Writer wtr) throws IOException
    {
        int i = rdr.read();

        if(i == -1)
            return;
        char c = (char) i;

        reverseWriteTo(rdr, wtr);

        if(c != '\r')
            wtr.write(c);
    }
}
