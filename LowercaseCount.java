//Count how many times lowercase vowels occurred in a String by reading a .txt file.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LowercaseCount {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Coditas-Admin\\IdeaProjects\\Assignment1\\src\\doc.txt"));
            String line;
            int count = 0;
            while((line = reader.readLine()) != null) {
                for(int i=0; i<line.length(); i++) {
                    if(Character.isLowerCase(line.charAt(i))) {
                        count++;
                    }
                }
            }
            System.out.println("Count of lowercase letters : " + count);
            reader.close();
        } catch (IOException e){
            System.out.println("Error reading file : " + e.getMessage());
        }

    }
}
