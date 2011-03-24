import com.google.appengine.api.datastore.KeyFactory
import com.google.appengine.api.blobstore.BlobKey
import com.google.appengine.api.datastore.Entity

log.info "update publication"

log.info "params are " + params

if (params["id"]) {
 def id = Long.parseLong(params["id"])
 try {
   def key = KeyFactory.createKey("publication", id)
   def publication = datastore.get(key)

   def blobs = blobstore.getUploadedBlobs(request)
   def blobKey1 = blobs["cover"]
   def blobKey2 = blobs["pdf"]

   response.status = 302

   publication.title = params.title
   publication.author = params.author
   publication.pageCount = params.pageCount
   publication.description = params.description

   if(blobKey1){
     publication.coverKey = blobKey1.keyString
   }

   if(blobKey2){
     publication.pdfKey = blobKey2.keyString
   }

   publication.save()   
   redirect "/publishing"

   } catch (Throwable t) {
    log.info "here is some tea. " + t
    redirect "/publishing"
   }
} else { 
   log.info "dr@t"
   redirect	"/publishing"
}
