
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
                        <li><a href=""""),_display_(Seq[Any](/*42.39*/routes/*42.45*/.TagController.tags())),format.raw/*42.66*/("""">Tag List</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*43.39*/routes/*43.45*/.WorkflowController.createWorkflow())),format.raw/*43.81*/("""">Create Workflow</a></li>
                    </ul>

                </li>


                <li class="dropdown"><a href="#"
                                        class="dropdown-toggle" data-toggle="dropdown">Service<b
                        class="caret"></b></a>
                    <ul class="dropdown-menu">

                        <li><a href=""""),_display_(Seq[Any](/*54.39*/routes/*54.45*/.ClimateServiceController.climateServices())),format.raw/*54.88*/("""">Service List</a></li>
                    </ul>

                </li>
                <li class="dropdown"><a href="#"
                                        class="dropdown-toggle" data-toggle="dropdown">Dataset<b
                        class="caret"></b></a>
                    <ul class="dropdown-menu">

                        <li><a href=""""),_display_(Seq[Any](/*63.39*/routes/*63.45*/.DatasetController.datasetList())),format.raw/*63.77*/("""">Dataset List</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*64.39*/routes/*64.45*/.DatasetController.searchDataset())),format.raw/*64.79*/("""">Search dataset</a></li>
                    </ul>
                </li>
                """),format.raw/*68.52*/("""
                                        """),format.raw/*69.101*/("""
                    """),format.raw/*70.47*/("""
                    """),format.raw/*72.49*/("""
                        """),format.raw/*75.27*/("""
                        """),format.raw/*78.27*/("""
                        """),format.raw/*81.23*/("""
                    """),format.raw/*84.19*/("""

                <li class="dropdown"><a href="#"
                                        class="dropdown-toggle" data-toggle="dropdown">About<b
                        class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href=""""),_display_(Seq[Any](/*90.39*/routes/*90.45*/.ClimateServiceController.home())),format.raw/*90.77*/("""">Home</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*91.39*/routes/*91.45*/.AboutusController.aboutUs())),format.raw/*91.73*/("""">About Us</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*92.39*/routes/*92.45*/.AboutusController.aboutProject())),format.raw/*92.78*/("""">About project</a></li>
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
                    DATE: Fri Nov 20 14:14:35 PST 2015
                    SOURCE: /Users/Ethan/Desktop/team/SOC-Fall-2015-Team17-Lead-Runyu-Shi/ApacheCMDA-Frontend/app/views/climate/header.scala.html
                    HASH: 027cb474834fb3b1c494361f0d9c45b335c49749
                    MATRIX: 3339->1288|3435->1290|4066->1885|4081->1891|4141->1929|4276->2028|4291->2034|4342->2063|4833->2518|4848->2524|4901->2555|5000->2618|5015->2624|5058->2645|5152->2703|5167->2709|5225->2745|5618->3102|5633->3108|5698->3151|6086->3503|6101->3509|6155->3541|6253->3603|6268->3609|6324->3643|6442->3787|6512->3888|6561->3935|6610->4007|6663->4175|6716->4348|6769->4424|6818->4488|7132->4766|7147->4772|7201->4804|7291->4858|7306->4864|7356->4892|7450->4950|7465->4956|7520->4989
                    LINES: 56->18|59->18|70->29|70->29|70->29|72->31|72->31|72->31|82->41|82->41|82->41|83->42|83->42|83->42|84->43|84->43|84->43|95->54|95->54|95->54|104->63|104->63|104->63|105->64|105->64|105->64|108->68|109->69|110->70|111->72|112->75|113->78|114->81|115->84|121->90|121->90|121->90|122->91|122->91|122->91|123->92|123->92|123->92
                    -- GENERATED --
                */
            