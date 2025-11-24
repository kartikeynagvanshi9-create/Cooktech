package models;

public class CookingClass {
    public int classId;
    public String title;
    public String description;
    public String schedule;
    public int chefId;

    public CookingClass(int classId, String title, String description,
                        String schedule, int chefId) {
        this.classId = classId;
        this.title = title;
        this.description = description;
        this.schedule = schedule;
        this.chefId = chefId;
    }

    @Override
    public String toString() {
        return classId + "," + title + "," + description + "," + schedule + "," + chefId;
    }
}
