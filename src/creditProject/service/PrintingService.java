package creditProject.service;

import creditProject.Model.InputData;
import creditProject.Model.Rate;
import creditProject.Model.Summary;

import java.util.List;

public interface PrintingService {

        String CURRENCY = "ZL";
        String NEW_LINE = "\n";
        String PERCENT = "%";

        String INTEREST_SUM = "SUMA ODSETEK: ";
        String LOSTS_SUM = "SUMA STRAT: ";
        String OVERPAYMENT= "NADP£ATA: ";
        String OVERPAYMENT_PROVISION = "PROWIZJA ZA NADP£ATY: ";
        String OVERPAYMENT_REDUCE_RATE = "NADP£ATA, ZMNIEJSZENIE RATY";
        String OVERPAYMENT_REDUCE_PERIOD = "NADP£ATA, SKRÓCENIE OKRESU";
        String OVERPAYMENT_FREQUENCY = "SCHEMAT DOKONYWANIA NADP£AT: ";

        String RATE_NUMBER = "NR: ";
        String YEAR = "ROK: ";
        String MONTH = "MIESI¥C: ";
        String DATE = "DATA: ";
        String MONTHS = "MIESIÊCY, ";
        String RATE = "RATA: ";
        String INTEREST = "ODSETKI: ";
        String CAPITAL = "KAPITA£: ";
        String LEFT_AMOUNT = "POZOSTA£A KWOTA: ";
        String LEFT_MONTHS = "POZOSTA£O MIESIÊCY: ";
        String MORTGAGE_AMOUNT = "KWOTA KREDYTU: ";
        String MORTGAGE_PERIOD = "KWOTA KREDYTOWANIA: ";


        void PrintInputDataInfo(final InputData inputData);

        void printRates(List<Rate> rates);

        void printSummary(Summary summary);
}
