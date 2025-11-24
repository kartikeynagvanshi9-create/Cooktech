package models;

public class Content {
    public int contentId;
    public String videoTitle;
    public String recipe;
    public String status;

    public Content(int contentId, String videoTitle, String recipe) {
        this.contentId = contentId;
        this.videoTitle = videoTitle;
        this.recipe = recipe;
        this.status = "Pending";
    }

    @Override
    public String toString() {
        return contentId + "," + videoTitle + "," + recipe + "," + status;
    }
}
