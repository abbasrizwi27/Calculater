package com.company;
//
public class Calculater {
    int Add(String numbers)
    {
        int sum=0;
        if(numbers.isEmpty()){
            return 0;
        }
        if(!numbers.contains("\n")) {
            String[] nbr = numbers.split(",");
            for (String i : nbr) {
                sum += Integer.parseInt(i);

            }
            return sum;
        }
        else {
            if(!numbers.contains("//")){
                String[] nbr = numbers.split("\n");
                for(String i : nbr){
                   String[] com = i.split(",");
                   for(String j : com){
                       sum += Integer.parseInt(j);
                   }
                }
                return sum;
            }
            
        }
    }
}
