package com.alange;

/**
 * Created by alange and bnelson on 23-Jul-14.
 */

import com.alange.Logic;
import javax.swing.JOptionPane;

public class CalculatorMain {
    public static String run(String maleOrFemale, double weightInPounds, double heightFeet, double heightInches, double age){

                double heightInInches = (heightFeet * 12) + heightInches;

                double heightInMeters = heightInInches / 39.370;
                double weightInKilograms = weightInPounds / 2.2046;

                double bodyMassIndex = weightInKilograms / (heightInMeters * heightInMeters);
                
                double basalMetabolicRate = 0;
                
                System.out.println(maleOrFemale);
                
                //male 
                if (maleOrFemale.equals("male") || maleOrFemale.equals("m")) {
                    
                basalMetabolicRate = 66 + (6.23 * weightInPounds) + (12.7 * heightInInches) - (6.8 * age);
                    System.out.println("male selected");
                //female
                } else if (maleOrFemale.equals("female") || maleOrFemale.equals("f")){
                    
                    basalMetabolicRate = 655 + (4.35 * weightInPounds) + (4.7 * heightInInches) - (4.7 * age);
                    System.out.println("female selected");
                } else {
                    
                    JOptionPane.showMessageDialog(null, "You have entered an invalid choice. Please select \"male\" or \"female\"");
                    
                }
                
                double toLoseWeight = .75 * basalMetabolicRate;
                
                double howManyDays = 3500 / (basalMetabolicRate - toLoseWeight);
                
                return "Your Body Mass Index is " + Math.round(bodyMassIndex) + "%." + "\n"
                        + "Your Base Metabolic Rate is " + Math.round(basalMetabolicRate) + "." + "\n"
                        + "To lose weight you should intake 75% of your BMR in calories each day. For you that is: " + Math.round(toLoseWeight) + "." + "\n"
                        + "If you intake " + Math.round(toLoseWeight) + " in calories each day, it will take you " + Math.round(howManyDays) + " days to lose a pound.";

            }
        }
