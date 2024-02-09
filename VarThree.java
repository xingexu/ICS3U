public class VarThree {
    public static void main(String[] args) {
       
        double box1Weight = 11.0;
        double box2Weight = 16.5; 

        double weightDifference = Math.abs(box2Weight - box1Weight);

        System.out.println("The difference in weight between Box1 and Box2 is: " + weightDifference + " kg");
    }
}