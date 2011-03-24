import com.google.appengine.api.blobstore.BlobKey
import com.google.appengine.api.datastore.Entity

def files = blobstore.getUploadedBlobs(request)
def cover = files["cover"]
def pdf = files["pdf"]

response.status = 302

def publication = new Entity("publication")
publication.title = params.title
publication.author = params.author
publication.pageCount = params.pageCount
publication.description = params.description
publication.coverKey = cover.keyString
publication.pdfKey = pdf.keyString

publication.save()

if (cover) {
	redirect "publication/${publication.key.id}"
} else {
	redirect "/failure"
}