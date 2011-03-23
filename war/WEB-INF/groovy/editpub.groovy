import com.google.appengine.api.datastore.KeyFactory

log.info "publication edit"

if (params["id"]) {
 def id = Long.parseLong(params["id"])
 try {
   def key = KeyFactory.createKey("publication", id)
   def publication = datastore.get(key)

   request.setAttribute "publication", publication

   forward "editpub.gtpl"

   } catch (Throwable t) {
    println "here is some tea. " + t
   }
} else {
 forward "index.gtpl"
}