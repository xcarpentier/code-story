package controllers

import play.api.mvc._

object Application extends Controller {

  def index = Action {
    implicit request =>
      request.queryString.get("q") match {
        case Some(Seq("Quelle est ton adresse email")) => Ok("mail@xavier-carpentier.fr")
        case Some(Seq("Es tu abonne a la mailing list(OUI/NON)")) => Ok("OUI")
        case Some(Seq("Es tu heureux de participer(OUI/NON)")) => Ok("OUI")
        case Some(Seq("Es tu pret a recevoir une enonce au format markdown par http post(OUI/NON)")) => Ok("OUI")
        case Some(Seq("Est ce que tu reponds toujours oui(OUI/NON)")) => Ok("NON")
        case Some(q) => BadRequest("unknown query: " + q.reduce(_ + ", " + _))
        case None => BadRequest("no query received")
      }
  }
}