package com.divya.converter;

public class ParseResult{
    public int fromBase ;
    public String number ;

    public ParseResult(String[] args) {
        if(args.length == 1){
            this.fromBase = 8;
            this.number = args[0];
        }
        else {

            this.fromBase = Integer.parseInt(args[1]);
            this.number = args[2];
        }

    }
}
