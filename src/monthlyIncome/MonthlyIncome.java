package monthlyIncome;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class MonthlyIncome {

    public static Double getLowerIncomeInMonth(double[] totalMonthIncome){
        double minimumValue = 0.0;
        for(double dailyIncome : totalMonthIncome){
            if(dailyIncome == totalMonthIncome[0])
                minimumValue = dailyIncome;             // Versão longa
            else
                if(dailyIncome > minimumValue)
                    minimumValue = dailyIncome;
        }
        return minimumValue;
    }

    public Double getLowerIncomeShortVersion(double[] totalMonthIncome){
        return Arrays.stream(totalMonthIncome).min().orElseThrow();    // Versão curta
    }

    public Double getHigherIncome(double[] totalMonthIncome){
        double maxValue = 0.0;
        for(double dailyIncome : totalMonthIncome){
            if(dailyIncome == totalMonthIncome[0])
                maxValue = dailyIncome;             // Versão longa
            else
            if(dailyIncome < maxValue)
                maxValue = dailyIncome;
        }
        return maxValue;
    }

    public Double getHigherIncomeShortVersion(double[] totalMonthIncome){
        return Arrays.stream(totalMonthIncome).max().orElseThrow();
    }

    public ArrayList<Double> getHigherThanAverage(double[] totalMonthIncome){
        double average = 0.0;
        ArrayList<Double> higherThanAverage = new ArrayList<>();
        for(double day : totalMonthIncome) {
            average += day;
        }
        average /= totalMonthIncome.length;

        for(double day : totalMonthIncome){
            if(day > average)
                higherThanAverage.add(day);
        }
        return higherThanAverage;
    }
}
