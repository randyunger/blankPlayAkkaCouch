package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
	val r = net.markbeeson.akkacouch.AkkaCouchClient.read("YUMWIGOAfHLr")
	println(r)
    Ok(views.html.index("Your new application is ready."+r))
  }
  
}
