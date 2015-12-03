
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
                    DATE: Thu Dec 03 14:07:59 PST 2015
                    SOURCE: /Users/zmhbh/Desktop/team-new/SOC-Fall-2015-Team17-Lead-Runyu-Shi/ApacheCMDA-Frontend/app/views/climate/tagCloud.scala.html
                    HASH: d3492554a2244df286f47bff27410382a5345043
                    MATRIX: 866->0|1371->477|1400->478|1460->511|1489->512|1557->552|1586->553|1639->578|1668->579|1708->591|1737->592|1792->619|1821->620|1861->632|1890->633|1944->659|1973->660|2013->672|2042->673|2092->695|2121->696|2161->708|2190->709|2243->734|2272->735|2312->747|2341->748|2399->778|2428->779|2468->791|2497->792|2554->821|2583->822|2623->834|2652->835|2703->858|2732->859|2772->871|2801->872|2854->897|2883->898|2923->910|2952->911|3002->933|3031->934|3071->946|3100->947|3153->972|3182->973|3222->985|3251->986|3310->1017|3339->1018|3379->1030|3408->1031|3463->1058|3492->1059|3532->1071|3561->1072|3613->1096|3642->1097|3682->1109|3711->1110|3768->1139|3797->1140|3837->1152|3866->1153|3921->1180|3950->1181|3990->1193|4019->1194|4074->1221|4103->1222|4143->1234|4172->1235|4231->1266|4260->1267|4300->1279|4329->1280|4381->1304|4410->1305|4450->1317|4479->1318|4535->1346|4564->1347|4604->1359|4633->1360|4687->1386|4716->1387|4756->1399|4785->1400|4838->1425|4867->1426|4907->1438|4936->1439|4993->1468|5022->1469|5062->1481|5091->1482|5142->1505|5171->1506|5211->1518|5240->1519|5295->1546|5324->1547|5364->1559|5393->1560|5445->1584|5474->1585|5514->1597|5543->1598|5600->1627|5629->1628|5669->1640|5698->1641|5756->1671|5785->1672|5825->1684|5854->1685|5906->1709|5935->1710|5975->1722|6004->1723|6057->1748|6086->1749|6126->1761|6155->1762|6211->1790|6240->1791|6280->1803|6309->1804|6361->1828|6390->1829|6430->1841|6459->1842|6517->1872|6546->1873|6586->1885|6615->1886|6667->1910|6696->1911|6736->1923|6765->1924|6821->1952|6850->1953|6890->1965|6919->1966|6970->1989|6999->1990|7039->2002|7068->2003|7118->2025|7147->2026|7187->2038|7216->2039|7274->2069|7303->2070|7343->2082|7372->2083|7434->2117|7463->2118|7503->2130|7532->2131|7585->2156|7614->2157|7654->2169|7683->2170|7738->2197|7767->2198|7807->2210|7836->2211|7886->2233|7915->2234|7976->2267|8005->2268|8101->2337|8130->2338|8190->2395
                    LINES: 29->1|39->11|39->11|41->13|41->13|44->16|44->16|44->16|44->16|45->17|45->17|45->17|45->17|46->18|46->18|46->18|46->18|47->19|47->19|47->19|47->19|48->20|48->20|48->20|48->20|49->21|49->21|49->21|49->21|50->22|50->22|50->22|50->22|51->23|51->23|51->23|51->23|52->24|52->24|52->24|52->24|53->25|53->25|53->25|53->25|54->26|54->26|54->26|54->26|55->27|55->27|55->27|55->27|56->28|56->28|56->28|56->28|57->29|57->29|57->29|57->29|58->30|58->30|58->30|58->30|59->31|59->31|59->31|59->31|60->32|60->32|60->32|60->32|61->33|61->33|61->33|61->33|62->34|62->34|62->34|62->34|63->35|63->35|63->35|63->35|64->36|64->36|64->36|64->36|65->37|65->37|65->37|65->37|66->38|66->38|66->38|66->38|67->39|67->39|67->39|67->39|68->40|68->40|68->40|68->40|69->41|69->41|69->41|69->41|70->42|70->42|70->42|70->42|71->43|71->43|71->43|71->43|72->44|72->44|72->44|72->44|73->45|73->45|73->45|73->45|74->46|74->46|74->46|74->46|75->47|75->47|75->47|75->47|76->48|76->48|76->48|76->48|77->49|77->49|77->49|77->49|78->50|78->50|78->50|78->50|79->51|79->51|79->51|79->51|80->52|80->52|80->52|80->52|81->53|81->53|81->53|81->53|82->54|82->54|82->54|82->54|83->55|83->55|83->55|83->55|84->56|84->56|84->56|84->56|85->57|85->57|85->57|85->57|87->59|87->59|89->61|89->61|94->68
                    -- GENERATED --
                */
            