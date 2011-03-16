import com.google.appengine.api.blobstore.BlobKey
import com.google.appengine.api.datastore.Entity

def blobs = blobstore.getUploadedBlobs(request)
def blobKey = blobs["cover"]

response.status = 302

def publication = new Entity("publication")
publication.title = params.title
publication.author = params.author
publication.coverKey = blobKey.keyString

publication.save()

if (blobKey) {
	redirect "publication/${publication.key.id}"
} else {
	redirect "/failure"
}