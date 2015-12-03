package models;

/**
 * Created by zmhbh on 12/3/15.
 */
public class TagCloud {
    private String text;
    private int weight;

    public TagCloud(String text, int weight) {
        this.text = text;
        this.weight = weight;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "TagCloud{" +
                "text='" + text + '\'' +
                ", weight=" + weight +
                '}';
    }
}
