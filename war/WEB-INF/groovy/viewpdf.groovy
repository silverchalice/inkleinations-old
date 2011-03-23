import com.google.appengine.api.datastore.KeyFactory
import com.google.appengine.api.blobstore.BlobKey

def id = Long.parseLong(params["id"])
try {
  def key = KeyFactory.createKey("publication", id)
  def publication = datastore.get(key)

  log.info "the publication.pdfKey was " + publication.pdfKey

  def blob = new BlobKey(publication.pdfKey)

  if(blob){
	log.info "there was a blob"	
  } else {
    log.info "there was no blob"	
  }

  response.contentType = "PDF"
  def fn = publication.title.replaceAll(" ", "_") + ".pdf"
  response.setHeader("Content-disposition", "attachment; filename=${fn}")
  blob.serve response

} catch (Throwable t) {
    println "here is some tea. " + t
}