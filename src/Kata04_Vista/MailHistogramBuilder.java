package Kata04_Vista;

import Kata04_Model.Histogram;
import Kata04_Model.Mail;
import java.util.List;

public class MailHistogramBuilder {

    public static Histogram build(List<Mail> mailList) {
        Histogram<String> histogram = new Histogram();
        
        for(Mail mail: mailList){
            histogram.increment(mail.getDomain());
        }
        
        return histogram;
    }

    
    
}
