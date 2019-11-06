package Kata04_Vista;

import Kata04_Model.Mail;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailListReader {

    
    public static List<Mail> read(String fileName) {
        List<Mail> list = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            
           String line = reader.readLine();
            while(line != null){
                if(Mail.isMail(line)){
                    list.add(new Mail(line));
                }
                line = reader.readLine();
            }
            
        } catch (FileNotFoundException exception) {
            System.out.println("ERROR MailListReader::read (File Not Found)" + exception.getMessage());
            
        } catch(IOException exception){
            System.out.println("ERROR MailListReader::read (IO)" + exception.getMessage());
        }
        
        return list;
    }

    
    
}
