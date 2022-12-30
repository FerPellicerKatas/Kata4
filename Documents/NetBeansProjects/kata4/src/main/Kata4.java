package main;

import java.io.IOException;
import java.util.List;
import view.*;
import model.*;
import static view.MailHistogramBuilder.build;
import static view.MailListReader.read;


public class Kata4 {

    public static void main(String[] args) throws IOException {
        Histogram<String> histogram = new Histogram<>();
        String fileName = "C:/Users/ferna/Documents/NetBeansProjects/Kata4/email.txt";
        List<Mail> mailList = read(fileName);
        histogram = build(mailList);
        
        HistogramDisplay histo = new HistogramDisplay("", histogram);
        histo.execute();
        
    }    
}
