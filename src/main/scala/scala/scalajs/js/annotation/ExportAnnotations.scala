package scala.scalajs.js.annotation

class JSExportAll extends scala.annotation.Annotation

class JSExport extends scala.annotation.Annotation {
  def this(name: String) = this()
}

class JSExportTopLevel(name: String) extends scala.annotation.Annotation
