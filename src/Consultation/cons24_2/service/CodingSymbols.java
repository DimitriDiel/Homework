package Consultation.cons24_2.service;

import Consultation.cons24_2.entity.InitialMorseTable;

import java.util.ArrayList;
import java.util.Objects;

public class CodingSymbols {

    public ArrayList<String> codingSymbol;

    public ArrayList<String> afterCoding;

    public void codingSymbolsToString (char[] arrayForCoding){

        for (int i = 0; i < arrayForCoding.length; i++) {


            codingSymbol.set(i, String.valueOf(arrayForCoding[i]));

        }
    }

    public void codingSymbol (ArrayList<String> listForCoding){

        InitialMorseTable initialMorseTable = new InitialMorseTable();

        for (int i = 0; i < listForCoding.size(); i++) {

            if (Objects.equals(listForCoding.get(i), initialMorseTable.getTextToMorse().get(listForCoding.get(i)))){

                afterCoding.add(1, listForCoding.get(i));

            }


        }
    }
}
