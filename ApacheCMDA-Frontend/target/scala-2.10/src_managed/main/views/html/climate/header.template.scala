
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
                        <li><a href=""""),_display_(Seq[Any](/*42.39*/routes/*42.45*/.TagController.tags())),format.raw/*42.66*/("""">Tag List</a></li>
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
                    DATE: Thu Nov 05 14:18:05 PST 2015
                    SOURCE: /Users/zmhbh/Desktop/team/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/header.scala.html
                    HASH: 967c76223218119c5c19f98f52e05330e5ce5fcc
                    MATRIX: 3339->1288|3435->1290|4066->1885|4081->1891|4141->1929|4276->2028|4291->2034|4342->2063|4832->2517|4847->2523|4912->2566|5010->2628|5025->2634|5068->2655|5452->3003|5467->3009|5521->3041|5619->3103|5634->3109|5690->3143|5808->3287|5878->3388|5927->3435|5976->3507|6029->3675|6082->3848|6135->3924|6184->3988|6498->4266|6513->4272|6567->4304|6657->4358|6672->4364|6722->4392|6816->4450|6831->4456|6886->4489
                    LINES: 56->18|59->18|70->29|70->29|70->29|72->31|72->31|72->31|82->41|82->41|82->41|83->42|83->42|83->42|92->51|92->51|92->51|93->52|93->52|93->52|96->56|97->57|98->58|99->60|100->63|101->66|102->69|103->72|109->78|109->78|109->78|110->79|110->79|110->79|111->80|111->80|111->80
                    -- GENERATED --
                */
            