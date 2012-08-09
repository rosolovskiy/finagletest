import com.twitter.finagle.Service
import com.twitter.finagle.builder.ServerBuilder
import com.twitter.finagle.http.Http
import com.twitter.util.Future
import java.net.InetSocketAddress
import org.jboss.netty.handler.codec.http._

object Server extends Service[HttpRequest, HttpResponse] with App {
  def apply(req: HttpRequest) = {
    val res = new DefaultHttpResponse(req.getProtocolVersion(), HttpResponseStatus.OK)
    Future.value(res)
  }

  ServerBuilder()
    .name("httpd")
    .codec(Http())
    .bindTo(new InetSocketAddress(8080))
    .build(this)
}
