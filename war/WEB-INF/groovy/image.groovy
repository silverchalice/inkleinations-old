import com.google.appengine.api.blobstore.BlobKey

def blob = new BlobKey(params.key)
blobstore.serve blob, response