public class GreaterThanEqualTo {
    // program used to document an attempt to complete a 30 day challenge to drink enough water per day
    public static void main(String[] args) {
        double recommendedWaterIntake = 8;
        double daysInChallenge = 30;
        double yourWaterIntake = 235.5;

        // calculating how the total amount of water that should be consumed for the challenge
        double totalRecommendedAmount = recommendedWaterIntake*daysInChallenge;
        boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;

        // outputting reccomended amount of water to be consumed
        System.out.print("Total reccomended amount: ");
        System.out.println(totalRecommendedAmount);
        
        // outputting whether the challenge is complete & how close the user is to completing the challenge
        System.out.print("Challenge complete: ");
        System.out.println(isChallengeComplete);
        System.out.println("Water consumed: "+yourWaterIntake+"/"+totalRecommendedAmount);

    }
    
}
