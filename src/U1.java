
class U1 extends Rocket {
    U1() {
        setCost(100);
        setWeight(10000);
        setCurrentWeight(10000);
        setMaxWeight(18000);
    }

    // Returns either true or false indicating if the launch was successful or not
    @Override
    public boolean launch() {
        chanceOfLaunchFailure = 0.05 * ((double) getCurrentWeight() - getWeight()) / (getMaxWeight() - getWeight());
        return chanceOfLaunchFailure <= Math.random() * 0.1;
    }

    // Returns either true or false indicating if the landing was successful or not
    @Override
    public boolean land() {
        chanceOfLandingFailure = 0.01 * ((double) (getCurrentWeight() - getWeight()) / (getMaxWeight() - getWeight()));
        return chanceOfLandingFailure <= Math.random() * 0.1;
    }
}