package creditProject.service;

import creditProject.Model.InputData;

public interface PrintingService {

        String CURRENCY = "ZL";
        String NEW_LINE = "\n";
        String PERCENT = "%";

        String INTEREST_SUM = "SUMA ODSETEK: ";
        String RATE_NUMBER = "NR: ";
        String YEAR = "ROK: ";
        String MONTH = "MIESI¥C: ";
        String DATE = "DATA: ";
        String MONTHS = "MIESIÊCY, ";
        String RATE = "RATA: ";
        String INTEREST = "OPROCENTOWANIE: ";
        String PERCCAPITALENT = "KAPITA£: ";
        String LEFT = "POZOSTA£O: ";
        String MORTGAGE_AMOUNT = "KWOTA KREDYTU: ";
        String MORTGAGE_PERIOD = "KWOTA KREDYTOWANIA: ";


        void PrintInputDataInfo(final InputData inputData);
}
