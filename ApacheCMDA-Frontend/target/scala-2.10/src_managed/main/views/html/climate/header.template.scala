
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
                                        class="dropdown-toggle" data-toggle="dropdown">Service<b
                        class="caret"></b></a>
                    <ul class="dropdown-menu">

                        <li><a href=""""),_display_(Seq[Any](/*41.39*/routes/*41.45*/.ClimateServiceController.climateServices())),format.raw/*41.88*/("""">Service List</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*42.39*/routes/*42.45*/.TagController.climateServices())),format.raw/*42.77*/("""">Tag List</a></li>
                    </ul>

                </li>
                <li class="dropdown"><a href="#"
                                        class="dropdown-toggle" data-toggle="dropdown">Dataset<b
                        class="caret"></b></a>
                    <ul class="dropdown-menu">

                        <li><a href=""""),_display_(Seq[Any](/*51.39*/routes/*51.45*/.DatasetController.datasetList())),format.raw/*51.77*/("""">Dataset List</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*52.39*/routes/*52.45*/.DatasetController.searchDataset())),format.raw/*52.79*/("""">Search dataset</a></li>
                    </ul>
                </li>
                """),format.raw/*56.52*/("""
                                        """),format.raw/*57.101*/("""
                    """),format.raw/*58.47*/("""
                    """),format.raw/*60.49*/("""
                        """),format.raw/*63.27*/("""
                        """),format.raw/*66.27*/("""
                        """),format.raw/*69.23*/("""
                    """),format.raw/*72.19*/("""

                <li class="dropdown"><a href="#"
                                        class="dropdown-toggle" data-toggle="dropdown">About<b
                        class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href=""""),_display_(Seq[Any](/*78.39*/routes/*78.45*/.ClimateServiceController.home())),format.raw/*78.77*/("""">Home</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*79.39*/routes/*79.45*/.AboutusController.aboutUs())),format.raw/*79.73*/("""">About Us</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*80.39*/routes/*80.45*/.AboutusController.aboutProject())),format.raw/*80.78*/("""">About project</a></li>
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
                    DATE: Thu Nov 05 13:08:32 PST 2015
                    SOURCE: /Users/zmhbh/Desktop/team/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/header.scala.html
                    HASH: f6222b6e7aa0384188000d1dcbdd93b2a72d6475
                    MATRIX: 3339->1288|3435->1290|4066->1885|4081->1891|4141->1929|4276->2028|4291->2034|4342->2063|4832->2517|4847->2523|4912->2566|5010->2628|5025->2634|5079->2666|5463->3014|5478->3020|5532->3052|5630->3114|5645->3120|5701->3154|5819->3298|5889->3399|5938->3446|5987->3518|6040->3686|6093->3859|6146->3935|6195->3999|6509->4277|6524->4283|6578->4315|6668->4369|6683->4375|6733->4403|6827->4461|6842->4467|6897->4500
                    LINES: 56->18|59->18|70->29|70->29|70->29|72->31|72->31|72->31|82->41|82->41|82->41|83->42|83->42|83->42|92->51|92->51|92->51|93->52|93->52|93->52|96->56|97->57|98->58|99->60|100->63|101->66|102->69|103->72|109->78|109->78|109->78|110->79|110->79|110->79|111->80|111->80|111->80
                    -- GENERATED --
                */
            