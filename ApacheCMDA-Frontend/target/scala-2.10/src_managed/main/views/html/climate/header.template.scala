
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
* Licensed to the Apache Software Foundation (ASF) under one or more           *
* contributor license agreements.  See the NOTICE file distributed with       *
* this work for additional information regarding copyright ownership.         *
* The ASF licenses this file to You under the Apache License, Version 2.0     *
* (the "License"); you may not use this file except in compliance with        *
* the License.  You may obtain a copy of the License at                       *
*                                                                             *
*    http://www.apache.org/licenses/LICENSE-2.0                               *
*                                                                               *
* Unless required by applicable law or agreed to in writing, software         *
* distributed under the License is distributed on an "AS IS" BASIS,           *
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
* See the License for the specific language governing permissions and         *
* limitations under the License.                                               *
*******************************************************************************/
object header extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /*******************************************************************************
* Licensed to the Apache Software Foundation (ASF) under one or more           *
* contributor license agreements.  See the NOTICE file distributed with       *
* this work for additional information regarding copyright ownership.         *
* The ASF licenses this file to You under the Apache License, Version 2.0     *
* (the "License"); you may not use this file except in compliance with        *
* the License.  You may obtain a copy of the License at                       *
*                                                                             *
*    http://www.apache.org/licenses/LICENSE-2.0                               *
*                                                                               *
* Unless required by applicable law or agreed to in writing, software         *
* distributed under the License is distributed on an "AS IS" BASIS,           *
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
* See the License for the specific language governing permissions and         *
* limitations under the License.                                               *
*******************************************************************************/
    def apply/*18.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*18.4*/("""
<div class="navbar navbar-default navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span> <span
                    class="icon-bar"></span> <span class="icon-bar"></span> <span
                    class="icon-bar"></span>
            </button>
            <a class="navbar-brand" style="padding-bottom: 0;" href="/climate"><img
                    src='"""),_display_(Seq[Any](/*29.27*/routes/*29.33*/.Assets.at("images/NASA_JPL_logo.png"))),format.raw/*29.71*/("""'
                    style="height: 40px; width: 220px;">&nbsp&nbsp<img
                    src='"""),_display_(Seq[Any](/*31.27*/routes/*31.33*/.Assets.at("images/logo.png"))),format.raw/*31.62*/("""' style="height: 15px; width: 250px;"></a>
        </div>
        <div class="navbar-collapse collapse" style="height:">
            <ul class="nav navbar-nav navbar-right">

                <li class="dropdown"><a href="#"
                                        class="dropdown-toggle" data-toggle="dropdown">Workflow<b
                        class="caret"></b></a>
                    <ul class="dropdown-menu">

                        <li><a href=""""),_display_(Seq[Any](/*41.39*/routes/*41.45*/.WorkflowController.workflows())),format.raw/*41.76*/("""">Workflow List</a></li>
						<li><a href=""""),_display_(Seq[Any](/*42.21*/routes/*42.27*/.TagController.tagCloud())),format.raw/*42.52*/("""">Tag Cloud</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*43.39*/routes/*43.45*/.TagController.tags())),format.raw/*43.66*/("""">Tag List</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*44.39*/routes/*44.45*/.WorkflowController.createWorkflow())),format.raw/*44.81*/("""">Create Workflow</a></li>
                    </ul>

                </li>


                <li class="dropdown"><a href="#"
                                        class="dropdown-toggle" data-toggle="dropdown">Service<b
                        class="caret"></b></a>
                    <ul class="dropdown-menu">

                        <li><a href=""""),_display_(Seq[Any](/*55.39*/routes/*55.45*/.ClimateServiceController.climateServices())),format.raw/*55.88*/("""">Service List</a></li>
                    </ul>

                </li>
                <li class="dropdown"><a href="#"
                                        class="dropdown-toggle" data-toggle="dropdown">Dataset<b
                        class="caret"></b></a>
                    <ul class="dropdown-menu">

                        <li><a href=""""),_display_(Seq[Any](/*64.39*/routes/*64.45*/.DatasetController.datasetList())),format.raw/*64.77*/("""">Dataset List</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*65.39*/routes/*65.45*/.DatasetController.searchDataset())),format.raw/*65.79*/("""">Search dataset</a></li>
                    </ul>
                </li>
                """),format.raw/*69.52*/("""
                                        """),format.raw/*70.101*/("""
                    """),format.raw/*71.47*/("""
                    """),format.raw/*73.49*/("""
                        """),format.raw/*76.27*/("""
                        """),format.raw/*79.27*/("""
                        """),format.raw/*82.23*/("""
                    """),format.raw/*85.19*/("""

                <li class="dropdown"><a href="#"
                                        class="dropdown-toggle" data-toggle="dropdown">About<b
                        class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href=""""),_display_(Seq[Any](/*91.39*/routes/*91.45*/.ClimateServiceController.home())),format.raw/*91.77*/("""">Home</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*92.39*/routes/*92.45*/.AboutusController.aboutUs())),format.raw/*92.73*/("""">About Us</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*93.39*/routes/*93.45*/.AboutusController.aboutProject())),format.raw/*93.78*/("""">About project</a></li>
                    </ul>
                </li>

            </ul>
        </div>
        <!--/.nav-collapse -->
    </div>
</div>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 03 12:21:30 PST 2015
                    SOURCE: /Users/Holysoul/Desktop/SOC-Fall-2015-Team17-Lead-Runyu-Shi/ApacheCMDA-Frontend/app/views/climate/header.scala.html
                    HASH: 77dbe00a7c04fd7821a8e7fadbae10bfd007caea
                    MATRIX: 3339->1288|3435->1290|4066->1885|4081->1891|4141->1929|4276->2028|4291->2034|4342->2063|4833->2518|4848->2524|4901->2555|4982->2600|4997->2606|5044->2631|5139->2690|5154->2696|5197->2717|5291->2775|5306->2781|5364->2817|5757->3174|5772->3180|5837->3223|6225->3575|6240->3581|6294->3613|6392->3675|6407->3681|6463->3715|6581->3859|6651->3960|6700->4007|6749->4079|6802->4247|6855->4420|6908->4496|6957->4560|7271->4838|7286->4844|7340->4876|7430->4930|7445->4936|7495->4964|7589->5022|7604->5028|7659->5061
                    LINES: 56->18|59->18|70->29|70->29|70->29|72->31|72->31|72->31|82->41|82->41|82->41|83->42|83->42|83->42|84->43|84->43|84->43|85->44|85->44|85->44|96->55|96->55|96->55|105->64|105->64|105->64|106->65|106->65|106->65|109->69|110->70|111->71|112->73|113->76|114->79|115->82|116->85|122->91|122->91|122->91|123->92|123->92|123->92|124->93|124->93|124->93
                    -- GENERATED --
                */
            