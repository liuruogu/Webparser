/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pageparser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author liu
 */
public class PageParser {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String html = 
                " <meta charset=\"utf-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "    <meta name=\"description\" content=\"\">\n" +
                "    <meta name=\"author\" content=\"\">"+
                "<html><head><title>First parse</title></head>"+
                 "<body><p>Parsed HTML into a doc.</p></body></html>";
        Document doc = Jsoup.parse(html);
        System.out.println(doc);
    }
}