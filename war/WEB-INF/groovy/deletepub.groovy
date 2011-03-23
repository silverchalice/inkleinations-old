import com.google.appengine.api.datastore.KeyFactory
import com.google.appengine.api.datastore.Key

log.info "Deleting publication.."

def id = Long.parseLong(params.id)
Key key = KeyFactory.createKey("publication", id)
key.delete()

redirect '/publishing'