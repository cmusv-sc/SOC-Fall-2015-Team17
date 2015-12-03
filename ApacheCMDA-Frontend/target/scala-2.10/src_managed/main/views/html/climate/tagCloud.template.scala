
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
    <link rel="stylesheet" type="text/css" href="/assets/jqcloud/jqcloud.css" />
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.js"></script>
    <script type="text/javascript" src="/assets/jqcloud/jqcloud-1.0.4.js"></script>
    <script type="text/javascript">
        var word_list = [
          """),format.raw/*10.11*/("""{"""),format.raw/*10.12*/("""text: "Lorem", weight: 13, link: "https://github.com/DukeLeNoir/jQCloud""""),format.raw/*10.84*/("""}"""),format.raw/*10.85*/(""",
          """),format.raw/*11.11*/("""{"""),format.raw/*11.12*/("""text: "Ipsum", weight: 10.5, html: """),format.raw/*11.47*/("""{"""),format.raw/*11.48*/("""title: "My Title", "class": "custom-class""""),format.raw/*11.90*/("""}"""),format.raw/*11.91*/(""", link: """),format.raw/*11.99*/("""{"""),format.raw/*11.100*/("""href: "http://jquery.com/", target: "_blank""""),format.raw/*11.144*/("""}"""),format.raw/*11.145*/("""}"""),format.raw/*11.146*/(""",
          """),format.raw/*12.11*/("""{"""),format.raw/*12.12*/("""text: "Dolor", weight: 9.4"""),format.raw/*12.38*/("""}"""),format.raw/*12.39*/(""",
          """),format.raw/*13.11*/("""{"""),format.raw/*13.12*/("""text: "Sit", weight: 8"""),format.raw/*13.34*/("""}"""),format.raw/*13.35*/(""",
          """),format.raw/*14.11*/("""{"""),format.raw/*14.12*/("""text: "Amet", weight: 6.2"""),format.raw/*14.37*/("""}"""),format.raw/*14.38*/(""",
          """),format.raw/*15.11*/("""{"""),format.raw/*15.12*/("""text: "Consectetur", weight: 5"""),format.raw/*15.42*/("""}"""),format.raw/*15.43*/(""",
          """),format.raw/*16.11*/("""{"""),format.raw/*16.12*/("""text: "Adipiscing", weight: 5"""),format.raw/*16.41*/("""}"""),format.raw/*16.42*/(""",
          """),format.raw/*17.11*/("""{"""),format.raw/*17.12*/("""text: "Elit", weight: 5"""),format.raw/*17.35*/("""}"""),format.raw/*17.36*/(""",
          """),format.raw/*18.11*/("""{"""),format.raw/*18.12*/("""text: "Nam et", weight: 5"""),format.raw/*18.37*/("""}"""),format.raw/*18.38*/(""",
          """),format.raw/*19.11*/("""{"""),format.raw/*19.12*/("""text: "Leo", weight: 4"""),format.raw/*19.34*/("""}"""),format.raw/*19.35*/(""",
          """),format.raw/*20.11*/("""{"""),format.raw/*20.12*/("""text: "Sapien", weight: 4"""),format.raw/*20.37*/("""}"""),format.raw/*20.38*/(""",
          """),format.raw/*21.11*/("""{"""),format.raw/*21.12*/("""text: "Pellentesque", weight: 3"""),format.raw/*21.43*/("""}"""),format.raw/*21.44*/(""",
          """),format.raw/*22.11*/("""{"""),format.raw/*22.12*/("""text: "habitant", weight: 3"""),format.raw/*22.39*/("""}"""),format.raw/*22.40*/(""",
          """),format.raw/*23.11*/("""{"""),format.raw/*23.12*/("""text: "morbi", weight: 3"""),format.raw/*23.36*/("""}"""),format.raw/*23.37*/(""",
          """),format.raw/*24.11*/("""{"""),format.raw/*24.12*/("""text: "tristisque", weight: 3"""),format.raw/*24.41*/("""}"""),format.raw/*24.42*/(""",
          """),format.raw/*25.11*/("""{"""),format.raw/*25.12*/("""text: "senectus", weight: 3"""),format.raw/*25.39*/("""}"""),format.raw/*25.40*/(""",
          """),format.raw/*26.11*/("""{"""),format.raw/*26.12*/("""text: "et netus", weight: 3"""),format.raw/*26.39*/("""}"""),format.raw/*26.40*/(""",
          """),format.raw/*27.11*/("""{"""),format.raw/*27.12*/("""text: "et malesuada", weight: 3"""),format.raw/*27.43*/("""}"""),format.raw/*27.44*/(""",
          """),format.raw/*28.11*/("""{"""),format.raw/*28.12*/("""text: "fames", weight: 2"""),format.raw/*28.36*/("""}"""),format.raw/*28.37*/(""",
          """),format.raw/*29.11*/("""{"""),format.raw/*29.12*/("""text: "ac turpis", weight: 2"""),format.raw/*29.40*/("""}"""),format.raw/*29.41*/(""",
          """),format.raw/*30.11*/("""{"""),format.raw/*30.12*/("""text: "egestas", weight: 2"""),format.raw/*30.38*/("""}"""),format.raw/*30.39*/(""",
          """),format.raw/*31.11*/("""{"""),format.raw/*31.12*/("""text: "Aenean", weight: 2"""),format.raw/*31.37*/("""}"""),format.raw/*31.38*/(""",
          """),format.raw/*32.11*/("""{"""),format.raw/*32.12*/("""text: "vestibulum", weight: 2"""),format.raw/*32.41*/("""}"""),format.raw/*32.42*/(""",
          """),format.raw/*33.11*/("""{"""),format.raw/*33.12*/("""text: "elit", weight: 2"""),format.raw/*33.35*/("""}"""),format.raw/*33.36*/(""",
          """),format.raw/*34.11*/("""{"""),format.raw/*34.12*/("""text: "sit amet", weight: 2"""),format.raw/*34.39*/("""}"""),format.raw/*34.40*/(""",
          """),format.raw/*35.11*/("""{"""),format.raw/*35.12*/("""text: "metus", weight: 2"""),format.raw/*35.36*/("""}"""),format.raw/*35.37*/(""",
          """),format.raw/*36.11*/("""{"""),format.raw/*36.12*/("""text: "adipiscing", weight: 2"""),format.raw/*36.41*/("""}"""),format.raw/*36.42*/(""",
          """),format.raw/*37.11*/("""{"""),format.raw/*37.12*/("""text: "ut ultrices", weight: 2"""),format.raw/*37.42*/("""}"""),format.raw/*37.43*/(""",
          """),format.raw/*38.11*/("""{"""),format.raw/*38.12*/("""text: "justo", weight: 1"""),format.raw/*38.36*/("""}"""),format.raw/*38.37*/(""",
          """),format.raw/*39.11*/("""{"""),format.raw/*39.12*/("""text: "dictum", weight: 1"""),format.raw/*39.37*/("""}"""),format.raw/*39.38*/(""",
          """),format.raw/*40.11*/("""{"""),format.raw/*40.12*/("""text: "Ut et leo", weight: 1"""),format.raw/*40.40*/("""}"""),format.raw/*40.41*/(""",
          """),format.raw/*41.11*/("""{"""),format.raw/*41.12*/("""text: "metus", weight: 1"""),format.raw/*41.36*/("""}"""),format.raw/*41.37*/(""",
          """),format.raw/*42.11*/("""{"""),format.raw/*42.12*/("""text: "at molestie", weight: 1"""),format.raw/*42.42*/("""}"""),format.raw/*42.43*/(""",
          """),format.raw/*43.11*/("""{"""),format.raw/*43.12*/("""text: "purus", weight: 1"""),format.raw/*43.36*/("""}"""),format.raw/*43.37*/(""",
          """),format.raw/*44.11*/("""{"""),format.raw/*44.12*/("""text: "Curabitur", weight: 1"""),format.raw/*44.40*/("""}"""),format.raw/*44.41*/(""",
          """),format.raw/*45.11*/("""{"""),format.raw/*45.12*/("""text: "diam", weight: 1"""),format.raw/*45.35*/("""}"""),format.raw/*45.36*/(""",
          """),format.raw/*46.11*/("""{"""),format.raw/*46.12*/("""text: "dui", weight: 1"""),format.raw/*46.34*/("""}"""),format.raw/*46.35*/(""",
          """),format.raw/*47.11*/("""{"""),format.raw/*47.12*/("""text: "ullamcorper", weight: 1"""),format.raw/*47.42*/("""}"""),format.raw/*47.43*/(""",
          """),format.raw/*48.11*/("""{"""),format.raw/*48.12*/("""text: "id vuluptate ut", weight: 1"""),format.raw/*48.46*/("""}"""),format.raw/*48.47*/(""",
          """),format.raw/*49.11*/("""{"""),format.raw/*49.12*/("""text: "mattis", weight: 1"""),format.raw/*49.37*/("""}"""),format.raw/*49.38*/(""",
          """),format.raw/*50.11*/("""{"""),format.raw/*50.12*/("""text: "et nulla", weight: 1"""),format.raw/*50.39*/("""}"""),format.raw/*50.40*/(""",
          """),format.raw/*51.11*/("""{"""),format.raw/*51.12*/("""text: "Sed", weight: 1"""),format.raw/*51.34*/("""}"""),format.raw/*51.35*/("""
        ];
        $(function() """),format.raw/*53.22*/("""{"""),format.raw/*53.23*/("""
          $("#my_favorite_latin_words").jQCloud(word_list);
        """),format.raw/*55.9*/("""}"""),format.raw/*55.10*/(""");
    </script>
  </head>
  <body>
    """),format.raw/*61.7*/("""
  <div align="center" >
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
                    DATE: Thu Dec 03 12:21:31 PST 2015
                    SOURCE: /Users/Holysoul/Desktop/SOC-Fall-2015-Team17-Lead-Runyu-Shi/ApacheCMDA-Frontend/app/views/climate/tagCloud.scala.html
                    HASH: 3934d4b7dbb37e92b61c15cf8795858aa7a11726
                    MATRIX: 866->0|1313->419|1342->420|1442->492|1471->493|1511->505|1540->506|1603->541|1632->542|1702->584|1731->585|1767->593|1797->594|1870->638|1900->639|1930->640|1970->652|1999->653|2053->679|2082->680|2122->692|2151->693|2201->715|2230->716|2270->728|2299->729|2352->754|2381->755|2421->767|2450->768|2508->798|2537->799|2577->811|2606->812|2663->841|2692->842|2732->854|2761->855|2812->878|2841->879|2881->891|2910->892|2963->917|2992->918|3032->930|3061->931|3111->953|3140->954|3180->966|3209->967|3262->992|3291->993|3331->1005|3360->1006|3419->1037|3448->1038|3488->1050|3517->1051|3572->1078|3601->1079|3641->1091|3670->1092|3722->1116|3751->1117|3791->1129|3820->1130|3877->1159|3906->1160|3946->1172|3975->1173|4030->1200|4059->1201|4099->1213|4128->1214|4183->1241|4212->1242|4252->1254|4281->1255|4340->1286|4369->1287|4409->1299|4438->1300|4490->1324|4519->1325|4559->1337|4588->1338|4644->1366|4673->1367|4713->1379|4742->1380|4796->1406|4825->1407|4865->1419|4894->1420|4947->1445|4976->1446|5016->1458|5045->1459|5102->1488|5131->1489|5171->1501|5200->1502|5251->1525|5280->1526|5320->1538|5349->1539|5404->1566|5433->1567|5473->1579|5502->1580|5554->1604|5583->1605|5623->1617|5652->1618|5709->1647|5738->1648|5778->1660|5807->1661|5865->1691|5894->1692|5934->1704|5963->1705|6015->1729|6044->1730|6084->1742|6113->1743|6166->1768|6195->1769|6235->1781|6264->1782|6320->1810|6349->1811|6389->1823|6418->1824|6470->1848|6499->1849|6539->1861|6568->1862|6626->1892|6655->1893|6695->1905|6724->1906|6776->1930|6805->1931|6845->1943|6874->1944|6930->1972|6959->1973|6999->1985|7028->1986|7079->2009|7108->2010|7148->2022|7177->2023|7227->2045|7256->2046|7296->2058|7325->2059|7383->2089|7412->2090|7452->2102|7481->2103|7543->2137|7572->2138|7612->2150|7641->2151|7694->2176|7723->2177|7763->2189|7792->2190|7847->2217|7876->2218|7916->2230|7945->2231|7995->2253|8024->2254|8085->2287|8114->2288|8210->2357|8239->2358|8306->2430
                    LINES: 29->1|38->10|38->10|38->10|38->10|39->11|39->11|39->11|39->11|39->11|39->11|39->11|39->11|39->11|39->11|39->11|40->12|40->12|40->12|40->12|41->13|41->13|41->13|41->13|42->14|42->14|42->14|42->14|43->15|43->15|43->15|43->15|44->16|44->16|44->16|44->16|45->17|45->17|45->17|45->17|46->18|46->18|46->18|46->18|47->19|47->19|47->19|47->19|48->20|48->20|48->20|48->20|49->21|49->21|49->21|49->21|50->22|50->22|50->22|50->22|51->23|51->23|51->23|51->23|52->24|52->24|52->24|52->24|53->25|53->25|53->25|53->25|54->26|54->26|54->26|54->26|55->27|55->27|55->27|55->27|56->28|56->28|56->28|56->28|57->29|57->29|57->29|57->29|58->30|58->30|58->30|58->30|59->31|59->31|59->31|59->31|60->32|60->32|60->32|60->32|61->33|61->33|61->33|61->33|62->34|62->34|62->34|62->34|63->35|63->35|63->35|63->35|64->36|64->36|64->36|64->36|65->37|65->37|65->37|65->37|66->38|66->38|66->38|66->38|67->39|67->39|67->39|67->39|68->40|68->40|68->40|68->40|69->41|69->41|69->41|69->41|70->42|70->42|70->42|70->42|71->43|71->43|71->43|71->43|72->44|72->44|72->44|72->44|73->45|73->45|73->45|73->45|74->46|74->46|74->46|74->46|75->47|75->47|75->47|75->47|76->48|76->48|76->48|76->48|77->49|77->49|77->49|77->49|78->50|78->50|78->50|78->50|79->51|79->51|79->51|79->51|81->53|81->53|83->55|83->55|87->61
                    -- GENERATED --
                */
            