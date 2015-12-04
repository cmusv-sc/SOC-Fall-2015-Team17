
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
object workflowDisplay extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[metadata.Workflow,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(workflow: metadata.Workflow, tags:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*5.2*/scripts/*5.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.13*/("""
<script src='"""),_display_(Seq[Any](/*6.15*/routes/*6.21*/.Assets.at("javascripts/edit_button.js"))),format.raw/*6.61*/("""'></script>
<script type="text/javascript">
          $(document).ready(function()"""),format.raw/*8.39*/("""{"""),format.raw/*8.40*/("""

          """),format.raw/*10.11*/("""}"""),format.raw/*10.12*/(""");
  </script>
""")))};
Seq[Any](format.raw/*1.44*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*12.2*/("""

"""),_display_(Seq[Any](/*14.2*/main("Workflows", scripts)/*14.28*/ {_display_(Seq[Any](format.raw/*14.30*/("""

"""),_display_(Seq[Any](/*16.2*/flash_message())),format.raw/*16.17*/("""


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
                              id="Title_detail">"""),_display_(Seq[Any](/*41.50*/workflow/*41.58*/.getTitle())),format.raw/*41.69*/("""</td>
                </tr>
                <tr id="Description_trID">
                    <td id="Description">Workflow Description</td>
                    <td><span type="text" class="form-control"
                              id="Description_detail">"""),_display_(Seq[Any](/*46.56*/workflow/*46.64*/.getDescription())),format.raw/*46.81*/("""</td>
                </tr>
                <tr id="Contributor_trID">
                    <td id="Contributor">Workflow Contributor</td>
                    <td><span type="text" class="form-control"
                              id="Contributor_detail">"""),_display_(Seq[Any](/*51.56*/workflow/*51.64*/.getContributor())),format.raw/*51.81*/("""</td>
                </tr>
                <tr id="Instruction_trID">
                    <td id="Instruction">Workflow Instruction</td>
                    <td><span type="text" class="form-control"
                              id="Instruction_detail">"""),_display_(Seq[Any](/*56.56*/workflow/*56.64*/.getInstruction())),format.raw/*56.81*/("""</td>
                </tr>
                <tr id="Dataset_trID">
                    <td id="Dataset">Workflow Dataset</td>
                    <td><span type="text" class="form-control"
                              id="Dataset_detail">"""),_display_(Seq[Any](/*61.52*/workflow/*61.60*/.getDataset())),format.raw/*61.73*/("""</td>
                </tr>

                <tr id="Tags_trID">
                    <td id="Tags">Workflow tags</td>
                    <td><span type="text" class="form-control"
                              id="Tags_detail">"""),_display_(Seq[Any](/*67.49*/tags)),format.raw/*67.53*/("""</td>
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
                    <td><a id="workflowImgLink" href=""> <img src=""""),_display_(Seq[Any](/*86.69*/workflow/*86.77*/.getImage())),format.raw/*86.88*/(""""
                                                              id="workflowImg" class="img-responsive">
                    </a></td>
                </tr>
                <tr>
                    <td><a id="commentLink" href=""> <textarea
                            class="form-control" rows="3" id="comment"></textarea>
                    </a></td>
                </tr>
                </tbody>
            </table>
            <br>
            <div class="text-center" id="output"></div>
        </form>
    </div>


    </body>

</div>

"""),format.raw/*126.11*/("""


""")))})))}
    }
    
    def render(workflow:metadata.Workflow,tags:String): play.api.templates.HtmlFormat.Appendable = apply(workflow,tags)
    
    def f:((metadata.Workflow,String) => play.api.templates.HtmlFormat.Appendable) = (workflow,tags) => apply(workflow,tags)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 03 20:19:20 PST 2015
                    SOURCE: /Users/zmhbh/Desktop/team-new/SOC-Fall-2015-Team17-Lead-Runyu-Shi/ApacheCMDA-Frontend/app/views/climate/workflowDisplay.scala.html
                    HASH: 61f52a5ce9aa225a5e1c841b5d57a58a7967132c
                    MATRIX: 810->1|945->64|959->71|1043->75|1093->90|1107->96|1168->136|1277->218|1305->219|1345->231|1374->232|1429->43|1457->62|1485->248|1523->251|1558->277|1598->279|1636->282|1673->297|2359->947|2376->955|2409->966|2701->1222|2718->1230|2757->1247|3049->1503|3066->1511|3105->1528|3397->1784|3414->1792|3453->1809|3729->2049|3746->2057|3781->2070|4046->2299|4072->2303|4576->2771|4593->2779|4626->2790|5200->3908
                    LINES: 26->1|29->5|29->5|31->5|32->6|32->6|32->6|34->8|34->8|36->10|36->10|39->1|41->4|42->12|44->14|44->14|44->14|46->16|46->16|71->41|71->41|71->41|76->46|76->46|76->46|81->51|81->51|81->51|86->56|86->56|86->56|91->61|91->61|91->61|97->67|97->67|116->86|116->86|116->86|137->126
                    -- GENERATED --
                */
            