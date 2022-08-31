package creditProject.service;

import creditProject.Model.Rate;
import creditProject.Model.Summary;

import java.util.List;

public interface SummaryService {
        Summary calculate(List<Rate> rates);
}
