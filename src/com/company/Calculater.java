package com.company;

public class Calculater {
    int Add(String numbers)
    {
        int sum=0;
        if(numbers.isEmpty()){
            return 0;
        }
        String[] nbr=numbers.split(",");
        for(String i:nbr){
            sum += Integer.parseInt(i);

        }
        return sum;

    }
}
