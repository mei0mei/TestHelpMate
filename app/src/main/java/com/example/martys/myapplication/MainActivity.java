package com.example.martys.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String[] hydraulik = {"- naprawa wycieków", "-wymiana armatury"};
    String[] elektryka = {"- instalacja elektryczna", "- naprawa awaryjna"};
    String[] prace_domowe = {"- sprzątanie", "- prasowanie","- mycie okien", "- opieka nad dziecmi","- wyprowadzanie zwierząt"};
    String[] ogrodnictwo = {"- pielegnacja ogrodu", "- koszenie trawy", "- prace porządkowe"};
    String[] remonty = {"- malowanie", "- tapetowanie", "- kładzenie paneli podłogowych", "-kładzenie kafelek"};
    String[] urzadzenia_elektryczne = {"- naprawa drobnego RTV/AGD", "- naprawa RTV/AGD", "- naprawa komputerów/laptopów"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
