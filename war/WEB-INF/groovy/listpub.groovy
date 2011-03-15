import com.google.appengine.api.datastore.Query
import static com.google.appengine.api.datastore.FetchOptions.Builder.withLimit

try {
 def query = new Query("publication")
 query.addSort("title", Query.SortDirection.DESCENDING)
 def preparedQuery = datastore.prepare(query)
 def publications = preparedQuery.asList( withLimit(10) )

 request.setAttribute "publications", publications
forward "listpub.gtpl"
} catch (Throwable t) {
 println "here is some tea. " + t
}