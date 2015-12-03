
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
                        <li><a href=""""),_display_(Seq[Any](/*45.39*/routes/*45.45*/.WorkflowController.workflowsByTopViewCount())),format.raw/*45.90*/("""">Workflow Popularity</a></li>
                    </ul>

                </li>


                <li class="dropdown"><a href="#"
                                        class="dropdown-toggle" data-toggle="dropdown">Service<b
                        class="caret"></b></a>
                    <ul class="dropdown-menu">

                        <li><a href=""""),_display_(Seq[Any](/*56.39*/routes/*56.45*/.ClimateServiceController.climateServices())),format.raw/*56.88*/("""">Service List</a></li>
                    </ul>

                </li>
                <li class="dropdown"><a href="#"
                                        class="dropdown-toggle" data-toggle="dropdown">Dataset<b
                        class="caret"></b></a>
                    <ul class="dropdown-menu">

                        <li><a href=""""),_display_(Seq[Any](/*65.39*/routes/*65.45*/.DatasetController.datasetList())),format.raw/*65.77*/("""">Dataset List</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*66.39*/routes/*66.45*/.DatasetController.searchDataset())),format.raw/*66.79*/("""">Search dataset</a></li>
                    </ul>
                </li>
                """),format.raw/*70.52*/("""
                                        """),format.raw/*71.101*/("""
                    """),format.raw/*72.47*/("""
                    """),format.raw/*74.49*/("""
                        """),format.raw/*77.27*/("""
                        """),format.raw/*80.27*/("""
                        """),format.raw/*83.23*/("""
                    """),format.raw/*86.19*/("""

                <li class="dropdown"><a href="#"
                                        class="dropdown-toggle" data-toggle="dropdown">About<b
                        class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href=""""),_display_(Seq[Any](/*92.39*/routes/*92.45*/.ClimateServiceController.home())),format.raw/*92.77*/("""">Home</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*93.39*/routes/*93.45*/.AboutusController.aboutUs())),format.raw/*93.73*/("""">About Us</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*94.39*/routes/*94.45*/.AboutusController.aboutProject())),format.raw/*94.78*/("""">About project</a></li>
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
                    DATE: Thu Dec 03 14:07:59 PST 2015
                    SOURCE: /Users/zmhbh/Desktop/team-new/SOC-Fall-2015-Team17-Lead-Runyu-Shi/ApacheCMDA-Frontend/app/views/climate/header.scala.html
                    HASH: ea1cdc08e65302b99fd8577327816b7cec24169c
                    MATRIX: 3339->1288|3435->1290|4066->1885|4081->1891|4141->1929|4276->2028|4291->2034|4342->2063|4833->2518|4848->2524|4901->2555|4982->2600|4997->2606|5044->2631|5139->2690|5154->2696|5197->2717|5291->2775|5306->2781|5364->2817|5465->2882|5480->2888|5547->2933|5944->3294|5959->3300|6024->3343|6412->3695|6427->3701|6481->3733|6579->3795|6594->3801|6650->3835|6768->3979|6838->4080|6887->4127|6936->4199|6989->4367|7042->4540|7095->4616|7144->4680|7458->4958|7473->4964|7527->4996|7617->5050|7632->5056|7682->5084|7776->5142|7791->5148|7846->5181
                    LINES: 56->18|59->18|70->29|70->29|70->29|72->31|72->31|72->31|82->41|82->41|82->41|83->42|83->42|83->42|84->43|84->43|84->43|85->44|85->44|85->44|86->45|86->45|86->45|97->56|97->56|97->56|106->65|106->65|106->65|107->66|107->66|107->66|110->70|111->71|112->72|113->74|114->77|115->80|116->83|117->86|123->92|123->92|123->92|124->93|124->93|124->93|125->94|125->94|125->94
                    -- GENERATED --
                */
            