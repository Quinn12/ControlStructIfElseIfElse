package com.company;

public class Main {

    public static void main(String[] args)
    {
        double number = 0.0;
        while(number < 105.0)
        {
            number++;
            System.out.println(number);

            if(number > 92.0 && number < 104.0)
            {

                if(number < 97.5)
                {
                    System.out.println("Too cold!");
                }
                else if(number > 99.5)
                {
                    System.out.println("Too hot!");
                }
                else if(number > 97.5 && number < 99.5)
                {
                    System.out.println("just right.");
                }
            }
        }
    }
}
