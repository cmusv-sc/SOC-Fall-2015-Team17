
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
/*******************************************************************************
* Licensed to the Apache Software Foundation (ASF) under one or more		   *
* contributor license agreements.  See the NOTICE file distributed with	   *
* this work for additional information regarding copyright ownership.         *
* The ASF licenses this file to You under the Apache License, Version 2.0     *
* (the "License"); you may not use this file except in compliance with        *
* the License.  You may obtain a copy of the License at                       *
*                                                                             *
*    http://www.apache.org/licenses/LICENSE-2.0                               *
*																			   *
* Unless required by applicable law or agreed to in writing, software         *
* distributed under the License is distributed on an "AS IS" BASIS,           *
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
* See the License for the specific language governing permissions and         *
* limitations under the License.											   *
*******************************************************************************/
object workflows extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[metadata.Workflow],play.data.Form[metadata.Workflow],play.api.templates.HtmlFormat.Appendable] {

    /*******************************************************************************
* Licensed to the Apache Software Foundation (ASF) under one or more		   *
* contributor license agreements.  See the NOTICE file distributed with	   *
* this work for additional information regarding copyright ownership.         *
* The ASF licenses this file to You under the Apache License, Version 2.0     *
* (the "License"); you may not use this file except in compliance with        *
* the License.  You may obtain a copy of the License at                       *
*                                                                             *
*    http://www.apache.org/licenses/LICENSE-2.0                               *
*																			   *
* Unless required by applicable law or agreed to in writing, software         *
* distributed under the License is distributed on an "AS IS" BASIS,           *
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
* See the License for the specific language governing permissions and         *
* limitations under the License.											   *
*******************************************************************************/
    def apply/*18.2*/(workflows: List[metadata.Workflow], workflowForm: play.data.Form[metadata.Workflow]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*22.2*/scripts/*22.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.13*/("""
<script src='"""),_display_(Seq[Any](/*23.15*/routes/*23.21*/.Assets.at("javascripts/edit_button.js"))),format.raw/*23.61*/("""'></script>
<script type="text/javascript">
	$(document).ready(function()"""),format.raw/*25.30*/("""{"""),format.raw/*25.31*/("""

	"""),format.raw/*27.2*/("""}"""),format.raw/*27.3*/(""");
	</script>
""")))};
Seq[Any](format.raw/*18.87*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*29.2*/("""

"""),_display_(Seq[Any](/*31.2*/main("Workflows", scripts)/*31.28*/ {_display_(Seq[Any](format.raw/*31.30*/("""

"""),_display_(Seq[Any](/*33.2*/flash_message())),format.raw/*33.17*/("""

<h1>"""),_display_(Seq[Any](/*35.6*/workflows/*35.15*/.size())),format.raw/*35.22*/(""" Workflow List</h1>
<table class="table table-striped table-bordered table-condensed ex2 tablesorter" id = "csTable">
    <thead>
    <tr>
        <th class="col-md-2">Workflow ID</td>
        <th class="col-md-4">Workflow title</td>

    </tr>
    </thead>
    """),_display_(Seq[Any](/*44.6*/for(workflow <- workflows) yield /*44.32*/{_display_(Seq[Any](format.raw/*44.33*/("""
    <tr>
        <td><a href = "#"><font size="3">"""),_display_(Seq[Any](/*46.43*/workflow/*46.51*/.getId())),format.raw/*46.59*/("""</a></font></td>

        <td><span class=""""),_display_(Seq[Any](/*48.27*/workflow/*48.35*/.getTitle())),format.raw/*48.46*/(""" editable"  data-name='purpose'><font size="3">
            """),_display_(Seq[Any](/*49.14*/workflow/*49.22*/.getTitle())),format.raw/*49.33*/(""" </font></span></td>

    </tr>
    """)))})),format.raw/*52.6*/("""
</table>


""")))})),format.raw/*56.2*/("""
"""))}
    }
    
    def render(workflows:List[metadata.Workflow],workflowForm:play.data.Form[metadata.Workflow]): play.api.templates.HtmlFormat.Appendable = apply(workflows,workflowForm)
    
    def f:((List[metadata.Workflow],play.data.Form[metadata.Workflow]) => play.api.templates.HtmlFormat.Appendable) = (workflows,workflowForm) => apply(workflows,workflowForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Nov 18 16:29:24 EST 2015
                    SOURCE: /Users/zmhbh/Desktop/team/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/workflows.scala.html
                    HASH: e86d0fb3006a1923ad446d7f04b52090da805897
                    MATRIX: 3202->1189|3381->1295|3396->1302|3481->1306|3532->1321|3547->1327|3609->1367|3710->1440|3739->1441|3769->1444|3797->1445|3852->1274|3881->1293|3909->1460|3947->1463|3982->1489|4022->1491|4060->1494|4097->1509|4139->1516|4157->1525|4186->1532|4484->1795|4526->1821|4565->1822|4653->1874|4670->1882|4700->1890|4780->1934|4797->1942|4830->1953|4927->2014|4944->2022|4977->2033|5045->2070|5089->2083
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|78->35|78->35|78->35|87->44|87->44|87->44|89->46|89->46|89->46|91->48|91->48|91->48|92->49|92->49|92->49|95->52|99->56
                    -- GENERATED --
                */
            