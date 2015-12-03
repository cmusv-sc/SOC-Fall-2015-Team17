package models.metadata;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import util.APICall;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmhbh on 11/18/15.
 */
/*
modified by Ethan on 12/01/15
added poupularity part
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

    //for popularity
    private int viewCount;
    private int usageCount;
    private int commentCount;
    private int downloadCount;
    private int referenceCount;


    private static final String GET_ALL_WORKFLOWS = "http://localhost:9034/workflow/getAllWorkflows/json";
    private static final String ADD_WORKFLOW = "http://localhost:9034/workflow/addWorkflow";
    private static final String CREATE_TAGS="http://localhost:9034/workflow/createTags";
    private static final String GET_WORKFLOW="http://localhost:9034/workflow/getWorkflow/id/";
    private static final String GET_TOP10_WORKFLOWS_BY_VIEWCOUNT = "http://localhost:9034/workflow/getTop10WorkflowByViewCount/json";
    private static final String UPDATE_VIEWCOUNT = "http://localhost:9034/workflow/updateViewCount/";


    public Workflow(){

    }

    public Workflow(String title, String description, String image, String contributor, String instruction, String dataset) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.contributor = contributor;
        this.instruction = instruction;
        this.dataset = dataset;
    }

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

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public int getUsageCount() {
        return usageCount;
    }

    public void setUsageCount(int usageCount) {
        this.usageCount = usageCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public int getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(int downloadCount) {
        this.downloadCount = downloadCount;
    }

    public int getReferenceCount() {
        return referenceCount;
    }

    public void setReferenceCount(int referenceCount) {
        this.referenceCount = referenceCount;
    }



    // restful call
    public static JsonNode create(JsonNode jsonData) {
        return APICall.postAPI(ADD_WORKFLOW, jsonData);
    }
    public static JsonNode createTags(JsonNode jsonData){return APICall.postAPI(CREATE_TAGS,jsonData);}

    public static Workflow getWorkflow(long id){
        Workflow workflow = new Workflow();
        JsonNode workflowNode=APICall.callAPI(GET_WORKFLOW+id);
        if(workflowNode==null)
            return workflow;

        Gson gson = new Gson();
        return gson.fromJson(workflowNode.toString(),Workflow.class);
    }

    public static List<Workflow> all() {
        List<Workflow> workflows = new ArrayList<Workflow>();

        JsonNode workflowNode = APICall
                .callAPI(GET_ALL_WORKFLOWS);

        if (workflowNode == null || !workflowNode.isArray()) {
            return workflows;
        }

        for (int i = 0; i < workflowNode.size(); i++) {
            JsonNode json = workflowNode.path(i);
            Workflow newWorkflow = new Workflow();
            newWorkflow.setId(json.path("id").asInt());
            newWorkflow.setTitle(json.path("title").asText());
            newWorkflow.setDescription(json.path("description").asText());
            newWorkflow.setImage(json.path("image").asText());
            newWorkflow.setContributor(json.path("contributor").asText());
            newWorkflow.setInstruction(json.path("instruction").asText());
            newWorkflow.setDataset(json.path("dataset").asText());
            newWorkflow.setViewCount(json.path("viewCount").asInt());
            newWorkflow.setUsageCount(json.path("usageCount").asInt());
            newWorkflow.setCommentCount(json.path("commentCount").asInt());
            newWorkflow.setDownloadCount(json.path("downloadCount").asInt());
            newWorkflow.setReferenceCount(json.path("referenceCount").asInt());

            workflows.add(newWorkflow);
        }
        return workflows;
    }

    public static List<Workflow> getTop10WorkflowsByViewCount() {

        List<Workflow> workflows = new ArrayList<Workflow>();

        JsonNode workflowNode = APICall
                .callAPI(GET_TOP10_WORKFLOWS_BY_VIEWCOUNT);// restful service call backend

        if (workflowNode == null || !workflowNode.isArray()) {
            return workflows;
        }

        for (int i = 0; i < workflowNode.size(); i++) {
            JsonNode json = workflowNode.path(i);
            Workflow newWorkflow = new Workflow();
            newWorkflow.setId(json.path("id").asInt());
            newWorkflow.setTitle(json.path("title").asText());
            newWorkflow.setDescription(json.path("description").asText());
            newWorkflow.setImage(json.path("image").asText());
            newWorkflow.setContributor(json.path("contributor").asText());
            newWorkflow.setInstruction(json.path("instruction").asText());
            newWorkflow.setDataset(json.path("dataset").asText());
            newWorkflow.setViewCount(json.path("viewCount").asInt());
            newWorkflow.setUsageCount(json.path("usageCount").asInt());
            newWorkflow.setCommentCount(json.path("commentCount").asInt());
            newWorkflow.setDownloadCount(json.path("downloadCount").asInt());
            newWorkflow.setReferenceCount(json.path("referenceCount").asInt());

            workflows.add(newWorkflow);
        }
        return workflows;
    }

    public static void updateViewCount(long id) {
        JsonNode workflowNode= APICall.callAPI(UPDATE_VIEWCOUNT + id);
        if (workflowNode == null) {
            return;
        }
    }


}
