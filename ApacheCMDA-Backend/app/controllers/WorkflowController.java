package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import models.Tag;
import models.TagRepository;
import models.Workflow;
import models.WorkflowRepository;
import play.mvc.*;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.PersistenceException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmhbh on 11/19/15.
 */
@Named
@Singleton
public class WorkflowController extends Controller {

    private final WorkflowRepository workflowRepository;
    private final TagRepository tagRepository;

    @Inject
    public WorkflowController(WorkflowRepository workflowRepository, TagRepository tagRepository) {
        this.workflowRepository = workflowRepository;
        this.tagRepository = tagRepository;
    }

    public Result addWorkflow() {
        JsonNode json = request().body().asJson();
        if (json == null) {
            System.out.println("Tag not saved, expecting Json data");
            return badRequest("Tag not saved, expecting Json data");
        }
        String title = json.findPath("title").asText();
        String description = json.findPath("description").asText();
        String image = json.findPath("image").asText();
        String contributor = json.findPath("contributor").asText();
        String instruction = json.findPath("instruction").asText();
        String dataset = json.findPath("dataset").asText();
        String tags=json.findPath("tags").asText();
        String[] tagArr=tags.split(",",-1);
        List<Tag> tagList= new ArrayList<>();
        for(int i=0;i<tagArr.length;i++){
            tagList.add(new Tag(tagArr[i]));
        }

        try {
            Workflow workflow = new Workflow(title, description, image, contributor, instruction, dataset);
            workflow.setTags(tagList);
            Workflow savedWorkflow = workflowRepository.save(workflow);
            System.out.println("workflow saved: " + savedWorkflow.getId());
            return created(new Gson().toJson(savedWorkflow.getId()));
        } catch (PersistenceException pe) {
            pe.printStackTrace();
            System.out.println("Tag not created");
            return badRequest("Tag not created");
        }
    }

    public Result getWorkflow(long id, String format) {
        if (id < 0) {
            System.out.println("id is negative!");
            return badRequest("id is negative!");
        }
        Workflow workflow = workflowRepository.findOne(id);
        if (workflow == null) {
            System.out.println("Tag not found with name: " + id);
            return notFound("Tag not found with name: " + id);
        }

        String result = new String();
        if (format.equals("json")) {
            result = new Gson().toJson(workflow);
        }

        return ok(result);
    }

    public Result getAllWorkflows(String format) {
        try {
            Iterable<Workflow> workflows = workflowRepository.findAll();
            String result = new Gson().toJson(workflows);
            return ok(result);
        } catch (Exception e) {
            return badRequest("Tag not found");
        }
    }

    /*public Result createTags(String format) {
        JsonNode json = request().body().asJson();
        if (json == null) {
            System.out.println("Tag not saved, expecting Json data");
            return badRequest("Tag not saved, expecting Json data");
        }

        try {
            int workflowId = json.findPath("workflowId").asInt();
            String tags = json.findPath("tags").asText();
            String[] tagArr = tags.split(",", -1);
            List<Tag> savedTags = new ArrayList<Tag>();
            for (int i = 0; i < tagArr.length - 1; i++) {
                Tag tag = new Tag(tagArr[i]);
                savedTags.add(tagRepository.save(tag));
            }



        }catch (PersistenceException pe){
            pe.printStackTrace();
            System.out.println("create Tags fails");
            return badRequest("create Tags fails");
        }

        try {

            Workflow savedWorkflow = workflowRepository.save(workflow);
            System.out.println("workflow saved: " + savedWorkflow.getId());
            return created(new Gson().toJson(savedWorkflow.getId()));
        } catch (PersistenceException pe) {
            pe.printStackTrace();
            System.out.println("Tag not created");
            return badRequest("Tag not created");
        }
    }*/

}
