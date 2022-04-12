package learnclass;

import java.io.*;

public class fileInputOutput {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader file;
        file = new FileReader("C:\\Users\\nahid\\Desktop\\input.txt");
        BufferedReader br = new BufferedReader(file);
        FileWriter fileW = new FileWriter("C:\\Users\\nahid\\Desktop\\output.txt");
        BufferedWriter bw = new BufferedWriter(fileW);
        try {
            String s;

            while ((s = br.readLine()) != null) {
                String[] arr = s.split(" ");
                int fNumber = Integer.parseInt(arr[0]);
                int sNumber = Integer.parseInt(arr[1]);
                if ("+".equals(arr[2])) {
                    int ans = fNumber + sNumber;
                    bw.write(ans + "\n");
                } else if ("-".equals(arr[2])) {
                    int ans = fNumber - sNumber;
                    bw.write(ans + "\n");
                } else if ("*".equals(arr[2])) {
                    int ans = fNumber * sNumber;
                    bw.write(ans + "\n");
                } else {
                    try {
                        double ans = (double)fNumber / sNumber;
                        bw.write(ans + "\n");
                    } catch (ArithmeticException e) {
                        System.out.println(e);
                    }
                }

            }

        } catch (IOException es) {
            System.out.println(es);
        } finally {
            br.close();
            file.close();
            bw.close();
            fileW.close();
        }
    }
}

