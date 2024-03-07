import java.io.*;

public class Main {
    public static void main(String[] args) {
        String s1 = "Smirnov Kostiantyn";
        String s2 = "New file. My name is";
        String m = "";

        String name = "name.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(name));
            String line = br.readLine();
            br.close();

            if (line != null) {
                String[] arr = line.split(" ",-2);
                m = arr[0]+" "+arr[1]+" "+arr[2]+" "+s1;

                BufferedWriter bw = new BufferedWriter(new FileWriter(name));
                bw.write(m);
                bw.close();
            }
        } catch (IOException e) {

            try {
                FileWriter fw = new FileWriter(name);
                fw.close();

                m = s2 + " " + s1;

                BufferedWriter bw = new BufferedWriter(new FileWriter(name));
                bw.write(m);
                bw.close();
            } catch (IOException ex) {
            }
        }
    }
}
