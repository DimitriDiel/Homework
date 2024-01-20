package Consultation.cons24_2;

import Consultation.cons24_2.service.CodingSymbols;
import Consultation.cons24_2.service.InputMessage;
import Consultation.cons24_2.service.SplitMessageForSymbols;

public class MorzeDemo {
    public static void main(String[] args) {

        InputMessage inputMessage = new InputMessage();

        inputMessage.userInput("Введите текст");

        SplitMessageForSymbols splitMessageForSymbols = new SplitMessageForSymbols();

        splitMessageForSymbols.splitMessageForSymbols(inputMessage.getTextForCoding());

        System.out.println(splitMessageForSymbols.arrayForCode);

        CodingSymbols codingSymbols = new CodingSymbols();

       // codingSymbols.codingSymbolsToString(splitMessageForSymbols.arrayForCode);

      //  codingSymbols.codingSymbol(codingSymbols.codingSymbol);

      //  System.out.println(codingSymbols.afterCoding);
    }
}
