
//Class representing Item to be carried

class Item {
    private String name;
    private int weight;

    //Set name of item
    void setName(String name) {
        this.name = name;
    }

    // Set weight of item
    void setWeight(int weight) {
        this.weight = weight;
    }

    String getName() {
        return name;
    }

    int getWeight() {
        return weight;
    }
}