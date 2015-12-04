
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
object workflowDisplay extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[metadata.Workflow,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(workflow: metadata.Workflow):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*5.2*/scripts/*5.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.13*/("""
<script src='"""),_display_(Seq[Any](/*6.15*/routes/*6.21*/.Assets.at("javascripts/edit_button.js"))),format.raw/*6.61*/("""'></script>
<script type="text/javascript">
          $(document).ready(function()"""),format.raw/*8.39*/("""{"""),format.raw/*8.40*/("""

          """),format.raw/*10.11*/("""}"""),format.raw/*10.12*/(""");
  </script>
""")))};
Seq[Any](format.raw/*1.31*/("""

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
                    <td><a id="workflowImgLink" href=""> <img src=""""),_display_(Seq[Any](/*80.69*/workflow/*80.77*/.getImage())),format.raw/*80.88*/(""""
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

"""),format.raw/*120.11*/("""


""")))})))}
    }
    
    def render(workflow:metadata.Workflow): play.api.templates.HtmlFormat.Appendable = apply(workflow)
    
    def f:((metadata.Workflow) => play.api.templates.HtmlFormat.Appendable) = (workflow) => apply(workflow)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 03 17:05:32 PST 2015
                    SOURCE: /Users/zmhbh/Desktop/team-new/SOC-Fall-2015-Team17-Lead-Runyu-Shi/ApacheCMDA-Frontend/app/views/climate/workflowDisplay.scala.html
                    HASH: ab8e425161785ef9438721abdb7dc15bf4910ce8
                    MATRIX: 803->1|925->51|939->58|1023->62|1073->77|1087->83|1148->123|1257->205|1285->206|1325->218|1354->219|1409->30|1437->49|1465->235|1503->238|1538->264|1578->266|1616->269|1653->284|2339->934|2356->942|2389->953|2681->1209|2698->1217|2737->1234|3029->1490|3046->1498|3085->1515|3377->1771|3394->1779|3433->1796|3709->2036|3726->2044|3761->2057|4265->2525|4282->2533|4315->2544|4889->3662
                    LINES: 26->1|29->5|29->5|31->5|32->6|32->6|32->6|34->8|34->8|36->10|36->10|39->1|41->4|42->12|44->14|44->14|44->14|46->16|46->16|71->41|71->41|71->41|76->46|76->46|76->46|81->51|81->51|81->51|86->56|86->56|86->56|91->61|91->61|91->61|110->80|110->80|110->80|131->120
                    -- GENERATED --
                */
            