
package views.html.climate

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object workflowDisplay extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[metadata.Workflow,play.data.Form[metadata.Comment],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(workflow: metadata.Workflow, commentForm: play.data.Form[metadata.Comment]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*6.2*/scripts/*6.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.13*/("""
<script src='"""),_display_(Seq[Any](/*7.15*/routes/*7.21*/.Assets.at("javascripts/edit_button.js"))),format.raw/*7.61*/("""'></script>
<script type="text/javascript">
          $(document).ready(function()"""),format.raw/*9.39*/("""{"""),format.raw/*9.40*/("""

          """),format.raw/*11.11*/("""}"""),format.raw/*11.12*/(""");
  </script>
""")))};
Seq[Any](format.raw/*1.78*/("""


"""),format.raw/*5.1*/("""
"""),format.raw/*13.2*/("""

"""),_display_(Seq[Any](/*15.2*/main("Workflows", scripts)/*15.28*/ {_display_(Seq[Any](format.raw/*15.30*/("""

"""),_display_(Seq[Any](/*17.2*/flash_message())),format.raw/*17.17*/("""


    <div class="container">


        <body>

            <h2 class="text-center">Workflow Details</h2>

            <div class="container col-md-6">
                <form>
                    <table class="table table-bordered table-striped">
                        <thead>
                            <tr>
                                <th class="col-md-2">Item</th>
                                <th class="col-md-4">Value</th>

                            </tr>
                        </thead>
                        <tbody id="dynamicTBody">

                            <tr id="Title_trID">
                                <td id="Title">Workflow Title</td>
                                <td><span type="text" class="form-control"
                                id="Title_detail">"""),_display_(Seq[Any](/*42.52*/workflow/*42.60*/.getTitle())),format.raw/*42.71*/("""</td>
                            </tr>
                            <tr id="Description_trID">
                                <td id="Description">Workflow Description</td>
                                <td><span type="text" class="form-control"
                                id="Description_detail">"""),_display_(Seq[Any](/*47.58*/workflow/*47.66*/.getDescription())),format.raw/*47.83*/("""</td>
                            </tr>
                            <tr id="Contributor_trID">
                                <td id="Contributor">Workflow Contributor</td>
                                <td><span type="text" class="form-control"
                                id="Contributor_detail">"""),_display_(Seq[Any](/*52.58*/workflow/*52.66*/.getContributor())),format.raw/*52.83*/("""</td>
                            </tr>
                            <tr id="Instruction_trID">
                                <td id="Instruction">Workflow Instruction</td>
                                <td><span type="text" class="form-control"
                                id="Instruction_detail">"""),_display_(Seq[Any](/*57.58*/workflow/*57.66*/.getInstruction())),format.raw/*57.83*/("""</td>
                            </tr>
                            <tr id="Dataset_trID">
                                <td id="Dataset">Workflow Dataset</td>
                                <td><span type="text" class="form-control"
                                id="Dataset_detail">"""),_display_(Seq[Any](/*62.54*/workflow/*62.62*/.getDataset())),format.raw/*62.75*/("""</td>
                            </tr>

                        </tbody>
                    </table>
                </form>
            </div>


            <div class="container col-md-6">
                <form>
                    <table class="table table-bordered table-striped">
                        <thead>
                            <tr>
                                <th>Workflow Image</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><a id="workflowImgLink" href=""> <img src="http://i.stack.imgur.com/wpt5k.jpg"
                                id="workflowImg" class="img-responsive">
                                </a></td>
                            </tr>
                        </tbody>
                    </table>
                    <br>
                    <div class="text-center" id="output"></div>
                </form>
            </div>

            <div style="clear: both;" align="center">
                """),_display_(Seq[Any](/*93.18*/if(workflow.visibility == 1)/*93.46*/ {_display_(Seq[Any](format.raw/*93.48*/("""
                    """),_display_(Seq[Any](/*94.22*/helper/*94.28*/.form(routes.WorkflowController.addLevelComment(workflow.getId()))/*94.94*/ {_display_(Seq[Any](format.raw/*94.96*/("""
                        <div class = "form-group" id="commentForm">
                        """),_display_(Seq[Any](/*96.26*/textarea(commentForm("Comment on workflow"), 'rows -> 3, 'style -> "width: 80%;"))),format.raw/*96.107*/("""
                        </div>
                        <input class="btn" type="submit" value="Add Comments">
                    """)))})),format.raw/*99.22*/("""
                """)))})),format.raw/*100.18*/("""
                """),_display_(Seq[Any](/*101.18*/for(level <- workflow.getLevelList()) yield /*101.55*/{_display_(Seq[Any](format.raw/*101.56*/("""
                    <div class="pi">
                        <div>
                            <h5 class="alignleft"><a href = """"),_display_(Seq[Any](/*104.63*/{routes.UserController.oneUser(level.comment.userId)})),format.raw/*104.116*/("""">User """),_display_(Seq[Any](/*104.124*/level/*104.129*/.comment.userName)),format.raw/*104.146*/("""</a></h5>
                            <h5 class="alignright">Posted on """),_display_(Seq[Any](/*105.63*/level/*105.68*/.comment.date.toString())),format.raw/*105.92*/("""</h5>
                        </div>
                        <div class="pcommenttext" style="clear: both;" align="left">
                            <p class="fontnewroman">"""),_display_(Seq[Any](/*108.54*/level/*108.59*/.comment.comments)),format.raw/*108.76*/("""</p>
                        </div>
                        <div class="pcomment">
                            """),_display_(Seq[Any](/*111.30*/if(level.commentList.size()>0)/*111.60*/ {_display_(Seq[Any](format.raw/*111.62*/("""
                                <h5 class="alignleft">Replies</h5>
                            """)))})),format.raw/*113.30*/("""
                            """),_display_(Seq[Any](/*114.30*/for(eachComment <- level.commentList) yield /*114.67*/{_display_(Seq[Any](format.raw/*114.68*/("""
                                <div class="pcontent" style="clear: both;">
                                    <div>
                                        <h5 class="alignleft"><a href = """"),_display_(Seq[Any](/*117.75*/{routes.UserController.oneUser(eachComment.userId)})),format.raw/*117.126*/("""">User """),_display_(Seq[Any](/*117.134*/eachComment/*117.145*/.userName)),format.raw/*117.154*/("""</a></h5>
                                        <h5 class="alignright">Posted on """),_display_(Seq[Any](/*118.75*/eachComment/*118.86*/.date.toString())),format.raw/*118.102*/("""</h5>
                                    </div>
                                    <div class="pcommenttext" style="clear: both;" align="left">
                                        <p class="fontnewroman">"""),_display_(Seq[Any](/*121.66*/eachComment/*121.77*/.comments)),format.raw/*121.86*/("""</p>
                                    </div>
                                </div>
                            """)))})),format.raw/*124.30*/("""
                            """),_display_(Seq[Any](/*125.30*/if(workflow.visibility == 1)/*125.58*/ {_display_(Seq[Any](format.raw/*125.60*/("""
                                """),_display_(Seq[Any](/*126.34*/helper/*126.40*/.form(routes.WorkflowController.addSingleComment(workflow.getId(), level.id))/*126.117*/ {_display_(Seq[Any](format.raw/*126.119*/("""
                                    <div class = "form-group">
                                    """),_display_(Seq[Any](/*128.38*/textarea(commentForm("Reply on this comment"), 'rows -> 3, 'style -> "width: 80%;"))),format.raw/*128.121*/("""
                                    </div>
                                    <input class="btn" type="submit" value="Reply">
                                    """)))})),format.raw/*131.38*/("""
                            """)))})),format.raw/*132.30*/("""
                        </div>
                    </div>
                """)))})),format.raw/*135.18*/("""
            </div>

        </body>

    </div>

    """),format.raw/*161.15*/("""







    """),format.raw/*277.11*/("""


""")))})))}
    }
    
    def render(workflow:metadata.Workflow,commentForm:play.data.Form[metadata.Comment]): play.api.templates.HtmlFormat.Appendable = apply(workflow,commentForm)
    
    def f:((metadata.Workflow,play.data.Form[metadata.Comment]) => play.api.templates.HtmlFormat.Appendable) = (workflow,commentForm) => apply(workflow,commentForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 11 02:08:33 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/ApacheCMDA-Frontend/app/views/climate/workflowDisplay.scala.html
                    HASH: e5268e03f5b872a49389cba44d2bbc679bdca6b2
                    MATRIX: 836->1|1005->99|1019->106|1103->110|1153->125|1167->131|1228->171|1337->253|1365->254|1405->266|1434->267|1489->77|1518->97|1546->283|1584->286|1619->312|1659->314|1697->317|1734->332|2570->1132|2587->1140|2620->1151|2962->1457|2979->1465|3018->1482|3360->1788|3377->1796|3416->1813|3758->2119|3775->2127|3814->2144|4140->2434|4157->2442|4192->2455|5298->3525|5335->3553|5375->3555|5433->3577|5448->3583|5523->3649|5563->3651|5693->3745|5797->3826|5961->3958|6012->3976|6067->3994|6121->4031|6161->4032|6328->4162|6405->4215|6451->4223|6467->4228|6508->4245|6617->4317|6632->4322|6679->4346|6891->4521|6906->4526|6946->4543|7095->4655|7135->4685|7176->4687|7306->4784|7373->4814|7427->4851|7467->4852|7697->5045|7772->5096|7818->5104|7840->5115|7873->5124|7994->5208|8015->5219|8055->5235|8303->5446|8324->5457|8356->5466|8505->5582|8572->5612|8610->5640|8651->5642|8722->5676|8738->5682|8826->5759|8868->5761|9006->5862|9113->5945|9311->6110|9374->6140|9483->6216|9566->6831|9607->10452
                    LINES: 26->1|29->6|29->6|31->6|32->7|32->7|32->7|34->9|34->9|36->11|36->11|39->1|42->5|43->13|45->15|45->15|45->15|47->17|47->17|72->42|72->42|72->42|77->47|77->47|77->47|82->52|82->52|82->52|87->57|87->57|87->57|92->62|92->62|92->62|123->93|123->93|123->93|124->94|124->94|124->94|124->94|126->96|126->96|129->99|130->100|131->101|131->101|131->101|134->104|134->104|134->104|134->104|134->104|135->105|135->105|135->105|138->108|138->108|138->108|141->111|141->111|141->111|143->113|144->114|144->114|144->114|147->117|147->117|147->117|147->117|147->117|148->118|148->118|148->118|151->121|151->121|151->121|154->124|155->125|155->125|155->125|156->126|156->126|156->126|156->126|158->128|158->128|161->131|162->132|165->135|172->161|180->277
                    -- GENERATED --
                */
            