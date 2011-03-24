// example routes
/*
get "/blog/@year/@month/@day/@title", forward: "/WEB-INF/groovy/blog.groovy?year=@year&month=@month&day=@day&title=@title"
get "/something", redirect: "/blog/2008/10/20/something", cache: 2.hours
get "/book/isbn/@isbn", forward: "/WEB-INF/groovy/book.groovy?isbn=@isbn", validate: { isbn ==~ /\d{9}(\d|X)/ }
*/

// routes for the blobstore service example
get "/upload",  forward: "/upload.gtpl"
get "/success", forward: "/success.gtpl"
get "/failure", forward: "/failure.gtpl"

get "/new_publication", forward: "/createpub.gtpl"
get "/publication/@id", forward: "/viewpub.groovy?id=@id"
get "/edit_publication/@id", forward: "/editpub.groovy?id=@id"
get "/pdf/@id", redirect: "/viewpdf.groovy?id=@id"
get "/publishing", forward: "/listpub.groovy"