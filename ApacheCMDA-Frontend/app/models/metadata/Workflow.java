package models.metadata;

import com.fasterxml.jackson.databind.JsonNode;
import util.APICall;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmhbh on 11/18/15.
 */
public class Workflow {
    private int id;
    private String title;
    private String description;
    private String image;
    private String contributor;
    private String instruction;
    private String dataset;
    private List<Tag> tags;

    private static final String GET_ALL_TAGS_BY_ID = "http://www.codeee.com:8080/workflow/Tags";

    private static final String GET_ALL_WORKFLOWS = "http://www.codeee.com:8080/workflow/workflow";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContributor() {
        return contributor;
    }

    public void setContributor(String contributor) {
        this.contributor = contributor;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getDataset() {
        return dataset;
    }

    public void setDataset(String dataset) {
        this.dataset = dataset;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public static List<Workflow> all() {
        List<Workflow> list = new ArrayList<Workflow>();
        list.add(new Workflow());
        return list;
    }


}
