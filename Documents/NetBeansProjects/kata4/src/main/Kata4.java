package main;

import java.io.IOException;
import java.util.List;
import model.*;
import static view.MailHistogramBuilder.build;
import static view.MailListReader.read;


public class Kata4 {

    public static void main(String[] args) throws IOException {
        
        Kata4 histo = new Kata4();
        try{
            histo.execute();
        }catch (IOException e){
            System.out.println (e.toString());
        }
        
        
    }    
    
    private List<Mail> mailList;
    private Histogram<String> histogram = new Histogram<>();
    
    private void execute() throws IOException {
        input();
        process();
        output();
    }
    
    private void input() throws IOException {
        mailList = read("C:/Users/ferna/Documents/NetBeansProjects/Kata4/email.txt");
    }
    
    private void process() throws IOException {
        histogram = build(mailList);
    }
    
    private void output() throws IOException {
        HistogramDisplay histo = new HistogramDisplay("", histogram);
        histo.execute();
    }
}