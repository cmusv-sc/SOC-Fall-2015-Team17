
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
object tags extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[metadata.ClimateService],play.data.Form[metadata.ClimateService],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(climateServices: List[metadata.ClimateService], climateServiceForm: play.data.Form[metadata.ClimateService]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*22.2*/scripts/*22.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.13*/("""
	<script src='"""),_display_(Seq[Any](/*23.16*/routes/*23.22*/.Assets.at("javascripts/edit_button.js"))),format.raw/*23.62*/("""'></script>
	<script type="text/javascript">
	$(document).ready(function()"""),format.raw/*25.30*/("""{"""),format.raw/*25.31*/("""

	"""),format.raw/*27.2*/("""}"""),format.raw/*27.3*/(""");
	</script>
""")))};
Seq[Any](format.raw/*18.111*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*29.2*/("""

"""),_display_(Seq[Any](/*31.2*/main("Climate Services", scripts)/*31.35*/ {_display_(Seq[Any](format.raw/*31.37*/("""
	
	"""),_display_(Seq[Any](/*33.3*/flash_message())),format.raw/*33.18*/("""   
	 
    <h1>"""),_display_(Seq[Any](/*35.10*/climateServices/*35.25*/.size())),format.raw/*35.32*/(""" Climate Services</h1>
		<table class="table table-striped table-bordered table-condensed ex2 tablesorter" id = "csTable">
		<thead>
	<tr>
		<th class="col-md-2">Tag ID</td>
		<th class="col-md-4">Tag Name</td>
		
	</tr>
	</thead>
	"""),_display_(Seq[Any](/*44.3*/for(climateService <- climateServices) yield /*44.41*/{_display_(Seq[Any](format.raw/*44.42*/("""
	<tr>
		<td><a href = """"),_display_(Seq[Any](/*46.19*/{routes.TagController.oneService(climateService.getUrl())})),format.raw/*46.77*/(""""><font size="3">"""),_display_(Seq[Any](/*46.95*/climateService/*46.109*/.getClimateServiceName())),format.raw/*46.133*/("""</a></font></td>

		<td><span class=""""),_display_(Seq[Any](/*48.21*/climateService/*48.35*/.getClimateServiceName())),format.raw/*48.59*/(""" editable"  data-name='purpose'><font size="3">
				"""),_display_(Seq[Any](/*49.6*/climateService/*49.20*/.getPurpose())),format.raw/*49.33*/(""" </font></span></td>

	</tr>
	""")))})),format.raw/*52.3*/("""
    </table>
 
    
     """),_display_(Seq[Any](/*56.7*/if(false)/*56.16*/{_display_(Seq[Any](format.raw/*56.17*/("""
		    
	    """),_display_(Seq[Any](/*58.7*/form(routes.TagController.downloadClimateService(), 'class -> "form-horizontal", 'role -> "form")/*58.104*/ {_display_(Seq[Any](format.raw/*58.106*/("""
	
	        <button type="submit" name="action" value="download">Download</button>
	    """)))})),format.raw/*61.7*/("""
    """)))})),format.raw/*62.6*/("""
""")))})),format.raw/*63.2*/("""
"""))}
    }
    
    def render(climateServices:List[metadata.ClimateService],climateServiceForm:play.data.Form[metadata.ClimateService]): play.api.templates.HtmlFormat.Appendable = apply(climateServices,climateServiceForm)
    
    def f:((List[metadata.ClimateService],play.data.Form[metadata.ClimateService]) => play.api.templates.HtmlFormat.Appendable) = (climateServices,climateServiceForm) => apply(climateServices,climateServiceForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 05 13:11:41 PST 2015
                    SOURCE: /Users/zmhbh/Desktop/team/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/tags.scala.html
                    HASH: 83576871f1eafc808e1f466de680e4e61e5f6a76
                    MATRIX: 3239->1205|3442->1335|3457->1342|3542->1346|3594->1362|3609->1368|3671->1408|3773->1482|3802->1483|3832->1486|3860->1487|3916->1314|3945->1333|3973->1502|4011->1505|4053->1538|4093->1540|4133->1545|4170->1560|4222->1576|4246->1591|4275->1598|4543->1831|4597->1869|4636->1870|4697->1895|4777->1953|4831->1971|4855->1985|4902->2009|4976->2047|4999->2061|5045->2085|5133->2138|5156->2152|5191->2165|5253->2196|5315->2223|5333->2232|5372->2233|5421->2247|5528->2344|5569->2346|5689->2435|5726->2441|5759->2443
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|78->35|78->35|78->35|87->44|87->44|87->44|89->46|89->46|89->46|89->46|89->46|91->48|91->48|91->48|92->49|92->49|92->49|95->52|99->56|99->56|99->56|101->58|101->58|101->58|104->61|105->62|106->63
                    -- GENERATED --
                */
            