/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infosys.aspiration.practice.bodymassindex;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author Tintinmj
 */
public class BodyMassIndexTester {
    
    public static void main(String []args) {
        
        Random generator = new Random();
        
        for(int i = 0; i < 100; i++) {
            float weightInKG = generator.nextFloat() * (150.0f - 0.0f) + 0.0f;
            float heightInCM = generator.nextFloat() * (190.0f - 0.0f) + 0.0f;
            
            BodyMassIndex bmi = new BodyMassIndex();
            
            printCategoryResult(weightInKG, heightInCM, 
                    bmi.getCategory(heightInCM, weightInKG), bmi.getBMI());
        }
        
        BodyMassIndex bmiAnother = new BodyMassIndex();
        printCategoryResult(0.0f, 0.6f, 
                bmiAnother.getCategory(0.0f,0.6f), bmiAnother.getBMI());
        
        BodyMassIndex bmiAnotherOne = new BodyMassIndex();
        printCategoryResult(0.0f, 45.0f, 
                bmiAnotherOne.getCategory(0.0f,45.0f), bmiAnotherOne.getBMI());

    }
    
    public static void printCategoryResult(final float weight, final float height,
            final String category, final float BMI) {
        
        DecimalFormat df = new DecimalFormat("#000.00");
        System.out.println(new StringBuilder()
                                .append(" weight : ")
                                .append(df.format(weight))
                                .append(" height : ")
                                .append(df.format(height))
                                .append(" Category : ")
                                .append(category)
                                .append(" BMI : ")
                                .append(df.format(BMI))
                                .toString());
    }
}
