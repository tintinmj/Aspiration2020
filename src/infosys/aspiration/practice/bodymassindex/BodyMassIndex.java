/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infosys.aspiration.practice.bodymassindex;

/**
 *
 * @author Tintinmj
 */
public class BodyMassIndex {
    
    private float BMI;
        
    public BodyMassIndex() {
        setBMI(0.0f);
    }
    private String getCategoryHelper(float height, float weight) {
        if (height > 0 && weight > 0)
            return "";
        else
            throw new IllegalArgumentException("Invalid");
    }
    
    public String getCategory(float height, float weight) {
        
        try {
            getCategoryHelper(height, weight);
        }
        catch (IllegalArgumentException e){
            return e.getMessage();
        }
        // height is in centimeter so convert it into meter
        BMI = (float) (weight / (Math.pow((height / 100), 2)));
        
        setBMI(BMI);
        if(BMI < 15)
            return "Starvation";
        if(BMI >= 15 && BMI < 18.5)
            return "Under weight";
        if(BMI >= 18.5 && BMI < 25)
            return "Normal";
        if(BMI >= 25 && BMI < 30)
            return "Over weight";
        if(BMI >= 30 && BMI < 40)
            return "Obese";
        else if(BMI >= 40)
            return "Morbidly obese";
        else
            return "Inhuman";
    }
    
    private void setBMI(float BMI) {
        this.BMI = BMI;
    }
    
    public float getBMI() {
        return this.BMI;
    }
}
