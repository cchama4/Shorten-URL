package edu.uic.ids517.demo;
public class ShortenUrl {
    private String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public String encode(int num) {
        StringBuilder s = new StringBuilder();
        while ( num > 0 ) {
            s.append( characters.charAt( num % 62 ) );
            num /= 62;
        }
        return s.reverse().toString();   
    }

    public int decode(String coded) {
        int num = 0;
        for ( int i = 0; i < coded.length(); i++ )
            num = num * 62 + characters.indexOf(coded.charAt(i));
        return num;
    }   
}
