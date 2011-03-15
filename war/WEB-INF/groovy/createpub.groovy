import com.google.appengine.api.datastore.Entity

def publication = new Entity("publication")
publication.title = params.title
publication.author = params.author

publication.save()

redirect "publication/${publication.key.id}"