/**
 * @author alanbatrez
 * This class models a Car for car companies
 */

class Car
{
     private final String brand;
     private final String model;
     private String color;
     private final int year;

    /**
     * The constructor
     * @param brand the brand of the car
     * @param model the model of the car
     * @param color the color of the car
     * @param year the year of the car
     */
     Car(final String brand,
         final String model,
         final String color,
         final int year)
     {
         this.brand = brand;
         this.model = model;
         this.color = color;
         this.year = year;

     }

    /**
     * Returns the model of the car
     * @return the model of the car
     */
     public String getBrand()
     {
         return brand;
     }





}
