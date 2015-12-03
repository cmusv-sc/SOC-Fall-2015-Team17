
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
object tagCloud extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <title>Tag Cloud</title>
    <link rel="stylesheet" type="text/css" href="/assets/jqcloud/jqcloud.css"/>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.js"></script>
    <script type="text/javascript" src="/assets/jqcloud/jqcloud-1.0.4.js"></script>
    <script type="text/javascript">


    $.getJSON("http://localhost:9034/tag/getAllTagWeights/json", function(data, status)"""),format.raw/*11.88*/("""{"""),format.raw/*11.89*/("""
    $(function() """),format.raw/*12.18*/("""{"""),format.raw/*12.19*/("""
          $("#my_favorite_latin_words").jQCloud(data);
        """),format.raw/*14.9*/("""}"""),format.raw/*14.10*/(""");
    """),format.raw/*15.5*/("""}"""),format.raw/*15.6*/(""");




    </script>
</head>
<body>
"""),format.raw/*25.3*/("""
<div align="center">
    <h2 class="text-center">Tag Cloud</h2>


    <div id="my_favorite_latin_words" style="width: 550px; height: 350px; border: 1px solid #ccc;"></div>
</div>

</body>


</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 03 15:01:19 PST 2015
                    SOURCE: /Users/zmhbh/Desktop/team-new/SOC-Fall-2015-Team17-Lead-Runyu-Shi/ApacheCMDA-Frontend/app/views/climate/tagCloud.scala.html
                    HASH: 429870a6db25b63da092d6879fd10aa8f5dcda80
                    MATRIX: 866->0|1363->469|1392->470|1438->488|1467->489|1558->553|1587->554|1621->561|1649->562|1712->622
                    LINES: 29->1|39->11|39->11|40->12|40->12|42->14|42->14|43->15|43->15|51->25
                    -- GENERATED --
                */
            