package com.divya.converter;

public class ParseResult{
    public int fromBase ;
    public String number ;
    public int toBase ;

    public ParseResult(String[] args) {
       this.fromBase = Integer.parseInt(args[1]);
       this.number = args[2];
    }
}
