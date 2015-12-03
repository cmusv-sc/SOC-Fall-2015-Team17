
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

    var word_list=[];
    $.get("http://localhost:9034/tag/getTagWeight", function(data, status)"""),format.raw/*11.75*/("""{"""),format.raw/*11.76*/("""
        word_list=data;
        """),format.raw/*13.9*/("""}"""),format.raw/*13.10*/(""");
        
        var word_list = [
          """),format.raw/*16.11*/("""{"""),format.raw/*16.12*/("""text: "Lorem", weight: 13"""),format.raw/*16.37*/("""}"""),format.raw/*16.38*/(""",
          """),format.raw/*17.11*/("""{"""),format.raw/*17.12*/("""text: "Ipsum", weight: 10.5"""),format.raw/*17.39*/("""}"""),format.raw/*17.40*/(""",
          """),format.raw/*18.11*/("""{"""),format.raw/*18.12*/("""text: "Dolor", weight: 9.4"""),format.raw/*18.38*/("""}"""),format.raw/*18.39*/(""",
          """),format.raw/*19.11*/("""{"""),format.raw/*19.12*/("""text: "Sit", weight: 8"""),format.raw/*19.34*/("""}"""),format.raw/*19.35*/(""",
          """),format.raw/*20.11*/("""{"""),format.raw/*20.12*/("""text: "Amet", weight: 6.2"""),format.raw/*20.37*/("""}"""),format.raw/*20.38*/(""",
          """),format.raw/*21.11*/("""{"""),format.raw/*21.12*/("""text: "Consectetur", weight: 5"""),format.raw/*21.42*/("""}"""),format.raw/*21.43*/(""",
          """),format.raw/*22.11*/("""{"""),format.raw/*22.12*/("""text: "Adipiscing", weight: 5"""),format.raw/*22.41*/("""}"""),format.raw/*22.42*/(""",
          """),format.raw/*23.11*/("""{"""),format.raw/*23.12*/("""text: "Elit", weight: 5"""),format.raw/*23.35*/("""}"""),format.raw/*23.36*/(""",
          """),format.raw/*24.11*/("""{"""),format.raw/*24.12*/("""text: "Nam et", weight: 5"""),format.raw/*24.37*/("""}"""),format.raw/*24.38*/(""",
          """),format.raw/*25.11*/("""{"""),format.raw/*25.12*/("""text: "Leo", weight: 4"""),format.raw/*25.34*/("""}"""),format.raw/*25.35*/(""",
          """),format.raw/*26.11*/("""{"""),format.raw/*26.12*/("""text: "Sapien", weight: 4"""),format.raw/*26.37*/("""}"""),format.raw/*26.38*/(""",
          """),format.raw/*27.11*/("""{"""),format.raw/*27.12*/("""text: "Pellentesque", weight: 3"""),format.raw/*27.43*/("""}"""),format.raw/*27.44*/(""",
          """),format.raw/*28.11*/("""{"""),format.raw/*28.12*/("""text: "habitant", weight: 3"""),format.raw/*28.39*/("""}"""),format.raw/*28.40*/(""",
          """),format.raw/*29.11*/("""{"""),format.raw/*29.12*/("""text: "morbi", weight: 3"""),format.raw/*29.36*/("""}"""),format.raw/*29.37*/(""",
          """),format.raw/*30.11*/("""{"""),format.raw/*30.12*/("""text: "tristisque", weight: 3"""),format.raw/*30.41*/("""}"""),format.raw/*30.42*/(""",
          """),format.raw/*31.11*/("""{"""),format.raw/*31.12*/("""text: "senectus", weight: 3"""),format.raw/*31.39*/("""}"""),format.raw/*31.40*/(""",
          """),format.raw/*32.11*/("""{"""),format.raw/*32.12*/("""text: "et netus", weight: 3"""),format.raw/*32.39*/("""}"""),format.raw/*32.40*/(""",
          """),format.raw/*33.11*/("""{"""),format.raw/*33.12*/("""text: "et malesuada", weight: 3"""),format.raw/*33.43*/("""}"""),format.raw/*33.44*/(""",
          """),format.raw/*34.11*/("""{"""),format.raw/*34.12*/("""text: "fames", weight: 2"""),format.raw/*34.36*/("""}"""),format.raw/*34.37*/(""",
          """),format.raw/*35.11*/("""{"""),format.raw/*35.12*/("""text: "ac turpis", weight: 2"""),format.raw/*35.40*/("""}"""),format.raw/*35.41*/(""",
          """),format.raw/*36.11*/("""{"""),format.raw/*36.12*/("""text: "egestas", weight: 2"""),format.raw/*36.38*/("""}"""),format.raw/*36.39*/(""",
          """),format.raw/*37.11*/("""{"""),format.raw/*37.12*/("""text: "Aenean", weight: 2"""),format.raw/*37.37*/("""}"""),format.raw/*37.38*/(""",
          """),format.raw/*38.11*/("""{"""),format.raw/*38.12*/("""text: "vestibulum", weight: 2"""),format.raw/*38.41*/("""}"""),format.raw/*38.42*/(""",
          """),format.raw/*39.11*/("""{"""),format.raw/*39.12*/("""text: "elit", weight: 2"""),format.raw/*39.35*/("""}"""),format.raw/*39.36*/(""",
          """),format.raw/*40.11*/("""{"""),format.raw/*40.12*/("""text: "sit amet", weight: 2"""),format.raw/*40.39*/("""}"""),format.raw/*40.40*/(""",
          """),format.raw/*41.11*/("""{"""),format.raw/*41.12*/("""text: "metus", weight: 2"""),format.raw/*41.36*/("""}"""),format.raw/*41.37*/(""",
          """),format.raw/*42.11*/("""{"""),format.raw/*42.12*/("""text: "adipiscing", weight: 2"""),format.raw/*42.41*/("""}"""),format.raw/*42.42*/(""",
          """),format.raw/*43.11*/("""{"""),format.raw/*43.12*/("""text: "ut ultrices", weight: 2"""),format.raw/*43.42*/("""}"""),format.raw/*43.43*/(""",
          """),format.raw/*44.11*/("""{"""),format.raw/*44.12*/("""text: "justo", weight: 1"""),format.raw/*44.36*/("""}"""),format.raw/*44.37*/(""",
          """),format.raw/*45.11*/("""{"""),format.raw/*45.12*/("""text: "dictum", weight: 1"""),format.raw/*45.37*/("""}"""),format.raw/*45.38*/(""",
          """),format.raw/*46.11*/("""{"""),format.raw/*46.12*/("""text: "Ut et leo", weight: 1"""),format.raw/*46.40*/("""}"""),format.raw/*46.41*/(""",
          """),format.raw/*47.11*/("""{"""),format.raw/*47.12*/("""text: "metus", weight: 1"""),format.raw/*47.36*/("""}"""),format.raw/*47.37*/(""",
          """),format.raw/*48.11*/("""{"""),format.raw/*48.12*/("""text: "at molestie", weight: 1"""),format.raw/*48.42*/("""}"""),format.raw/*48.43*/(""",
          """),format.raw/*49.11*/("""{"""),format.raw/*49.12*/("""text: "purus", weight: 1"""),format.raw/*49.36*/("""}"""),format.raw/*49.37*/(""",
          """),format.raw/*50.11*/("""{"""),format.raw/*50.12*/("""text: "Curabitur", weight: 1"""),format.raw/*50.40*/("""}"""),format.raw/*50.41*/(""",
          """),format.raw/*51.11*/("""{"""),format.raw/*51.12*/("""text: "diam", weight: 1"""),format.raw/*51.35*/("""}"""),format.raw/*51.36*/(""",
          """),format.raw/*52.11*/("""{"""),format.raw/*52.12*/("""text: "dui", weight: 1"""),format.raw/*52.34*/("""}"""),format.raw/*52.35*/(""",
          """),format.raw/*53.11*/("""{"""),format.raw/*53.12*/("""text: "ullamcorper", weight: 1"""),format.raw/*53.42*/("""}"""),format.raw/*53.43*/(""",
          """),format.raw/*54.11*/("""{"""),format.raw/*54.12*/("""text: "id vuluptate ut", weight: 1"""),format.raw/*54.46*/("""}"""),format.raw/*54.47*/(""",
          """),format.raw/*55.11*/("""{"""),format.raw/*55.12*/("""text: "mattis", weight: 1"""),format.raw/*55.37*/("""}"""),format.raw/*55.38*/(""",
          """),format.raw/*56.11*/("""{"""),format.raw/*56.12*/("""text: "et nulla", weight: 1"""),format.raw/*56.39*/("""}"""),format.raw/*56.40*/(""",
          """),format.raw/*57.11*/("""{"""),format.raw/*57.12*/("""text: "Sed", weight: 1"""),format.raw/*57.34*/("""}"""),format.raw/*57.35*/("""
        ];
        $(function() """),format.raw/*59.22*/("""{"""),format.raw/*59.23*/("""
          $("#my_favorite_latin_words").jQCloud(word_list);
        """),format.raw/*61.9*/("""}"""),format.raw/*61.10*/(""");

    </script>
</head>
<body>
"""),format.raw/*68.3*/("""
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
                    DATE: Thu Dec 03 13:24:05 PST 2015
                    SOURCE: /Users/zmhbh/Desktop/team-new/SOC-Fall-2015-Team17-Lead-Runyu-Shi/ApacheCMDA-Frontend/app/views/climate/tagCloud.scala.html
                    HASH: b2d6fad3df6375e1014235097b7f8a20df98705a
                    MATRIX: 866->0|1371->477|1400->478|1460->511|1489->512|1565->560|1594->561|1647->586|1676->587|1716->599|1745->600|1800->627|1829->628|1869->640|1898->641|1952->667|1981->668|2021->680|2050->681|2100->703|2129->704|2169->716|2198->717|2251->742|2280->743|2320->755|2349->756|2407->786|2436->787|2476->799|2505->800|2562->829|2591->830|2631->842|2660->843|2711->866|2740->867|2780->879|2809->880|2862->905|2891->906|2931->918|2960->919|3010->941|3039->942|3079->954|3108->955|3161->980|3190->981|3230->993|3259->994|3318->1025|3347->1026|3387->1038|3416->1039|3471->1066|3500->1067|3540->1079|3569->1080|3621->1104|3650->1105|3690->1117|3719->1118|3776->1147|3805->1148|3845->1160|3874->1161|3929->1188|3958->1189|3998->1201|4027->1202|4082->1229|4111->1230|4151->1242|4180->1243|4239->1274|4268->1275|4308->1287|4337->1288|4389->1312|4418->1313|4458->1325|4487->1326|4543->1354|4572->1355|4612->1367|4641->1368|4695->1394|4724->1395|4764->1407|4793->1408|4846->1433|4875->1434|4915->1446|4944->1447|5001->1476|5030->1477|5070->1489|5099->1490|5150->1513|5179->1514|5219->1526|5248->1527|5303->1554|5332->1555|5372->1567|5401->1568|5453->1592|5482->1593|5522->1605|5551->1606|5608->1635|5637->1636|5677->1648|5706->1649|5764->1679|5793->1680|5833->1692|5862->1693|5914->1717|5943->1718|5983->1730|6012->1731|6065->1756|6094->1757|6134->1769|6163->1770|6219->1798|6248->1799|6288->1811|6317->1812|6369->1836|6398->1837|6438->1849|6467->1850|6525->1880|6554->1881|6594->1893|6623->1894|6675->1918|6704->1919|6744->1931|6773->1932|6829->1960|6858->1961|6898->1973|6927->1974|6978->1997|7007->1998|7047->2010|7076->2011|7126->2033|7155->2034|7195->2046|7224->2047|7282->2077|7311->2078|7351->2090|7380->2091|7442->2125|7471->2126|7511->2138|7540->2139|7593->2164|7622->2165|7662->2177|7691->2178|7746->2205|7775->2206|7815->2218|7844->2219|7894->2241|7923->2242|7984->2275|8013->2276|8109->2345|8138->2346|8198->2403
                    LINES: 29->1|39->11|39->11|41->13|41->13|44->16|44->16|44->16|44->16|45->17|45->17|45->17|45->17|46->18|46->18|46->18|46->18|47->19|47->19|47->19|47->19|48->20|48->20|48->20|48->20|49->21|49->21|49->21|49->21|50->22|50->22|50->22|50->22|51->23|51->23|51->23|51->23|52->24|52->24|52->24|52->24|53->25|53->25|53->25|53->25|54->26|54->26|54->26|54->26|55->27|55->27|55->27|55->27|56->28|56->28|56->28|56->28|57->29|57->29|57->29|57->29|58->30|58->30|58->30|58->30|59->31|59->31|59->31|59->31|60->32|60->32|60->32|60->32|61->33|61->33|61->33|61->33|62->34|62->34|62->34|62->34|63->35|63->35|63->35|63->35|64->36|64->36|64->36|64->36|65->37|65->37|65->37|65->37|66->38|66->38|66->38|66->38|67->39|67->39|67->39|67->39|68->40|68->40|68->40|68->40|69->41|69->41|69->41|69->41|70->42|70->42|70->42|70->42|71->43|71->43|71->43|71->43|72->44|72->44|72->44|72->44|73->45|73->45|73->45|73->45|74->46|74->46|74->46|74->46|75->47|75->47|75->47|75->47|76->48|76->48|76->48|76->48|77->49|77->49|77->49|77->49|78->50|78->50|78->50|78->50|79->51|79->51|79->51|79->51|80->52|80->52|80->52|80->52|81->53|81->53|81->53|81->53|82->54|82->54|82->54|82->54|83->55|83->55|83->55|83->55|84->56|84->56|84->56|84->56|85->57|85->57|85->57|85->57|87->59|87->59|89->61|89->61|94->68
                    -- GENERATED --
                */
            