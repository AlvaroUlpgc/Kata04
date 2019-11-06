package Kata04_control;

import Kata04_Model.Histogram;
import Kata04_Model.Mail;
import Kata04_Vista.HistogramDisplay;
import Kata04_Vista.MailHistogramBuilder;
import Kata04_Vista.MailListReader;
import java.util.List;

public class Kata04 {

    public static void main(String[] args) {
        String fileName = new String("email.txt");
        /*  */List<Mail> mailList = MailListReader.read(fileName);
        /*  */Histogram histogram = MailHistogramBuilder.build(mailList);
        
        
        
        /*Histogram<String> histogram = new Histogram<String>();
        histogram.increment("ulpgc.es");
        histogram.increment("google.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("dis.ulpgc.es");*/
        
        /*  */HistogramDisplay histogramdisplay = new HistogramDisplay(histogram);
        /*  */histogramdisplay.execute();
    }
}
