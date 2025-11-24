package models;

public class Interaction {
    public int userId;
    public int chefId;
    public String message;

    public Interaction(int userId, int chefId, String message) {
        this.userId = userId;
        this.chefId = chefId;
        this.message = message;
    }

    @Override
    public String toString() {
        return userId + "," + chefId + "," + message;
    }
}
