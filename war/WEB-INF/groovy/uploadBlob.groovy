import com.google.appengine.api.blobstore.BlobKey
import com.google.appengine.api.datastore.Entity

def blobs = blobstore.getUploadedBlobs(request)
def blobKey1 = blobs["cover"]
def blobKey2 = blobs["pdf"]

response.status = 302

def publication = new Entity("publication")
publication.title = params.title
publication.author = params.author
publication.coverKey = blobKey1.keyString
publication.pdfKey = blobKey2.keyString

publication.save()

if (blobKey1) {
	redirect "publication/${publication.key.id}"
} else {
	redirect "/failure"
}