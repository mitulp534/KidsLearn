package com.example.hp.com.kidslearn;

public class abcd_main {
    private String DefaultAlphabet;//a
    private String NamedAlphabet;//apple

    public abcd_main(String defaultAlphabet,String namedAlphabet){
        DefaultAlphabet=defaultAlphabet;
        NamedAlphabet=namedAlphabet;

    }

    public String getDefaultAlphabet(){
        return DefaultAlphabet;
    }
    public String getNamedAlphabet(){
        return NamedAlphabet;
    }
}
