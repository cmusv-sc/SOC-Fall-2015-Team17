// @SOURCE:/Users/zmhbh/Desktop/team/SOC-Fall-2015/ApacheCMDA-Frontend/conf/routes
// @HASH:86443e11fe0ef3e22a1e832e69dd313c09fb9fa4
// @DATE:Thu Nov 05 13:18:32 PST 2015


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_ClimateServiceController_home0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home"))))
        

// @LINE:7
private[this] lazy val controllers_ClimateServiceController_home1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:11
private[this] lazy val controllers_BugReportController_reports2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bugs"))))
        

// @LINE:12
private[this] lazy val controllers_BugReportController_newReport3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newReport"))))
        

// @LINE:13
private[this] lazy val controllers_BugReportController_list4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bug/list"))))
        

// @LINE:14
private[this] lazy val controllers_BugReportController_deleteReport5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete/report"))))
        

// @LINE:15
private[this] lazy val controllers_BugReportController_solveReport6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("solve/report"))))
        

// @LINE:18
private[this] lazy val controllers_AboutusController_aboutUs7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutus"))))
        

// @LINE:19
private[this] lazy val controllers_AboutusController_aboutProject8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutProject"))))
        

// @LINE:22
private[this] lazy val controllers_ClimateServiceController_home9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate"))))
        

// @LINE:23
private[this] lazy val controllers_ClimateServiceController_tutorial10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/tutorial"))))
        

// @LINE:24
private[this] lazy val controllers_ClimateServiceController_climateServices11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/climateServices"))))
        

// @LINE:25
private[this] lazy val controllers_ClimateServiceController_mostRecentlyAddedClimateServices12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mostRecentlyAddedClimateServices"))))
        

// @LINE:26
private[this] lazy val controllers_ClimateServiceController_mostRecentlyUsedClimateServices13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mostRecentlyUsedClimateServices"))))
        

// @LINE:27
private[this] lazy val controllers_ClimateServiceController_mostPopularClimateServices14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mostPopularClimateServices"))))
        

// @LINE:28
private[this] lazy val controllers_ClimateServiceController_newClimateService15 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/new/climateServices"))))
        

// @LINE:29
private[this] lazy val controllers_ClimateServiceController_deleteClimateService16 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/delete/climateServices"))))
        

// @LINE:30
private[this] lazy val controllers_ClimateServiceController_downloadClimateService17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/download/climateServices"))))
        

// @LINE:31
private[this] lazy val controllers_ClimateServiceController_editClimateService18 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/edit/climateServices"))))
        

// @LINE:32
private[this] lazy val controllers_ClimateServiceController_addClimateServices19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/new/climateServices"))))
        

// @LINE:33
private[this] lazy val controllers_ClimateServiceController_oneService20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/oneService"))))
        

// @LINE:35
private[this] lazy val controllers_TagController_home21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag"))))
        

// @LINE:36
private[this] lazy val controllers_TagController_tutorial22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/tutorial"))))
        

// @LINE:37
private[this] lazy val controllers_TagController_climateServices23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/climateServices"))))
        

// @LINE:38
private[this] lazy val controllers_TagController_mostRecentlyAddedClimateServices24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/mostRecentlyAddedClimateServices"))))
        

// @LINE:39
private[this] lazy val controllers_TagController_mostRecentlyUsedClimateServices25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/mostRecentlyUsedClimateServices"))))
        

// @LINE:40
private[this] lazy val controllers_TagController_mostPopularClimateServices26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/mostPopularClimateServices"))))
        

// @LINE:41
private[this] lazy val controllers_TagController_newClimateService27 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/new/climateServices"))))
        

// @LINE:42
private[this] lazy val controllers_TagController_deleteClimateService28 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/delete/climateServices"))))
        

// @LINE:43
private[this] lazy val controllers_TagController_downloadClimateService29 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/download/climateServices"))))
        

// @LINE:44
private[this] lazy val controllers_TagController_editClimateService30 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/edit/climateServices"))))
        

// @LINE:45
private[this] lazy val controllers_TagController_addClimateServices31 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/new/climateServices"))))
        

// @LINE:46
private[this] lazy val controllers_TagController_oneService32 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/oneService"))))
        

// @LINE:49
private[this] lazy val controllers_DatasetController_datasetList33 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/datasets"))))
        

// @LINE:50
private[this] lazy val controllers_DatasetController_searchDataset34 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/searchDataSet"))))
        

// @LINE:51
private[this] lazy val controllers_DatasetController_getSearchResult35 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/getSearchResult"))))
        

// @LINE:54
private[this] lazy val controllers_Assets_at36 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home""","""controllers.ClimateServiceController.home(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix,"""controllers.ClimateServiceController.home(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugs""","""controllers.BugReportController.reports()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newReport""","""controllers.BugReportController.newReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bug/list""","""controllers.BugReportController.list()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete/report""","""controllers.BugReportController.deleteReport()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """solve/report""","""controllers.BugReportController.solveReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutus""","""controllers.AboutusController.aboutUs()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutProject""","""controllers.AboutusController.aboutProject()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate""","""controllers.ClimateServiceController.home(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/tutorial""","""controllers.ClimateServiceController.tutorial()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/climateServices""","""controllers.ClimateServiceController.climateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mostRecentlyAddedClimateServices""","""controllers.ClimateServiceController.mostRecentlyAddedClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mostRecentlyUsedClimateServices""","""controllers.ClimateServiceController.mostRecentlyUsedClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mostPopularClimateServices""","""controllers.ClimateServiceController.mostPopularClimateServices()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/new/climateServices""","""controllers.ClimateServiceController.newClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/delete/climateServices""","""controllers.ClimateServiceController.deleteClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/download/climateServices""","""controllers.ClimateServiceController.downloadClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/edit/climateServices""","""controllers.ClimateServiceController.editClimateService()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/new/climateServices""","""controllers.ClimateServiceController.addClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/oneService""","""controllers.ClimateServiceController.oneService(url:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag""","""controllers.TagController.home(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/tutorial""","""controllers.TagController.tutorial()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/climateServices""","""controllers.TagController.climateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/mostRecentlyAddedClimateServices""","""controllers.TagController.mostRecentlyAddedClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/mostRecentlyUsedClimateServices""","""controllers.TagController.mostRecentlyUsedClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/mostPopularClimateServices""","""controllers.TagController.mostPopularClimateServices()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/new/climateServices""","""controllers.TagController.newClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/delete/climateServices""","""controllers.TagController.deleteClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/download/climateServices""","""controllers.TagController.downloadClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/edit/climateServices""","""controllers.TagController.editClimateService()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/new/climateServices""","""controllers.TagController.addClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/oneService""","""controllers.TagController.oneService(url:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/datasets""","""controllers.DatasetController.datasetList()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/searchDataSet""","""controllers.DatasetController.searchDataset()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/getSearchResult""","""controllers.DatasetController.getSearchResult()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_ClimateServiceController_home0(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]),"GET", """ Home page""", Routes.prefix + """home"""))
   }
}
        

// @LINE:7
case controllers_ClimateServiceController_home1(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:11
case controllers_BugReportController_reports2(params) => {
   call { 
        invokeHandler(controllers.BugReportController.reports(), HandlerDef(this, "controllers.BugReportController", "reports", Nil,"GET", """ BugReporting""", Routes.prefix + """bugs"""))
   }
}
        

// @LINE:12
case controllers_BugReportController_newReport3(params) => {
   call { 
        invokeHandler(controllers.BugReportController.newReport(), HandlerDef(this, "controllers.BugReportController", "newReport", Nil,"GET", """""", Routes.prefix + """newReport"""))
   }
}
        

// @LINE:13
case controllers_BugReportController_list4(params) => {
   call { 
        invokeHandler(controllers.BugReportController.list(), HandlerDef(this, "controllers.BugReportController", "list", Nil,"GET", """""", Routes.prefix + """bug/list"""))
   }
}
        

// @LINE:14
case controllers_BugReportController_deleteReport5(params) => {
   call { 
        invokeHandler(controllers.BugReportController.deleteReport(), HandlerDef(this, "controllers.BugReportController", "deleteReport", Nil,"POST", """""", Routes.prefix + """delete/report"""))
   }
}
        

// @LINE:15
case controllers_BugReportController_solveReport6(params) => {
   call { 
        invokeHandler(controllers.BugReportController.solveReport(), HandlerDef(this, "controllers.BugReportController", "solveReport", Nil,"POST", """""", Routes.prefix + """solve/report"""))
   }
}
        

// @LINE:18
case controllers_AboutusController_aboutUs7(params) => {
   call { 
        invokeHandler(controllers.AboutusController.aboutUs(), HandlerDef(this, "controllers.AboutusController", "aboutUs", Nil,"GET", """ About Us""", Routes.prefix + """aboutus"""))
   }
}
        

// @LINE:19
case controllers_AboutusController_aboutProject8(params) => {
   call { 
        invokeHandler(controllers.AboutusController.aboutProject(), HandlerDef(this, "controllers.AboutusController", "aboutProject", Nil,"GET", """""", Routes.prefix + """aboutProject"""))
   }
}
        

// @LINE:22
case controllers_ClimateServiceController_home9(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]),"GET", """ Climate Model""", Routes.prefix + """climate"""))
   }
}
        

// @LINE:23
case controllers_ClimateServiceController_tutorial10(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.tutorial(), HandlerDef(this, "controllers.ClimateServiceController", "tutorial", Nil,"GET", """""", Routes.prefix + """climate/tutorial"""))
   }
}
        

// @LINE:24
case controllers_ClimateServiceController_climateServices11(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.climateServices(), HandlerDef(this, "controllers.ClimateServiceController", "climateServices", Nil,"GET", """""", Routes.prefix + """climate/climateServices"""))
   }
}
        

// @LINE:25
case controllers_ClimateServiceController_mostRecentlyAddedClimateServices12(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.mostRecentlyAddedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyAddedClimateServices", Nil,"GET", """""", Routes.prefix + """climate/mostRecentlyAddedClimateServices"""))
   }
}
        

// @LINE:26
case controllers_ClimateServiceController_mostRecentlyUsedClimateServices13(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.mostRecentlyUsedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyUsedClimateServices", Nil,"GET", """""", Routes.prefix + """climate/mostRecentlyUsedClimateServices"""))
   }
}
        

// @LINE:27
case controllers_ClimateServiceController_mostPopularClimateServices14(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.mostPopularClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostPopularClimateServices", Nil,"GET", """""", Routes.prefix + """climate/mostPopularClimateServices"""))
   }
}
        

// @LINE:28
case controllers_ClimateServiceController_newClimateService15(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.newClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "newClimateService", Nil,"POST", """""", Routes.prefix + """climate/new/climateServices"""))
   }
}
        

// @LINE:29
case controllers_ClimateServiceController_deleteClimateService16(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.deleteClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "deleteClimateService", Nil,"POST", """""", Routes.prefix + """climate/delete/climateServices"""))
   }
}
        

// @LINE:30
case controllers_ClimateServiceController_downloadClimateService17(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.downloadClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "downloadClimateService", Nil,"POST", """""", Routes.prefix + """climate/download/climateServices"""))
   }
}
        

// @LINE:31
case controllers_ClimateServiceController_editClimateService18(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.editClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "editClimateService", Nil,"POST", """""", Routes.prefix + """climate/edit/climateServices"""))
   }
}
        

// @LINE:32
case controllers_ClimateServiceController_addClimateServices19(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.addClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "addClimateServices", Nil,"GET", """""", Routes.prefix + """climate/new/climateServices"""))
   }
}
        

// @LINE:33
case controllers_ClimateServiceController_oneService20(params) => {
   call(params.fromQuery[String]("url", Some(null))) { (url) =>
        invokeHandler(controllers.ClimateServiceController.oneService(url), HandlerDef(this, "controllers.ClimateServiceController", "oneService", Seq(classOf[String]),"GET", """""", Routes.prefix + """climate/oneService"""))
   }
}
        

// @LINE:35
case controllers_TagController_home21(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.TagController.home(email, vfile, dataset), HandlerDef(this, "controllers.TagController", "home", Seq(classOf[String], classOf[String], classOf[String]),"GET", """ Tag Model""", Routes.prefix + """tag"""))
   }
}
        

// @LINE:36
case controllers_TagController_tutorial22(params) => {
   call { 
        invokeHandler(controllers.TagController.tutorial(), HandlerDef(this, "controllers.TagController", "tutorial", Nil,"GET", """""", Routes.prefix + """tag/tutorial"""))
   }
}
        

// @LINE:37
case controllers_TagController_climateServices23(params) => {
   call { 
        invokeHandler(controllers.TagController.climateServices(), HandlerDef(this, "controllers.TagController", "climateServices", Nil,"GET", """""", Routes.prefix + """tag/climateServices"""))
   }
}
        

// @LINE:38
case controllers_TagController_mostRecentlyAddedClimateServices24(params) => {
   call { 
        invokeHandler(controllers.TagController.mostRecentlyAddedClimateServices(), HandlerDef(this, "controllers.TagController", "mostRecentlyAddedClimateServices", Nil,"GET", """""", Routes.prefix + """tag/mostRecentlyAddedClimateServices"""))
   }
}
        

// @LINE:39
case controllers_TagController_mostRecentlyUsedClimateServices25(params) => {
   call { 
        invokeHandler(controllers.TagController.mostRecentlyUsedClimateServices(), HandlerDef(this, "controllers.TagController", "mostRecentlyUsedClimateServices", Nil,"GET", """""", Routes.prefix + """tag/mostRecentlyUsedClimateServices"""))
   }
}
        

// @LINE:40
case controllers_TagController_mostPopularClimateServices26(params) => {
   call { 
        invokeHandler(controllers.TagController.mostPopularClimateServices(), HandlerDef(this, "controllers.TagController", "mostPopularClimateServices", Nil,"GET", """""", Routes.prefix + """tag/mostPopularClimateServices"""))
   }
}
        

// @LINE:41
case controllers_TagController_newClimateService27(params) => {
   call { 
        invokeHandler(controllers.TagController.newClimateService(), HandlerDef(this, "controllers.TagController", "newClimateService", Nil,"POST", """""", Routes.prefix + """tag/new/climateServices"""))
   }
}
        

// @LINE:42
case controllers_TagController_deleteClimateService28(params) => {
   call { 
        invokeHandler(controllers.TagController.deleteClimateService(), HandlerDef(this, "controllers.TagController", "deleteClimateService", Nil,"POST", """""", Routes.prefix + """tag/delete/climateServices"""))
   }
}
        

// @LINE:43
case controllers_TagController_downloadClimateService29(params) => {
   call { 
        invokeHandler(controllers.TagController.downloadClimateService(), HandlerDef(this, "controllers.TagController", "downloadClimateService", Nil,"POST", """""", Routes.prefix + """tag/download/climateServices"""))
   }
}
        

// @LINE:44
case controllers_TagController_editClimateService30(params) => {
   call { 
        invokeHandler(controllers.TagController.editClimateService(), HandlerDef(this, "controllers.TagController", "editClimateService", Nil,"POST", """""", Routes.prefix + """tag/edit/climateServices"""))
   }
}
        

// @LINE:45
case controllers_TagController_addClimateServices31(params) => {
   call { 
        invokeHandler(controllers.TagController.addClimateServices(), HandlerDef(this, "controllers.TagController", "addClimateServices", Nil,"GET", """""", Routes.prefix + """tag/new/climateServices"""))
   }
}
        

// @LINE:46
case controllers_TagController_oneService32(params) => {
   call(params.fromQuery[String]("url", Some(null))) { (url) =>
        invokeHandler(controllers.TagController.oneService(url), HandlerDef(this, "controllers.TagController", "oneService", Seq(classOf[String]),"GET", """""", Routes.prefix + """tag/oneService"""))
   }
}
        

// @LINE:49
case controllers_DatasetController_datasetList33(params) => {
   call { 
        invokeHandler(controllers.DatasetController.datasetList(), HandlerDef(this, "controllers.DatasetController", "datasetList", Nil,"GET", """Keyword search""", Routes.prefix + """climate/datasets"""))
   }
}
        

// @LINE:50
case controllers_DatasetController_searchDataset34(params) => {
   call { 
        invokeHandler(controllers.DatasetController.searchDataset(), HandlerDef(this, "controllers.DatasetController", "searchDataset", Nil,"GET", """""", Routes.prefix + """climate/searchDataSet"""))
   }
}
        

// @LINE:51
case controllers_DatasetController_getSearchResult35(params) => {
   call { 
        invokeHandler(controllers.DatasetController.getSearchResult(), HandlerDef(this, "controllers.DatasetController", "getSearchResult", Nil,"GET", """""", Routes.prefix + """climate/getSearchResult"""))
   }
}
        

// @LINE:54
case controllers_Assets_at36(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     