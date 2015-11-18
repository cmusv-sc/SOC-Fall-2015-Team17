package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.metadata.ClimateService;
import models.metadata.Tag;
import models.metadata.Workflow;
import play.libs.Json;
import play.mvc.Controller;
import play.data.Form;
import play.mvc.Result;
import util.APICall;
import views.html.climate.addClimateServices;
import views.html.climate.createWorkflow;
import views.html.climate.workflows;
/**
 * Created by zmhbh on 11/18/15.
 */
public class WorkflowController extends Controller{
    final static Form<Workflow> workflowForm = Form.form(Workflow.class);

    public static Result workflows() {
        return ok(workflows.render(Workflow.all(), workflowForm));
    }

    public static Result createWorkflow() {
        return ok(createWorkflow.render(workflowForm));
    }

    public static Result handleCreateWorkflow(){
        return redirect("/workflows");
    }



    /*public static Result createWorkflow() {
        Form<Workflow> dc = workflowForm.bindFromRequest();
        ObjectNode jsonData = Json.newObject();
        try {

            String originalClimateServiceName = dc.field("Name").value();
            String newClimateServiceName = originalClimateServiceName.replace(' ', '-');

            if (newClimateServiceName != null && !newClimateServiceName.isEmpty()) {
                jsonData.put("name", newClimateServiceName);
            }

            jsonData.put("creatorId", 1);
            jsonData.put("purpose", dc.field("Purpose").value());
            jsonData.put("url", dc.field("Url").value());
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
            Date date = new Date();
            jsonData.put("createTime", dateFormat.format(date));
            jsonData.put("scenario", dc.field("Scenario").value());
            jsonData.put("versionNo", dc.field("Version").value());
            jsonData.put("rootServiceId", dc.field("Root_Service").value());
            JsonNode response = ClimateService.create(jsonData);
            Application.flashMsg(response);
        } catch (IllegalStateException e) {
            e.printStackTrace();
            Application.flashMsg(APICall
                    .createResponse(APICall.ResponseType.CONVERSIONERROR));
        } catch (Exception e) {
            e.printStackTrace();
            Application.flashMsg(APICall.createResponse(APICall.ResponseType.UNKNOWN));
        }
        return redirect("/workflows");
    }*/
}
