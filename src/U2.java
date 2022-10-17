
class U2 extends Rocket {

    U2() {
        setCost(120);
        setWeight(18000);
        setCurrentWeight(18000);
        setMaxWeight(29000);
    }


     //Returns either true or false indicating if the launch was successful or not
    @Override
    public boolean launch() {
        chanceOfLaunchFailure = 0.04 * ((double) getCurrentWeight() - getWeight()) / (getMaxWeight() - getWeight());
        return chanceOfLaunchFailure <= Math.random() * 0.1;
    }

    //Returns either true or false indicating if the landing was successful or not
    @Override
    public boolean land() {
        chanceOfLandingFailure = 0.08 * ((double) getCurrentWeight() - getWeight()) / (getMaxWeight() - getWeight());
        return chanceOfLandingFailure <= Math.random() * 0.1;
    }
}